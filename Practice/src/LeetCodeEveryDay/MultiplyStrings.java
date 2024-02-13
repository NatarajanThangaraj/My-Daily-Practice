package LeetCodeEveryDay;

public class MultiplyStrings {

	public static void main(String[] args) {
		String str="123";
		System.out.println(multiply(str,"45"));

	}
	 public static  String multiply(String num1, String num2) {
		 if(num1.equals("0")||num2.equals("0")) {
			 return "0";
		 }
		 int n1=num1.length(),n2=num2.length();
		 int[]arr=new int[n1+n2];
		 int p1,p2,sum,mul;
		 for(int i=n1-1;i>=0;i--) {
			 for(int j=n2-1;j>=0;j--) {
				 p1=i+j;
				 p2=i+j+1;
				 mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0')+arr[p2];
				 arr[p1]+=mul/10;
				 arr[p2]=mul%10;
			 }
		 }
		 StringBuffer str=new StringBuffer();
		 for(int x:arr) {
			 str.append(x);
		 }
		 int start=0;
		 while(str.charAt(start)=='0') {
			 start++;
		 }
	        return str.substring(start);
	    }
	


}
