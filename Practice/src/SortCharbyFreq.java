/*Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.
 * Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SortCharbyFreq {

	public static void main(String[] args) {
		SortCharbyFreq obj=new SortCharbyFreq();
		System.out.println(obj.frequencySort("raaeeaedere"));
	}

	public String frequencySort(String s) {
		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		ArrayList<Map.Entry<Character,Integer>>list=new ArrayList(map.entrySet());
		Collections.sort(list, (b,a)->a.getValue()-b.getValue());
		System.out.println(list);
		StringBuilder str=new StringBuilder();
		for(Map.Entry<Character,Integer>each:list) {
			for(int i=0;i<each.getValue();i++) {
				str.append(each.getKey());
			}
		}
		return str.toString();
	}

}
