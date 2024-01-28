package matrix;

public class SpiralMatrixII {

	public static void main(String[] args) {
		int n=5;
		int[][]nums=generateMatrix(n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%2d",nums[i][j]);
			}
			System.out.println();
		}
	}
public static int[][] generateMatrix(int n) {
	int[][]matrix=new int[n][n];
	int num=1;
	int top=0,bottom=n-1;
	int left=0,right=n-1;
	while(left<=right) {
		for(int i=left;i<=right;i++) {
			matrix[left][i]=num++;
		}
		left++;
		for(int i=left;i<=bottom;i++) {
			matrix[i][bottom]=num++;
		}
		right--;
		for(int i=right;i>=top;i--) {
			matrix[bottom][i]=num++;
		}
		bottom--;
		for(int i=bottom;i>=left;i--) {
			matrix[i][top]=num++;
		}
		top++;
	}

	return matrix;
    }

}
