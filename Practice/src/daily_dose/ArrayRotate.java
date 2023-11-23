package daily_dose;

import java.util.Arrays;

public class ArrayRotate {
	//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5,6,7}, 3)));
	}
public static int[] rotate(int[] nums, int k) {
	int temp=0;
	for(int i=0;i<k;i++) {
		temp=nums[nums.length-1];
		for(int j=nums.length-1;j>0;j--) {
			nums[j]=nums[j-1];
		}
		nums[0]=temp;
	}
	return nums;   
    }

}
