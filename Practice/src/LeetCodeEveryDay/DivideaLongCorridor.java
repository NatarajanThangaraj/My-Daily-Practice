package LeetCodeEveryDay;

import GetInput.Input;

public class DivideaLongCorridor {

	public static void main(String[] args) {
		String str ="PP";//Input.getInputString();
		System.out.println(new DivideaLongCorridor().numberOfWays(str));
	}

	private int numberOfWays(String str) {
		// char[]arr=str.toCharArray();
		int ways = 0, sCount = 0,total=1;
		if (str.length() < 2) {
			return ways;
		}
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (sCount == 2 ) {
				ways++;
			}else {
				
			}
		}
		return total;
	}

}
