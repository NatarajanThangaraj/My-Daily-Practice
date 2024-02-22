package leetcodeeveryday;

public class CitySkyLine {

	public static void main(String[] args) {
		int[][]grid= {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		System.out.println(maxIncreaseKeepingSkyline( grid));
	}
public static int maxIncreaseKeepingSkyline(int[][] grid) {
	int j,i,count=0,n=grid.length;
	int[]rowMax=new int[n];
	int[]colMax=new int[n];
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			if(rowMax[i]<grid[i][j]) {
				rowMax[i]=grid[i][j];
			}
			if(colMax[j]<grid[i][j]) {
				colMax[j]=grid[i][j];
			}
		}
	}
//	System.out.println(Arrays.toString(rowMax));
//	System.out.println(Arrays.toString(colMax));
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			count+=Math.min(rowMax[i], colMax[j])-grid[i][j];
		}
	}
	return count;
        
    }

}
