package leetcodeeveryday;
/*Given an integer array nums, 
 * you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order, 
 * then the whole array will be sorted in non-decreasing order.
 * Return the shortest such subarray and output its length.
 * Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] 
in ascending order to make the whole array sorted in ascending order.*/
public class ShortestUnsortedContinousSubarray {

	public static void main(String[] args) {
		 ShortestUnsortedContinousSubarray obj=new  ShortestUnsortedContinousSubarray ();
		 int[] nums= {2,6,4,8,10,9,15};
		 System.out.println(obj.findUnsortedSubarray(nums));
	}
	 public int findUnsortedSubarray(int[] nums) {
	       return 0;
	    }

}
