package Patterns;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String x=sc.next();
		xpat(x);
	}
	private static void xpat(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++){
				if(i==j)
					System.out.print(s.charAt(i)+" ");
				else if(i+j==(s.length()-1))
						System.out.print(s.charAt(j)+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
