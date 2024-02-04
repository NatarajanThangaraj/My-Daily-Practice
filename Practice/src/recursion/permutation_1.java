package recursion;

public class permutation_1 {

	public static void main(String[] args) {
		String str = "123";
		permutat(str.toCharArray(), 0);
	}

	static void permutat(char arr[], int fixedPoint) {

		if (fixedPoint == arr.length - 1) {
			System.out.println(arr);
			return ;
		}
		for (int i = fixedPoint; i < arr.length; i++) {
			swap(arr, i, fixedPoint);
			permutat(arr, fixedPoint + 1);
			swap(arr, i, fixedPoint);
		}

	}

	private static void swap(char[] arr, int i, int fi) {
		char temp = arr[i];
		arr[i] = arr[fi];
		arr[fi] = temp;

	}

}
