package leetcodeeveryday;

import GetInput.Input;

public class MaximumSubArray {

	public static void main(String[] args) {
		MaximumSubArray maxSub=new MaximumSubArray();
		int[] nums= Input.getInputArray();
		System.out.println(maxSub.findMax(nums));

	}

	private int findMax(int[] nums) {
		int maxSum=Integer.MIN_VALUE,temp=0;
		for(int x:nums) {
			temp+=x;
			if(temp>maxSum) {
				maxSum=temp;
			}
			if(temp<0) {
				temp=0;
			}
		}
		return maxSum;
	}

}
