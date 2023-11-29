package LeetCodeEveryDay;
/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * 
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.*/
public class RotateImage {

	public static void main(String[] args) {
		

	}
	public int[][] transpose(int[][] matrix){
		int n=matrix.length,i=0,j=0,start=0,end=n;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				swap(matrix,i,j);
			}
		}
		while(start<end) {
			for(int k=0;k<n;k++) {
				swap(matrix,start,end,k);
			}
			start++;
			end--;
		}
return matrix;		
	}
	public void swap(int[][] matrix,int i,int j) {
		int temp=matrix[i][j];
		matrix[i][j]=matrix[j][i];
		matrix[j][i]=temp;
	}
	public void swap(int[][] matrix,int start,int end,int index) {
		int temp=matrix[index][start];
		matrix[index][start]=matrix[index][end];
		matrix[index][end]=temp;
	}
}
