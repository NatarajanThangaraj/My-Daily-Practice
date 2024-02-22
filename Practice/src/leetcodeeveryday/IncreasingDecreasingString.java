
package leetcodeeveryday;

public class IncreasingDecreasingString {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";
		System.out.println(new IncreasingDecreasingString().sortString(str));
	}

	public String sortString(String s) {
		StringBuilder ans = new StringBuilder();
		int[] arr = new int[26];
		for (char x : s.toCharArray()) {
			arr[x - 'a'] ++ ;
		}
		// System.out.println(Arrays.toString(arr));
		while (ans.length() != s.length()) {
			for (int i = 0; i < 26; i++) {
				if (arr[i] != 0) {
					ans.append((char) ('a' + i));
					arr[i] = arr[i] - 1;
				}
			}
			for (int i = 25; i >= 0; i--) {
				if (arr[i] != 0) {
					ans.append((char) ('a' + i));
					arr[i] = arr[i] - 1;
				}
			}

		}
		return ans.toString();
	}

}
