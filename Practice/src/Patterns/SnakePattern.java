package Patterns;

public class SnakePattern {

	public static void main(String[] args) {
		SnakePattern snake = new SnakePattern();
		int row = 4;
		int col = 5;
		snake.pattern(row, col);

	}

	private void pattern(int row, int col) {
		int num = 0;
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (i % 2 == 0)
					System.out.printf("%3d", (++num));
				else {
					System.out.printf("%3d", (num--));
				}
				if (j == row - 1) {
					num = num + row;
				}
			}
			System.out.println();
		}

	}

}
