package Patterns;

import java.util.Scanner;

public class diffPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		int n=sc.nextInt();
		diffPat(n);

	}

	private static void diffPat(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) 
				System.out.print("*");
			for(int k=0;k<i;k++)
				System.out.print("_");
			
			for(int l=0;l<i;l++)
				System.out.print("_");
			for(int m=i;m<n;m++)
				System.out.print("*");
			
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int k=0;k<i;k++)
				System.out.print("*");
			for(int j=n;j>i;j--)
				System.out.print("_");
			
			for(int l=n;l>i;l--)
				System.out.print("_");
			for(int m=0;m<i;m++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}

}
