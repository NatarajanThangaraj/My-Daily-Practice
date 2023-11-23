package Recursion;

public class permutation_1 {

	public static void main(String[] args) {
		String str = "123";
		permutat(str.toCharArray(), 0);
	}

	static void permutat(char arr[], int fi) {

		if (fi == arr.length - 1) {
			System.out.println(arr);
		}
		for (int i = fi; i < arr.length; i++) {
			swap(arr, i, fi);
			permutat(arr, fi + 1);
			swap(arr, i, fi);
		}

	}

	private static void swap(char[] arr, int i, int fi) {
		char temp = arr[i];
		arr[i] = arr[fi];
		arr[fi] = temp;

	}

}
