package Patterns;
import java.util.Scanner;
public class Basics {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++)
			System.out.print("* ");
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++)
			System.out.print("  ");
		for(int k=0;k<=i;k++)
			System.out.print("* ");
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++)
			System.out.print("* ");
		System.out.println();
		
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<i;j++)
			System.out.print("  ");
		for(int k=i;k<n;k++)
			System.out.print("* ");
		
		System.out.println();
	}
	
	for(int i=0;i<n;i++) {
		char x=65,y=65;
		for(int j=i;j<n;j++)
			System.out.print("  ");
		for(int k=0;k<=i;k++)
			System.out.print((x++)+" ") ;
		for(int l=0;l<i;l++)
			System.out.print((y)+" ");
		System.out.println();
	}
	}

}
