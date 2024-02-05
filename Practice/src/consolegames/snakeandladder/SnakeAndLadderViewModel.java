package consolegames.snakeandladder;

import consolegames.snakeandladder.dto.Cell;
import consolegames.snakeandladder.dto.Player;

public class SnakeAndLadderViewModel {
	SnakeAndLadderView slView;

	public SnakeAndLadderViewModel(SnakeAndLadderView snakeAndLadderView) {
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
						player.setCurrentPosition(player.getCurrentPosition()-result);
						slView.normalMove(player, result);
						return;
					}

				}
			}
		}

	}

}
