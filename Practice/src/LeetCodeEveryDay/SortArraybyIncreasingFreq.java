package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/*Given an array of integers nums, sort the array in increasing order based on the frequency of the values. 
 * If multiple values have the same frequency, sort them in decreasing order.
Return the sorted array.
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
*/
public class SortArraybyIncreasingFreq {

	public static void main(String[] args) {
		new SortArraybyIncreasingFreq().frequencySort(new int[] {1,1,2,2,2,3});
	}

	public void frequencySort(int[] nums) {
		Map<Integer,Integer> map = new HashMap();
		int[] ans = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
	}
}
