package zoho_repeated_questions.gfg;

import java.util.Arrays;

public class ReaarangeArrayAlternatively {

	public static void main(String[] args) {
		long []nums= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(rearrangeTheArray(nums,nums.length)));
	}

	private static long[] rearrangeTheArray(long[] nums,int n) {
		int j;
		long max;
		for(int i=0;i<n;i+=2) {
			j=n-1;
			max=nums[j];
			while(j>i) {
				nums[j]=nums[j-1];
				j--;
			}
			nums[j]=max;
		}
		return nums;
	}

}
