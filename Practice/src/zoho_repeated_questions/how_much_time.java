package zoho_repeated_questions;

import java.util.TreeSet;

/*Input={2,5,6,7,7,2,3,5}
 * output=2(2),5(2),7(2),6(1)
 * */
public class how_much_time {

	public static void main(String[] args) {
		int[] input = { 2, 5, 6, 7, 7, 2, 3, 5 };
		repeatCount(input);
	}

	private static void repeatCount(int[] input) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int eachNum : input) {
			set.add(eachNum);
		}
		System.out.println(set);

		for (int x : set) {
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (x == input[j])
					count++;
			}
			System.out.print(x + "(" + count + ")");

		}

	}
}
