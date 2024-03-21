package recursion;

public class ReversFibonnaci {
	static int sum = 0;

	public static void main(String[] args) {
		int n = 5;
		rec(n, 0, 1);

	}

	private static void rec(int n, int a, int b) {
		if (n > 0) {
			rec(n - 1, b, a + b);
			System.out.print(a + " ");
		}

	}

}
