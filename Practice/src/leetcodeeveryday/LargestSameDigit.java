package leetcodeeveryday;

import GetInput.Input;

/*You are given a string num representing a large integer. An integer is good if it meets the following conditions:
 * 
 * It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.You are given a string num representing a large integer.
 An integer is good if it meets the following conditions:
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
.*/
public class LargestSameDigit {

	public static void main(String[] args) {
		LargestSameDigit num=new LargestSameDigit();
		String s=Input.getInputString();//String must be numbers.
		num.largestDigit(s);
	}

	private void largestDigit(String s) {
		int max=0,startIndex=0,endIndex=0;
		for(int i=0;i<s.length()-2;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				if(s.charAt(i+1)==s.charAt(i+2)) {
					if(Integer.parseInt(s.charAt(i)+"")>max) {
					startIndex=i;
					endIndex=i+3;
					max=Integer.parseInt(s.charAt(i)+"");
					}
				}
			}
		}
		System.out.println("Maximum Good Integer is :"+s.substring(startIndex,endIndex));
	}
	

}
