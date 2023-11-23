package zoho_repeated_questions;
/*Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
*/
import java.util.Scanner;
public class sumOfSeries {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=scan.nextInt();
	int temp=0,ans=0,fin=0;
	while(temp<n) {
		ans+=Math.pow(10, temp);
		temp++;
		System.out.print(ans+" ");
		fin+=ans;
	}
	System.out.println();
	System.out.print(fin);

	}

}
