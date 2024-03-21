package sliding_window_and_prefixsum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// Time complexity o(1)
		int[] arr= {-1,1,0,-3,3};
		System.out.println("output : "+Arrays.toString(findArray(arr)));

	}

	private static int[] findArray(int[] nums) {
		int n=nums.length,leftSum=1;
		int[] temp=new int[n];
		temp[0]=1;
		for(int i=1;i<n;i++) {
			leftSum*=nums[i-1];
			temp[i]=leftSum;
		}
		//System.out.println(Arrays.toString(temp));
		int rightSum=1;
		for(int i=n-1;i>=0;i--) {
			int num=nums[i];
			nums[i]=temp[i]*rightSum;
			rightSum*=num;
		}
		return nums;
	}

}
