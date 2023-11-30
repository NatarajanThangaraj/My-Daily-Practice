package GetInput;

import java.util.Scanner;

/* I create this class to use eveywhere in get a input from user.*/
public class Input {
	static Scanner scan = new Scanner(System.in);

	public static int[] getInputArray() {
		System.out.print("Enter the Length :");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("array [" + i + "] : ");
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	public static long getInputNumber() {
		System.out.print("Enter a Number :");
		long num = scan.nextLong();
		return num;
	}

	public static String getInputString() {
		System.out.print("Enter a String :");
		String str = scan.nextLine();
		return str;
	}

}
