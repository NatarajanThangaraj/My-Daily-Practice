package zoho_repeated_questions.gfg;

/*
 * The problem is to count all the possible paths from top left to bottom right of an MxN matrix with the constraints that from each cell you can either move to right or down.

Return answer modulo 109+7.

Example 1:

Input:
M = 3 and N = 3
Output: 6
Explanation:
Let the given input 3*3 matrix is filled 
as such:
A B C
D E F
G H I
The possible paths which exists to reach 
'I' from 'A' following above conditions 
are as follows:ABCFI, ABEHI, ADGHI, ADEFI, 
ADEHI, ABEFI*/
public class NumberOfPaths {

	public static void main(String[] args) {
		int m = 3, n = 3;
		System.out.println("output : " + numberOfPaths(m, n));

	}

	static long numberOfPaths(int m, int n) {
		int[] matrix = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			matrix[i] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (j == 0)
					matrix[j] = matrix[j] + 1;
				else {
					matrix[j] = matrix[j - 1] + matrix[j];
				}

			}
		}

		return matrix[n - 2];
	}
}
