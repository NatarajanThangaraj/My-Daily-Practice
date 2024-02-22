package leetcodeeveryday;

import java.util.Arrays;

public class RearrangeArrayElements {

	public static void main(String[] args) {
		int [] nums= {-1,1};
		System.out.println(Arrays.toString(rearrangeArray(nums)));
			
		}
		public static int[] rearrangeArray(int[] nums) {
			int i,eveInd=0,oddInd=0,n=nums.length;
			int[]even=new int[n/2];
            int[]odd=new int[n/2];

            for( i=0;i<n;i++){
                if(nums[i]>=0){
                    even[eveInd++]=nums[i];
                }else{
                    odd[oddInd++]=nums[i];
                }
            }
            System.out.println(Arrays.toString(even));
            System.out.println(Arrays.toString(odd));
            for(i=0;i<n;i++){
                if(i%2==0){
                    nums[i]=even[i/2];
                }else{
                    nums[i]=odd[i/2];
                }
            }
			return nums;
	    }
//		private static void swap(int j, int i, int[] nums) {
//			while(j>i) {
//				nums[j]=nums[j-1];
//				j--;
//			}
//			
		

}
