package BFS_and_DFS;

import java.util.LinkedList;

public class MaximumNumberOfFishInGrid {
  
	public static void main(String[] args) {
 int[][] grid= {{4,5,5}
              ,{0,10,0}};
System.out.println("Maximum Number of Fish : "+findMax(grid));

	}

	private static int findMax(int[][] grid) {
		int max=0,n=grid.length,m=grid[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(grid[i][j]!=0) {
					int[] arr=new int[1];
					findSum(i,j,grid,arr);
					max=(max<arr[0])?arr[0]:max;
				}
			}
		}
		return max;
	}

	private static void findSum(int i, int j, int[][] grid, int[] arr) {
		if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]==0) {
			return;
		}
		arr[0]+=grid[i][j];
		grid[i][j]=0;
		findSum(i-1,j,grid,arr);
		findSum(i+1,j,grid,arr);
		findSum(i,j-1,grid,arr);
		findSum(i,j+1,grid,arr);
		
	}

/*
 * 
 * This is my approch
 * 
 * 	private static int findMax(int[][] grid) {
		int i,j,max=0,temp,n=grid.length,m=grid[0].length;
		 boolean[][] visit=new boolean[n][m];
		for(i=0;i<n;i++) {
			temp=0;
			for(j=0;j<m;j++) {
				if(grid[i][j]!=0) {
					visit[i][j]=true;
					temp=fishCount(i,j,grid,visit);
					System.out.println(temp+" "+max);
				}
				max=(max<temp)?temp:max;
			}
		}
		return max;
	}

	private static int fishCount(int i, int j, int[][] grid, boolean[][] visit) {
		int count=0,n=grid.length,m=grid[0].length;
		 var que=new LinkedList<int[]>();
		int[] rowArr= {-1,1,0,0};
	  int[] colArr= {0,0,1,-1};
	  que.push(new int[] {i,j});
	 // int index=0;
	  while(!que.isEmpty()) {
		  int[] arr=que.poll();
		  count+=grid[arr[0]][arr[1]];
		  for(int k=0;k<4;k++) {
			  int row=arr[0]+rowArr[k];
			  int col=arr[1]+colArr[k];
			  if(row<0||col<0||col>m-1||row>n-1) {
				  continue;
			  }
			  if(visit[row][col]==true) {
				  continue;
			  }
			  if(grid[row][col]!=0) {
				  System.out.println(row+" "+col);
				  que.add(new int[] {row,col});
				  visit[row][col]=true;
			  }
			 // index++;
		  }
		//  System.out.println(que);
		  
	  }
	  
		return count;
	}*/

}
