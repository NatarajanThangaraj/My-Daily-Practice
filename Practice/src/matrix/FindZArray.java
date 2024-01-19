package matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindZArray {

	public static void main(String[] args) {
		FindZArray z = new FindZArray();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter x axis :");
		int x =scan.nextInt();
		System.out.print("Enter y axis :");
		int y =scan.nextInt();
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{13,14,15,16} };
		System.out.println("The answer is : " + z.getZlist(arr, x, y));
	}

	private List<Integer> getZlist(int[][] matrix, int x, int y) {
		List<Integer> ans = new ArrayList<>();
		while (y < matrix[0].length) {

			ans.add(matrix[x][y]);
			y++;
		}
		while (x < matrix.length) {
			ans.add(matrix[x++][--y]);

		}
		--x;
		while (y < matrix[0].length) {
			ans.add(matrix[x][y++]);
		}
		return ans;

	}

}
