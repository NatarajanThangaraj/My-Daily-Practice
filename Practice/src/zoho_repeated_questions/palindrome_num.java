package zoho_repeated_questions;
import java.util.Scanner;
public class palindrome_num {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=scan.nextInt();
		System.out.println(palindrome(num));
		scan.close();

	}

	private static boolean palindrome(int num) {
		int temp=num;
		int get=0;
		while(temp!=0) {
			get=(get*10)+temp%10;
			temp/=10;
		}
		if(num==get)
			return true;
		else
		return false;
	}

}
