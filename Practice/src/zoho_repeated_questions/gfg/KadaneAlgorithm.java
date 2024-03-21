package zoho_repeated_questions.gfg;

/**
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing
 * at least one number) which has the maximum sum and return its sum. Example 1:
 * 
 * Input: N = 5 Arr[] = {1,2,3,-2,5} Output: 9 Explanation: Max subarray sum is
 * 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
 */
public class KadaneAlgorithm {
	public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		System.out.println("output  : " + findMaximumSum(arr));
	}

	private static long findMaximumSum(int[] nums) {
		int sum=0,max=Integer.MIN_VALUE,n=nums.length;
		for(int i=0;i<n;i++) {
			sum+=nums[i];
			max=(sum>max)?sum:max;
			sum=(sum<0)?0:sum;
		}
		return max;
	}

}
/*======BETTER SOLUTION o(n^2)=======
 * 
 * 
 * private static long findMaximumSum(int[] nums) {
		int i = 0, j = 0;
		long sum , maxSum = Integer.MIN_VALUE, n = nums.length;
		for (i = 0; i < n; i++) {
			sum=0;
			for (j = i; j < n; j++) {
				System.out.println(i+" "+j+" "+sum+" "+maxSum);
				sum+=nums[j];
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
			
		}
		return maxSum;
	}*/
