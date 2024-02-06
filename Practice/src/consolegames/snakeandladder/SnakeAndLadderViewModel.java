package consolegames.snakeandladder;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import consolegames.snakeandladder.dto.Cell;
import consolegames.snakeandladder.dto.Player;

public class SnakeAndLadderViewModel {
	SnakeAndLadderView slView;
	private Cell[][] board;
	Queue<Cell> queue = new LinkedList<>();
	int movesLeftInBoard = 1, nextMoves = 0, destination;
	boolean[] visited;

	public SnakeAndLadderViewModel(SnakeAndLadderView snakeAndLadderView, Cell[][] board) {
		this.board = board;
		this.destination = board.length * board.length;
		visited = new boolean[destination+1];
		System.out.println(board);
		slView = snakeAndLadderView;

	}

	public void checkQuickAction(Cell[][] board, Player player, int result) {
		int row, col, updatedPosition, len = board.length;
		for (row = 0; row < len; row++) {
			for (col = 0; col < len; col++) {
				updatedPosition = player.getCurrentPosition() + result;
				if (board[row][col].getHead() == updatedPosition) {
					player.setPrev(updatedPosition);
					player.setCurrentPosition(board[row][col].getTail());
					if (board[row][col].getCellName().equals("$")) {
						slView.snakeBite(player, result);
						return;
					} else if (board[row][col].getCellName().equals("#")) {
						slView.ladderClimb(player, result);
						return;
					} else {
						player.setPrev(player.getCurrentPosition() - result);
						slView.normalMove(player, result);
						return;
					}

				}
			}
		}

	}

	public void selectedFeature(int select) {
		switch (select) {
		case 1 -> slView.startToPlay();
		case 2 -> slView.findMinRoll();

		}

	}

	public int breadthFirstSearch(Cell[][] board) {
		int moveCount = 0, position = 0;
		destination = board.length * board.length;
		Cell eachCell = board[board.length - 1][0];
		queue.add(eachCell);
		position = eachCell.getTail();
		visited[position] = true;
		while (!queue.isEmpty()) {
			eachCell = queue.remove();
			position = eachCell.getTail();
			if (position == destination) {
				return moveCount;
			}
			findNextMoves(position);
			movesLeftInBoard--;
			if (movesLeftInBoard == 0) {
				movesLeftInBoard = nextMoves;
				nextMoves = 0;
				moveCount++;
			}
		}
		return 0;

	}

	private void findNextMoves(int position) {
		int currentPosition;
		for (int i = 1; i < 7; i++) {
			currentPosition = position + i;
			if (currentPosition > destination)
				break;
			Cell pointingCell = getCell(currentPosition);
			if (pointingCell.getCellName().equals("#")) {
				pointingCell = getCell(pointingCell.getTail());
			}
			if (pointingCell.getCellName().equals("$")) {
				continue;
			}
			queue.add(pointingCell);
			visited[currentPosition] = true;
			nextMoves++;
		}

	}

	private Cell getCell(int currentPosition) {
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j].getHead() == currentPosition) {
					return board[i][j];
				}
			}
		}
		return null;
	}

}
