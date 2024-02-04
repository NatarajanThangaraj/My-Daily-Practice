package recursion;
import java.util.Scanner;
public class find_Factorial {
	
private static long factorial(int Number) {
	if(Number==1)
		return 1;
	
	return Number*factorial(Number-1);
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int Number=scan.nextInt();
	System.out.println("output : "+factorial(Number));	
		scan.close();

	}

}
