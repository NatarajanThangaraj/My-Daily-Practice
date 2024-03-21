package sliding_window_and_prefixsum;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer k.
 *  A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays
 with 3 odd numbers are [1,1,2,1] and [1,2,1,1].*/
public class CountNumbersOfNiceSubArrays {

	public static void main(String[] args) {
		int[]  nums = {2,2,2,1,2,2,1,2,2,2};
		int k = 2;
		System.out.println("output : "+numberOfSubarrays(nums,k));
	}
public static int numberOfSubarrays(int[] nums, int k) {
	int n=nums.length,count=0,oddCount=0;
	Map<Integer,Integer>map=new HashMap<>();
	map.put(0, 1);
	for(int i=0;i<n;i++) {
		oddCount=(nums[i]%2==0)?oddCount:oddCount+1;
		//System.out.println(oddCount+" "+map);
		int prev=oddCount-k;
		if(map.containsKey(prev)) {
			count+=map.get(prev);
			
		}if(map.containsKey(oddCount)) {
			map.put(oddCount,map.get(oddCount)+1);
		}else {
			map.put(oddCount, 1);
		}
		
	}
	return count;
        
    }

}
