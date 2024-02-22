package leetcodeeveryday;

public class ZigZagConvo {

	public static void main(String[] args) {
		System.out.println( new ZigZagConvo().convert("paypalishiring", 3));
	}

	public String convert(String s, int numRows) {
		StringBuilder str = new StringBuilder();
		char[][] arr = new char[numRows][s.length() / 2 + 1];
		int index = 0;
		int i = 0, j = 0;
		while (index < s.length()) {
			if (i == 0) {
				while (i < numRows && index < s.length()) {
					arr[i][j] = s.charAt(index++);
					i++;
				}
			} else {
				i -= 2;
				j++;
				while (i > 0 && index < s.length()) {
					arr[i][j] = s.charAt(index++);
					i--;
					j++;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
        if(arr[i][j]!='\u0000')
					str.append(arr[i][j]);
		
			}	
		}
		return str.toString();
	}

}
