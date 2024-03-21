package zoho_repeated_questions.gfg;

import java.util.Arrays;

public class LargestNumberFormedFromAnArray {

	public static void main(String[] args) {
		String[] arr={"54", "546", "541", "60"};
		System.out.println("output : "+printLargest(1,arr));
	}
	 static String printLargest(int n, String[] arr) {
		 Arrays.sort(arr,(String n1,String n2)->{
			 String num1=n1+n2;
			 String num2=n2+n1;
			 return num2.compareTo(num1);
		 });
		 
	       return String.join("", arr);
	    }

}
