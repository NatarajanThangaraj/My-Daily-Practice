package Patterns;

import java.util.Scanner;

public class AlterSpiral {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = scan.nextInt();
		makeSpiral(n);
		scan.close();

	}

	private static void makeSpiral(int n) {
		int[][] matrix=new int[n][n];
		int i,left=0,top=0;
		int index=1,bottom=n-1,right=n-1;
		while(left<=right&&top<=bottom) {
			for(i=top;i<=bottom;i++) {
				matrix[i+top][i]=index++;
			}
			left++;
			bottom--;
			if(left<=right) {
				for(i=bottom;i>=top;i--) {
					matrix[right][i]=index++;
				}
				right--;
			}
			bottom--;
			if(top<=bottom) {
				for(i=right;i>=left;i--) {
					matrix[i][top]=index++;
				}
				
			}
			left++;
			top++;
		}
		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] != 0)
					System.out.printf(" %3d",matrix[i][j]);
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
