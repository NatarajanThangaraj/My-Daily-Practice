package matrix;

import java.util.Arrays;

public class SortMatrixDiagonally {

	public static void main(String[] args) {
		SortMatrixDiagonally obj = new SortMatrixDiagonally();
		int[][] matrix = { { 1, 2, 3, 4 },
				           { 5, 6, 7, 8 },
				           { 8, 7, 6, 5 },
				           { 4, 2, 3, 4 },
				           { 5, 1, 6, 2 } };
		int[][] ans = obj.diagonalSort(matrix);
		for (int[] arr : ans) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private int[][] diagonalSort(int[][] matrix) {
		int i,j,k;
		for(i=0;i<matrix.length;i++) {
			for(j=0;j<matrix.length-1;j++) {
				for( k=0;k<matrix[0].length-1;k++) {
					if(matrix[j][k]>matrix[j+1][k+1]) {
						int temp=matrix[j+1][k+1];
						matrix[j+1][k+1]=matrix[j][k];
						matrix[j][k]=temp;
					}
				}
			}
		}

		return matrix;
	}

}
