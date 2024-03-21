package BFS_and_DFS;

import java.util.LinkedList;
import java.util.Queue;

/*To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 *  plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. 
 * Replace the color of all of the aforementioned pixels with color.*/
public class FloodsFill {
	public static void main(String[] args) {
		int[][] image = { { 1, 1, 1 },
				          { 1, 1, 0 },
				          { 1, 0, 1 } };
		int sr = 1, sc = 1, color = 2;
		int[][] matrix =new FloodsFill(). floodFill(image, sr, sc, color);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}
	static int[] row = { -1, 1, 0, 0 };
	static int[] col = { 0, 0, 1, -1 };
	 Queue<int[]> queue = new LinkedList<>();

	public  int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int m = image.length, n = image[0].length,temp=0;
		boolean[][] visited = new boolean[m][n];
		queue.add(new int[] { sr, sc });
		visited[sr][sc] = true;
		while (!queue.isEmpty()) {
			//System.out.println(queue);
			int[] arr = queue.poll();
			temp=image[arr[0]][arr[1]];
			multiDirectionalView(arr, image, color, visited,temp);
			image[arr[0]][arr[1]]=color;
		}
		return image;
	}

	 void multiDirectionalView(int[] arr, int[][] grid, int color, boolean[][] visited,int temp) {
		visited[arr[0]][arr[1]] = true;
		for (int i = 0; i < 4; i++) {
			int r = arr[0] + row[i];
			int c = arr[1] + col[i];
			//System.out.println(r+" "+c+"  "+temp);
			if (r < 0 || c < 0) {
				continue;
			}
			if (r >= grid.length || c >= grid[0].length) {
				continue;
			}
			if (visited[r][c] == true) {
				continue;
			}
			if(temp==grid[r][c]) {
				//System.out.println(r+" "+c);
				queue.add(new int[] { r, c });
				visited[r][c] = true;
			}
		}
	}

	

}
