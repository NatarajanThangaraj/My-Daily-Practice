package Patterns;

import java.util.Scanner;

public class numericPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		int n=sc.nextInt();
		numPat(n);

	}

	private static void numPat(int n) {
		int x=1;
		for(int i=0;i<n;i++) {
			for(int j=n;j>=0;j--) {
				if(i>=j)
				System.out.printf((i+1)+" ");
				else
					System.out.printf(" ");
			
			}
			System.out.println();
		}
		
	}

}
