package matrix;
/*
 *Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right,
 *  which minimizes the sum of all numbers along its path.
 *  Note: You can only move either down or right at any point in time. 
 *Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
 *Output: 7
 *Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.*/
public class MinimumPathSum {

	public static void main(String[] args) {
		MinimumPathSum sum=new MinimumPathSum();
	int[][] matrix= {{1,2,3},{4,5,6}};
	System.out.println("The minimum path sum is  "+sum.pathSum(matrix));
	}
	
	public int pathSum(int[][]matrix) {
		int row=matrix.length-1;
		int col=matrix[0].length-1;
		for(int i=row;i>=0;i--) {
			for(int j=col;j>=0;j--) {
				
				if(i==row&&j==col) {
					continue;
				}else if(i==row) {
					matrix[i][j]+=matrix[i][j+1];
				}else if(j==col) {
					matrix[i][j]+=matrix[i+1][j];
				}else {
					matrix[i][j]+=Math.min(matrix[i][j+1], matrix[i+1][j]);
				}
			}
			
		}
		return matrix[0][0];
	}
}
