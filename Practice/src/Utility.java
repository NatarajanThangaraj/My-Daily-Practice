import java.util.Scanner;

public class Utility {
	static Scanner scan=new Scanner(System.in);
 public static int[] getArray() {
	 System.out.print(" Enter the length : ");
	 int n=scan.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=scan.nextInt();
	 }
	return arr;
 }
}
