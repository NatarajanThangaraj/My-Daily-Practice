package consolegames.snakeandladder;

import java.util.List;

import consolegames.snakeandladder.dto.Cell;
import consolegames.snakeandladder.dto.Player;

public class SnakeAndLadderView {
	SnakeAndLadderViewModel slViewModel;
	Cell[][] board;
	List<Player> playerList;

	SnakeAndLadderView() {
		InputHandler input = new InputHandler();
		slViewModel = new SnakeAndLadderViewModel(this);
		board = input.getBoard();
		display(board);
		playerList = input.players();
	}

	void letsStart() {
		Player player;
		int destination = board.length * board.length;
		System.out.println("\n\t\t LETS PLAY ! \t\t\n");
		outer: while (true) {
			for (int i = 0; i < playerList.size(); i++) {
				player = playerList.get(i);
				int result = InputHandler.dice();
				if ((player.getCurrentPosition() + result) > destination) {
					continue;
				} else {
					slViewModel.checkQuickAction(board, player, result);
				}
				if (player.getCurrentPosition() == destination) {
					System.out.println(" congradulations !!!  " + player.getPlayerName() + " Won the Game ");
					break outer;
				}
				try {
					System.out.println(" DICE ROLLING ...\n");
					Thread.sleep(5000);
				} catch (InterruptedException e) {

				}

			}
		}
	}

	private void display(Cell[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.printf("%6s", mat[i][j].getCellName());
			}
			System.out.println("\n\n");
		}
	}

	void snakeBite(Player player, int move) {
		System.out.println(" ***  " + player.getPlayerName() + " rolled  " + move + " and he was bitten by Snake "
				+ ". He moves " + player.getPrev() + " -> " + player.getCurrentPosition() + " *** \n");
	}

	void ladderClimb(Player player, int move) {
		System.out.println(" ^^^  " + player.getPlayerName() + " rolled " + move + " and he was Climbed the stair "
				+ ". He moves " + player.getPrev() + " -> " + player.getCurrentPosition() + " ^^^ \n");
	}

	void normalMove(Player player, int move) {
		System.out.println("   " + player.getPlayerName() + "  rolled  " + move + " and moves " + player.getPrev()
				+ " -> " + player.getCurrentPosition() + " \n");
	}

	public static void main(String[] args) {
		SnakeAndLadderView obj = new SnakeAndLadderView();
		obj.letsStart();
	}

}
