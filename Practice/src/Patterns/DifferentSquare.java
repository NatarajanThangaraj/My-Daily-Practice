package Patterns;

public class DifferentSquare {

	public static void main(String[] args) {
		new DifferentSquare().pattern(5);
	}

	public void pattern(int n) {
		char[][] arr = new char[n][n];
		int start = 0, end = n - 1;
		boolean flag = true;
		while (start <= end) {
			for (int i = start; i < end; i++) {
				if (flag) {
					arr[start][i] = '*';
					arr[i][start] = '*';
				} else {
					arr[start][i] = '0';
					arr[i][start] = '0';
				}
			}
			for (int j = end; j >= start; j--) {
				if (flag) {
					arr[end][j] = '*';
					arr[j][end] = '*';
				} else {
					arr[end][j] = '0';
					arr[j][end] = '0';
				}
			}
			flag = !flag;
			start++;
			end--;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

	}

}
