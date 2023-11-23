package zoho_repeated_questions;
import java.util.Scanner;
public class nth_fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the N : ");
		int N=scan.nextInt();
	System.out.println(fibo( N));
//		int firstTerm=0;
//		int secondTerm=1;
//		int index=0;
//		while(index!=N) {
//			index++;
//			if(index==N)
//				System.out.print(firstTerm+" ");
//			int nextTerm=firstTerm+secondTerm;
//			firstTerm=secondTerm;
//			secondTerm=nextTerm;
			
			scan.close();
		//}
	}
	private static int fibo(int n) {
		if(n==1)return 1;
		if(n==2)return 1;
		int first=fibo(n-1);
		int sec=fibo(n-2);
		
		return first+sec;
	}

}
