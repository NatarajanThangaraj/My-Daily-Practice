package LeetCodeEveryDay;
/*You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words.

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.*/
public class WordsCanBeFormedbyChar {

	public static void main(String[] args) {
		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		WordsCanBeFormedbyChar numberofChar= new WordsCanBeFormedbyChar();
		System.out.println(numberofChar.countCharacters(words, chars));
	}
	public int countCharacters(String[] words, String chars) {
	       int sum=0;
	       for(String str:words) {
	    	   char arr[]=chars.toCharArray();
	    	   for(char x:str.toCharArray()) {
	    		   boolean flag=true;
	    		   for(int i=0;i<arr.length;i++) {
	    			   if(arr[i]==x) {
	    				   flag=false;
	    				   arr[i]='_';
	    			   }
	    			   
	    		   }
	    		   if(flag) {
	    			   break;
	    		   }
	    	   }
	       }
	       return sum;
    }
}
