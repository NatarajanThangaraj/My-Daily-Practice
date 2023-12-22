package Patterns;

import java.util.Scanner;

public class BreakingBadPattern {
	void breakingbad(String str) {
		String temp1 = "", temp2 = "";
		int index = 1;
		while (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
			index++;
		}

		String max = str.substring(0, index).toUpperCase();
		String min = str.substring(index).toUpperCase();
		int length = (max.length() >= min.length()) ? max.length() : min.length();

		for (int i = 0; i < length; i++) {
			if (i < max.length()) {
				temp1 += max.charAt(i);
			}
			if (i < min.length()) {
				temp2 += min.charAt(i);
			}
			System.out.println(temp1 + temp2);
		}
	}

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  BreakingBadPattern obj=new BreakingBadPattern();
	  System.out.print("Enter the String : ");
	  String input=scan.next();
	  obj.breakingbad(input);

	}

}
