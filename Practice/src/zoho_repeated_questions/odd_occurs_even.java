package zoho_repeated_questions;

/*
 * Input={4,2,5,6}
 * output=4+2+8+9+2=25*/
public class odd_occurs_even {

	public static void main(String[] args) {
		int[] Input = { 3,6,4,8,5,5 };
		System.out.println(sum(Input));

	}

	static int sum(int[] arr) {
		int sum = arr[0];
		for (int i = 1; i <arr.length; i++) {
			if ( (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0))
				continue;
			sum += arr[i];
		}
		return sum;
	}

}
