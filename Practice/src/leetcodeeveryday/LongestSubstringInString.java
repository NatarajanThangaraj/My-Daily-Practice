package leetcodeeveryday;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringInString {

	public static void main(String[] args) {
		LongestSubstringInString string=new LongestSubstringInString();
		String str="jbpnbwwd";
		System.out.println(string.lengthOfLongestSubstring(str));

	}
	 public int lengthOfLongestSubstring(String s) {
		 char []arr=s.toCharArray();	
		 int maxLength=0;
	        Set<Character>list=new LinkedHashSet<>();
	        for(int i=0;i<s.length();i++) {
                for(int j=i;j<s.length();j++){
	        	if(list.contains(arr[j])) {
	        		//System.out.println(list+" "+i);
	        		if(maxLength<list.size()) {
	        			maxLength=list.size();
                      
	        		}
	        		list.clear();
	        		 break;
                    
	        	}else {
	        	list.add(arr[j]);
	        	}
	        }
            }
	        return(maxLength<list.size())?list.size():maxLength;
    }

}
