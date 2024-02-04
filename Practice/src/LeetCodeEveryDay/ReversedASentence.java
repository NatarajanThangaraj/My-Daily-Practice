package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.List;

public class ReversedASentence {

	public static void main(String[] args) {
		String str="a good   example";
		System.out.println(reverseWords(str));
	}
	public static String reverseWords(String s) {
	       List<String>list=new ArrayList<>();
	       int start=0,end=0;
	       System.out.println(s.length());
	      outer:while(end<s.length()&&start<s.length()) {
	    	   while(s.charAt(start)==' ') {
	    		   start++;
	    		   if(start==s.length()) {
	    			   break outer;
	    		   }
	    	   }
	    	   end=start;
	    	   while(s.charAt(end)!=' ') {
	    		   end++;
	    		   if(end==s.length()) {
	    			   break ;
	    		   }
	    	   }
	    	   list.add(s.substring(start,end));
	    	   start=end;
	       }
	       System.out.println(list);
	       StringBuilder str=new StringBuilder();
	       for(int i=list.size()-1;i>=0;i--) {
	    	   if(i!=0)
	    	   str.append(list.get(i)+" ");
	    	   else {
	    		   str.append(list.get(i));
	    	   }
	       }
	    return str.toString();
	    }
	

}
