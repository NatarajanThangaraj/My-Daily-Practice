package matrix;

import java.util.Arrays;

/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * */
public class SpiralMatrix {

	public static void main(String[] args) {
		SpiralMatrix obj=new SpiralMatrix();
		System.out.println(Arrays.toString(obj.spiral(new int[][] {{1,2,3,4},{5,6,7,8}})));
	}

	public int[] spiral(int[][] matrix) {
		int len = matrix.length;
		int rowLen=matrix[0].length;
		int[] array = new int[len*rowLen];
		int index = 0, left = 0, top = 0, i = 0;
		int bottom = len - 1, right = rowLen - 1;
		while (left <= right && top <= bottom) {
			if (top<=bottom) {
				for (i = top; i <= right; i++) {
					array[index++] = matrix[top][i];
				}
			}
			top++;
			 if(left<=right) {	
				 for(i=top;i<=bottom;i++) {
					 array[index++]=matrix[i][right];
				 }
			}
			 right--;
			 if(top<=bottom) {
				 for(i=right;i>=left;i--) {
					 array[index++]=matrix[bottom][i];
				 }
			 }
			 bottom--;
			 if(left<=right) {
				 for(i=bottom;i>=top;i--) {
					 array[index++]=matrix[i][left];
				 }
				 left++;
			 }
		}
		return array;
	}

}
