package leetcodeeveryday;

import java.util.Arrays;

public class TwoStringMakeAnagram {

	public static void main(String[] args) {
		System.out.println(minSteps("leetcode", "practice"));
	}

	public static int minSteps(String s, String t) {
		int count = 0;
		int[]arr=new int[26];
		char[]ss=s.toCharArray();
		char[]tt=t.toCharArray();
		for(char x:ss) {
			arr[x-'a']++;
		}
		System.out.println(Arrays.toString(arr));
		for(char y:tt) {
			arr[y-'a']--;
		}
		System.out.println(Arrays.toString(arr));
		for( int n:arr) {
			if(n<0)
				count+=n;
		}
		return count*-1;
	}

}
