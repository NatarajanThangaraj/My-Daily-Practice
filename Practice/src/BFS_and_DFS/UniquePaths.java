package BFS_and_DFS;

public class UniquePaths {

	public static void main(String[] args) {
		int m=4,n=3;
		System.out.println(" Answer : "+uniquePaths(m,n));
		
	}
	public static int uniquePaths(int m, int n) {
		int[][]matrix=new int[m][n];
		int row=m-1,col=n-1,i,j;
		for(i=0;i<m;i++) {
			System.out.print(i);
			matrix[i][0]=1;
		}
		for(i=0;i<n;i++) {
			System.out.print(i);
			matrix[0][i]=1;
		}
		for(i=1;i<m;i++) {
			for(j=1;j<n;j++)
			matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];
		}
		
		return matrix[row][col];
	}
	/*System.out.println(" ANSWER : "+new UniquePaths().uniquePaths(m, n));
	Queue<int[]>que=new LinkedList<>();
	int[]arr={1,0,0,1};
	int answer=0;
	 public int uniquePaths(int m, int n) {
	       int row,col;
	       que.add(new int[] {0,0});
	       while(!que.isEmpty()) {
	    	   int[] arr=que.poll();
	    	   row=arr[0];
	    	   col=arr[1];
	    	   if(row==m-1&&col==n-1) {
	    		   answer++;
	    	   }
	    	   findAdjecentCells(row,col,m,n);
	       }
	       return answer;
	    }
	private void findAdjecentCells(int row, int col, int m, int n) {
		int row1=0,col1=0;
		System.out.println(row+" "+col+" ->");
		for(int i=0;i<=2;i+=2) {
				row1=row+arr[i];
				col1=col+arr[i+1];
				
			if(row1==m||col1==n) {
				continue;
			}
			System.out.println(row1+" "+col1);
			que.add(new int[] {row1,col1});
		}
		
		
	}*/

}
