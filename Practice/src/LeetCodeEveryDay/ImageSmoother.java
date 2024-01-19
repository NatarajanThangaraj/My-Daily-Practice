package LeetCodeEveryDay;

import java.util.Arrays;

public class ImageSmoother {

	public static void main(String[] args) {
		ImageSmoother smooth=new ImageSmoother();
		int[][]matrix= {{100,200,100},{200,50,200},{100,200,100}};
		for(int[] arr:smooth.imageSmoother(matrix)) {
			System.out.println(Arrays.toString(arr));
		};
	}
	    public int[][] imageSmoother(int[][] img) {
	    	int m,i,n,j;
	    	 m=img.length;
	    	 n=img[0].length;
	    	int[][] ans=new int[m][n];
	    	int edges=(img[0][0]+img[0][1]+img[1][0]+img[1][1])/4;
	    	int center=(img[0][0]+img[0][1]+img[1][0]+img[1][1]+img[0][2]+img[1][2]+img[2][0]+img[2][2])/8;
	    	int mid=(img[0][0]+img[1][0]+img[0][1]+img[1][1]+img[1][2]+img[0][2])/6;
	    	for(i=0;i<m;i++) {
	    		for(j=0;j<n;j++) {
	    			
	    			if((i==0||i==m-1)&&(j==0||j==n-1)) {
	    				ans[i][j]=edges;
	    			}
	    			else if(i==m/n&&j==m/n) {
	    				
	    				ans[i][j]=center;
	    			}
	    			else {
	    				
	    				ans[i][j]=mid;
	    			}
	    		}
	    	}
			return ans;  
	    }
}
