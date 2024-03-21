package leetcodeeveryday;

public class MinimumLengthOfStringDeletingSimilarEnds {

	public static void main(String[] args) {
	System.out.println(minimumLength("abcaacba"));
	}
	public  static int minimumLength(String s) {
        int left=0,right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right) {
        	if(arr[left]!=arr[right]) {
        		break;
        	}
        	  char x=arr[left];
        	while(right>=left&&arr[left]==x)left++;
        	while(right>=left&&arr[right]==x)right--;
        }
        return right-left+1;
    }
	/*              It is my approach         */
   static int recursive(char[] arr,int left,int right){
	   
        if(arr[left]!=arr[right]){
            return (right-left)+1;
        }
        char x=arr[left];
        while(left<right&&arr[left]==x){
        	System.out.println(x+" "+left);
            left++;
        }
        if(left==right) {
        	return 0;
        }
        while(left<right&&arr[right]==x){
        	System.out.println(x+" "+right);
            right--;
        }
        System.out.println(x+" "+left+" "+right);
        if(left==right) {
        	return 1;
        }
       
         return recursive(arr,left,right);
    }
 //bbbbbbbbbbbbbbbbbbbbbbbbbbb a bbbbbbbbbbbbbbb cc b c b c b cc bb a bbb

}
