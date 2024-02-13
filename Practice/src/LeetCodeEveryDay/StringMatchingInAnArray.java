package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

	public static void main(String[] args) {
		String[]arr= {"leetcoder","leetcode","od","hamlet","am"};
		System.out.println(stringMatching(arr));
	}
	public static List<String> stringMatching(String[] words) {
		List<String>list=new ArrayList<>();
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(i!=j&&words[j].contains(words[i])&&!list.contains(words[i])) {
					list.add(words[i]);
				}
			}
		}
		return list;
		
    }

}
