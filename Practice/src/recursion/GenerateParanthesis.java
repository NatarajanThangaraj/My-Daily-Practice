package recursion;

import java.util.Scanner;

public class GenerateParanthesis {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		GenerateParanthesis paren =new GenerateParanthesis();
		System.out.print(" Enter the N : ");
		int n=scan.nextInt();
		char[]arr=new char[n*2];
	 paren.generateParenthesis(n,0,0,arr,0);
	 scan.close();
	}

	private void generateParenthesis(int n, int open, int close, char[] arr, int index) {
		if(close==n) {
			System.out.println(arr);
			return;
		}
		if(open<n) {
			arr[index]='(';
			generateParenthesis(n,open+1,close,arr,index+1);
		}
		if(close<open) {
			arr[index]=')';
			generateParenthesis(n,open,close+1,arr,index+1);
		}
	}
	
	

	
	

}
