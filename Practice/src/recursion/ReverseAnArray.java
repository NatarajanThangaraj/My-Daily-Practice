package recursion;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		var nums= new int[]{1,2,3,4,5,6,7};
		//var ans=new int[nums.length];    
		//int index=0;                   
		reversedArray(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
		//System.out.println(Arrays.toString(ans));


	}

	private static void reversedArray(int[] nums, int i, int j) {
		if(i==j) {
			return;
		}
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		reversedArray(nums,i+1,j-1);
		
	}

//	private static void reversedArray(int[] nums, int[] ans, int index) {
//		if(index==nums.length) {
//			return;
//		}
//		ans[(nums.length-1)-index]=nums[index];
//		reversedArray(nums,ans,index+1);
//		
//	}

}
