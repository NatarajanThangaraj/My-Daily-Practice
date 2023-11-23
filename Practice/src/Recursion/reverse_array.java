package Recursion;

import java.util.Arrays;

public class reverse_array {

	public static void main(String[] args) {
		int[]nums= {1,2,3,4,5,6,7,8,9};
 reversal(nums,3,nums.length-1);
 System.out.println(Arrays.toString(nums));
	}

	private static void reversal(int[] nums,int left,int right) {
		if(left>=right) {
			return;
		}
		int temp=nums[left];
		nums[left]=nums[right];
		nums[right]=temp;
		
		reversal(nums,left+1,right-1);
		
	}

}
