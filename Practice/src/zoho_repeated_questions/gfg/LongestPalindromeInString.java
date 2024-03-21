package zoho_repeated_questions.gfg;

/*
 * Given a string S, find the longest palindromic substring in S.
 *  Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). 
 *  Palindrome string: A string that reads the same backward.
 *   More formally, S is a palindrome if reverse(S) = S.
 *    In case of conflict, return the substring which occurs first ( with the least starting index).

Example 1:

Input:
S = "aaaabbaa"
Output: aabbaa
Explanation: The longest Palindromic
substring is "aabbaa".*/
public class LongestPalindromeInString {

	public static void main(String[] args) {
		String str = "aaaabbaa";
		System.out.println(" output : " + longestPalindromicSubstring(str));

	}

	private static String longestPalindromicSubstring(String str) {
		String s="";
		recursive(0,str,s);
		return s;
	}

	private static String recursive(int i, String str, String s) {
		if(str.equals("")) {
			return s;
		}
			if(isPalindrome(str)&&s.length()<str.length()) {
				System.out.println(str);
				s=str;
				return s;
			}
			
		
		return recursive(1,str.substring(1),s);
		
		
	}

	private static boolean isPalindrome(String s) {
		
		if (s.length() == 1) {
			return true;
		}
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}

}
