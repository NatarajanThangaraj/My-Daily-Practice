
package zoho_repeated_questions;
import java.util.Scanner;
public class star_pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number : ");
int N=scan.nextInt();
for(int i=1;i<=N;i++) {
	for(int j=0;j<N-i;j++)
		System.out.print("  ");
	for(int k=0;k<2*i-1;k++)
		System.out.print("* ");
	System.out.println();
}
	}

}
