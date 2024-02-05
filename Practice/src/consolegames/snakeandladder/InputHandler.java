package consolegames.snakeandladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import consolegames.snakeandladder.dto.Cell;
import consolegames.snakeandladder.dto.Player;

public class InputHandler {
	Scanner scan = new Scanner(System.in);

	Cell[][] getBoard() {
		System.out.print("Enter Dimension [Even]: ");
		int n = scan.nextInt();
		int[][] matrix = new int[n][n];
		int number = 1;
		int temp = 0;
		for (int i = n - 1; i >= 0; i--) {
			temp = number + (n - 1);
			for (int j = 0; j < n; j++) {
				if (i % 2 != 0)
					matrix[i][j] = number++;
				else {
					matrix[i][j] = temp--;
					number++;
				}
			}
		}
		display(matrix);
		
		
		return createBoard(n);
	}

	private Cell[][] createBoard(int n) {
		Cell[][] board=new Cell[n][n];
		int number = 1;
		int temp = 0;
		for (int i = n - 1; i >= 0; i--) {
			temp = number + (n - 1);
			for (int j = 0; j < n; j++) {
				Cell cell=new Cell();
				if (i % 2 != 0) {
					cell.setCellName(number+"");
					cell.setHead(number);
					cell.setTail(number);
					 board[i][j]=cell;	 
				number++;
				}
				else {
					cell.setCellName(temp+"");
					cell.setHead(temp);
					cell.setTail(temp);
					 board[i][j]=cell;	
					temp--;
					number++;
				}
			}
		}
		setSnakesInBoard(board);
		setLaddersInBoard(board);
		return board;
	}

	private void setLaddersInBoard(Cell[][] board) {
		int position=0,i,j,k,bLen=board.length;
		int[][]ladders=getLadders();
		for( i=0;i<ladders.length;i++) {
			position=ladders[i][0];
			for(j=0;j<bLen;j++) {
				for(k=0;k<bLen;k++) {
					if(board[j][k].getHead()==position) {
						board[j][k].setCellName("#");
						board[j][k].setHead(position);
						board[j][k].setTail(ladders[i][1]);
					}
				}
			}
		}
		
	}

	private void setSnakesInBoard(Cell[][] board) {
		int position=0,i,j,k,bLen=board.length;
		int[][]snakes=getSnakes();
		for( i=0;i<snakes.length;i++) {
			position=snakes[i][0];
			for(j=0;j<bLen;j++) {
				for(k=0;k<bLen;k++) {
					if(board[j][k].getHead()==position) {
						board[j][k].setCellName("$");
						board[j][k].setHead(position);
						board[j][k].setTail(snakes[i][1]);
					}
				}
			}
		}
		
	}

	int[][] getSnakes() {
		System.out.print("Enter Number of Snakes : ");
		int snakes = scan.nextInt();
		int[][] snakeArr = new int[snakes][2];
		for (int i = 0; i < snakes; i++) {
			System.out.print(" Snake "+(i + 1)+" Head  : ");
			snakeArr[i][0] = scan.nextInt();
			System.out.print( " Snake "+(i + 1) + " Tail  : ");
			snakeArr[i][1] = scan.nextInt();

		}
		return snakeArr;
	}

	int[][] getLadders() {
		System.out.print("Enter Number of Ladders : ");
		int ladders = scan.nextInt();
		int[][] ladderArr = new int[ladders][2];
		for (int i = 0; i < ladders; i++) {
			System.out.print(  "Ladder - "+(i + 1) + " bottom  : ");
			ladderArr[i][0] = scan.nextInt();
			System.out.print("Ladder - "+(i + 1) +" top : ");
			ladderArr[i][1] = scan.nextInt();

		}
		return ladderArr;
	}

	static int dice() {
		Random ran = new Random();
		int n = ran.nextInt(7);
		return n;
	}

	List<Player> players() {
		List<Player> list = new ArrayList<>();
		System.out.print("Enter Number of players : ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			Player player = new Player();
			System.out.print(" Enter " + (i + 1) + " player Name : ");
			player.setPlayerName(scan.next());
			list.add(player);
		}
		return list;
	}
	void display(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.printf("%3d",mat[i][j]);
			}
			System.out.println();
		}
	}
}
