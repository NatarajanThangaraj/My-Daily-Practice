package zoho_repeated_questions;
/*59) Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Eg 1: Input: String 1: test123string
          String 2: 123
         Output: 4
Eg 2:  Input: String 1: testing12
         String 2: 1234
         Output: -1*/
public class findIndexOffirtOccurence {

	public static void main(String[] args) {
		String str1= "test1";
        String str2= "123";
        System.out.println( "output:"+findIndex(str1,str2));
	}

	private static int findIndex(String str1, String str2) {
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		int temp=0;
		for(int i=0,j=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[j]) {
				temp=i;
				while(i<arr1.length&&j<arr2.length) {
					i++;
					j++;
				}
				if(j==arr2.length)
					return temp;
			}
		}
		
		return -1;
	}

}
