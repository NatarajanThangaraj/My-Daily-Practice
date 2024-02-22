package leetcodeeveryday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import GetInput.Input;

/*
 * You are given an integer array nums sorted in non-decreasing order.
 * Build and return an integer array result with the same length as nums
 * such that result[i] is equal to the summation of absolute differences between nums[i] and 
 * all the other elements in the array.
 * In other words, result[i] is equal to sum(|nums[i]-nums[j]|)
 * where 0 <= j < nums.length and j != i (0-indexed).
 * Input: nums = [2,3,5]
Output: [4,3,5]
Explanation: Assuming the arrays are 0-indexed, then
result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.*/
public class SumOfAbsaluteDifference {

	public static void main(String[] args) {
		SumOfAbsaluteDifference abs = new SumOfAbsaluteDifference();
		int[] nums = Input.getInputArray();
		System.out.println(Arrays.toString(abs.getSumAbsoluteDifferences(nums)));
	}

	public int[] getSumAbsoluteDifferences(int[] nums) {
		int len = nums.length,left=0,right=0;
		int[] arr = new int[len];
		for(int x:nums) {
			right+=x;
		}
		for(int i=0;i<len;i++) {
			arr[i]=(nums[i]*i-left)+((right-=nums[i])-(nums[i]*(len-i-1)));
			left+=nums[i];
		}
		return arr;

	}

}
 //                 ---1st Approch---   
//public int[] getSumAbsoluteDifferences(int[] nums) {
//	int len = nums.length, temp = 0,copy=nums[0];
//	int[] arr = new int[len];
//	for (int i = 0; i < len; i++) {
//		if (i==0||copy!=nums[i]) {
//			temp=0;
//			copy=nums[i];
//			for (int j = len - 1; j >= 0; j--) {
//				temp += Math.abs(nums[i] - nums[j]);
//				
//			}
//		}
//		arr[i]=temp;
//	}
//	return arr;
//
//}

