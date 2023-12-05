package LeetCodeEveryDay;

import java.util.Arrays;

/*Input: s = "lEetcOde"
Output: "lEOtcede"
Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants.
 The vowels are sorted according to their ASCII values,
 and the consonants remain in the same places.*/
public class SortVowelsinaString {

	public static void main(String[] args) {
		SortVowelsinaString obj = new SortVowelsinaString();
		String s = "lYmpH";
		System.out.println(obj.sortVowels(s));
	}

	public String sortVowels(String s) {
		StringBuilder str = new StringBuilder();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (isVowel(arr[i])) {
				str.append(arr[i]);
				arr[i] = '_';
			}
		}
		int index = 0;
		char[] vowelArray = vowelArr(str);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '_') {
				arr[i] = vowelArray[index++];
			}
		}
		StringBuilder ans=new StringBuilder();
		for(char x:arr) {
			ans.append(x);
		}
		return ans.toString();
	}

	private boolean isVowel(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'
				|| x == 'U') {
			return true;
		}
		return false;
	}

	private char[] vowelArr(StringBuilder str) {
		char[] arr = str.toString().toCharArray();
		Arrays.sort(arr);
		return arr;
	}
}
