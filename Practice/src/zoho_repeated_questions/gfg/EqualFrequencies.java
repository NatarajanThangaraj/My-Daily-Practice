package zoho_repeated_questions.gfg;
/*
 * Given a string s which contains only lower alphabetic characters,
 *  check if it is possible to remove at most one character 
 *  from this string in such a way that frequency of each distinct character becomes same in the string.
 *   Return true if it is possible to do else return false.

Note: The driver code print 1 if the value returned is true, otherwise 0.

Example 1:

Input:
s = "xyyz"
Output: 
1 
Explanation: 
Removing one 'y' will make frequency of each character to be 1.*/
public class EqualFrequencies {

	public static void main(String[] args) {
		String str="aababb";
		System.out.println("output "+sameFreq(str));
System.out.println(Integer.parseInt("00"));
	}
	static boolean sameFreq(String s) {
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		int sum=0,count=0;
		for(int x:arr){
		    sum+=x;
		    if(x!=0){
		        count++;
		    }
		}
		//System.out.println(sum+" "+count);
		if(sum%count>1){
		    return false;
		}else{
		    int want=sum/count;
		    System.out.println(want);
		    for(int x:arr){
		        if(x!=0&&(x<want||x>(want+1))){
		        	
		            return false;
		        }
		    }
		    return true;
		}
    }

}
