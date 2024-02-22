package leetcodeeveryday;

/*Given an m x n binary matrix mat, return the number of special positions in mat.
 * A position (i, j) is called special if mat[i][j] == 1 and all other elements 
 * in row i and column j are 0 (rows and columns are 0-indexed).
 * Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
 * Output: 1
 * Explanation: (1, 2) is a special position
 * because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.*/
public class SpecialPositioninBinaryMatrix {

	public static void main(String[] args) {
		SpecialPositioninBinaryMatrix obj = new SpecialPositioninBinaryMatrix();
		int[][] arr = { { 0, 0 }, { 0, 0 }, { 1, 0 } };
		System.out.println(obj.numSpecial(arr));
	}

	public int numSpecial(int[][] mat) {
		int ans = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) {
					int topToBottom = 0;
					int rightToLeft = 0;
					for (int tb = 0; tb < mat.length; tb++) {
						topToBottom += mat[tb][j];
					}
					for (int lr = 0; lr < mat[0].length; lr++) {
						rightToLeft += mat[i][lr];
					}
					if (topToBottom == 1 && rightToLeft == 1) {
						ans++;
					}
				}
			}
		}
		return ans;
	}

}
