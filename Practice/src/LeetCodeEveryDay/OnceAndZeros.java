package LeetCodeEveryDay;

import java.util.Arrays;

public class OnceAndZeros {

	public static void main(String[] args) {
		OnceAndZeros obj = new OnceAndZeros();
		int[][] arr = { { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] arr1 = obj.onesMinusZeros(arr);
		System.out.print("The answer is : ");
		for (int[] x : arr1) {
			System.out.print(Arrays.toString(x)+" ");
		}
	}

	public int[][] onesMinusZeros(int[][] grid) {
		int[] rows = new int[grid.length];
		int[] cols = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			int rowOnce = 0;
			for (int j = 0; j < grid[0].length; j++) {
				rowOnce += grid[i][j];
			}
			rows[i] = rowOnce;
		}
		// System.out.println(Arrays.toString(rows));
		for (int i = 0; i < grid[0].length; i++) {
			int colOnce = 0;
			for (int j = 0; j < grid.length; j++) {
				colOnce += grid[j][i];
			}
			cols[i] = colOnce;
		}
		// System.out.println(Arrays.toString(cols));
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = (rows[i] + cols[j]) - ((grid[0].length - rows[i]) + (grid.length - cols[j]));
			}
		}

		return grid;
	}

}
