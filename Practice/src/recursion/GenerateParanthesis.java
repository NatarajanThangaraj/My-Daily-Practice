package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class GenerateParanthesis {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		GenerateParanthesis paren =new GenerateParanthesis();
		System.out.print(" Enter the N : ");
		int n=scan.nextInt();
	 System.out.println(paren.generateParenthesis(n));
	}

	private List<String> generateParenthesis(int n) {
		List<String>list=new ArrayList<>();
		String str = "((()))";
//		for(int i=0;i<n;i++) {
//				str+="()";
//		}
		//System.out.println(str+" "+str.charAt(0));
		getAllValidParen(0,list,str,"");
		//System.out.println(list);
		return list;
	}
	
	private void getAllValidParen(int i, List<String> list, String str, String temp) {
		
	}

	boolean isValid(String str) {
		System.out.println(str+" -> ");
		Stack<Character>stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char x=str.charAt(i);
			if(x=='(') {
				stack.push(')');
			}else if(!stack.isEmpty()&&x==')') {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();
		}
	

}
