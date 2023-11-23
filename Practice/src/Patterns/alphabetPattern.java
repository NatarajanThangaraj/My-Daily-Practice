package Patterns;
import java.util.Scanner;
public class alphabetPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a alphabet : ");
		String x=sc.next();
		char alpha=x.charAt(0);
		char some=alpha;
		for(int i=0;i<=alpha-'A';i++) {
			for(int j=i;j<=alpha-'A';j++)
				System.out.print(some);
			System.out.println();
			some--;
		}
	}


		
		
		
		
	

}
