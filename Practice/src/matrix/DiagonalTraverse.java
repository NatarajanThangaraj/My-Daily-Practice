package matrix;

import java.util.Arrays;

public class DiagonalTraverse {

	public static void main(String[] args) {
		DiagonalTraverse treverse=new DiagonalTraverse();
		int[][]matrix= {{1,2,4,5},
				        {6,7,8,9},
				        {10,11,12,14}
				        };
		System.out.println(Arrays.toString(treverse.findDiagonalOrder(matrix)));

	}
	 public int[] findDiagonalOrder(int[][] mat) {
		 int row=0,col=0,m=mat.length,n=mat[0].length;
		 int[]arr=new int[m*n];
		for(int i=0;i<arr.length;i++) {
			if((row+col)%2==0) {
				arr[i]=mat[row][col];
				col++;
				if (col==n) {
					row++;
					col--;
				}
				else if(row>0) {
					row--;
				}
				
				
			}
			else if((row+col)%2!=0) {
				arr[i]=mat[row][col];
				row++;
				if (row==m) {
					row--;
					col++;
				}
				else if(col>0) {
					col--;
				}
				
				
			}
			System.out.println(row+" "+col);
		}
	       return arr; 
	    }

}
