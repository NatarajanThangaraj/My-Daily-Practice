package zoho_repeated_questions;

/*53) Write a program to give the following output for the given input:
Eg 1:  Input: a1b10
Output: abbbbbbbbbb
Eg: 2:  Input: b3c6d15
           Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/
public class noOfTimetoPrint {

	public static void main(String[] args) {
		String input="a1b10";
		StringBuilder str=new StringBuilder();
		int i=0,n=0;
		while(i<input.length()) {
			if(Character.isDigit(input.charAt(i+2))) {
			 n=Integer.parseInt(input.substring(i+1,i+3));
			 answerStr(str,input.charAt(i),n);
			 i+=3;
			}
			else {
				n=Integer.parseInt(input.substring(i+1,i+2));
				answerStr(str,input.charAt(i),n);
				i+=2;
			}	
		}
		System.out.println(str);
	}

	private static void answerStr(StringBuilder str,char x, int n) {
		int i=0;
		while(i<n) {
			str.append(x);
			i++;
		}
	}

}
