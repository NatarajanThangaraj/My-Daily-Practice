package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*You are given an array of strings arr.
 *  A string s is formed by the concatenation of a subsequence of arr 
 *  that has unique characters.*/
public class MaxLengthOfString {

	public static void main(String[] args) {
		MaxLengthOfString len=new MaxLengthOfString();
		String[]arr= {"ab","ba","cd","dc","ef","fe","gh","hg","ij","ji","kl","lk","mn","nm","op","po"};
		List<String>list=new ArrayList<>(Arrays.asList(arr));
		StringBuilder str=new StringBuilder();
		len.maxLength(list,str,0);
		System.out.println(str);
	}
	 public void maxLength(List<String> list,StringBuilder str,int index){
		 if(index==list.size()) {
			 return;
		 }
		 if(isValid(str,list.get(index))) {
	       maxLength(list,str.append(list.get(index)),++index);
	    }
		 maxLength(list,str,++index);
	 }
	 
	private boolean isValid(StringBuilder str,String temp) {
		StringBuilder string=str.append(temp);
		Set<Character>set=new HashSet<>();
		for(int i=0;i<string.length();i++) {
			set.add(string.charAt(i));
		}
		System.out.println(string);
		return set.size()==string.length();
	}

}
