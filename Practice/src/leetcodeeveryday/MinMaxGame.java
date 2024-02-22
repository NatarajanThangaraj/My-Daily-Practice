package leetcodeeveryday;

public class MinMaxGame {

	public static void main(String[] args) {
		MinMaxGame minMax=new MinMaxGame();
		int[] arr= {1,3,5,2,4,8,2,2};
		System.out.println(" Last value : "+minMax.minMaxGame(arr));

	}
	                                      // Approach one
//	 public int minMaxGame(int[] nums) {
//	       int n=nums.length;
//	        if(nums.length==1) {
//	        	return nums[0];
//	        }
//	        while(n>1) {
//	        	n=nums.length/2;
//	        	int[]temp=new int[n];
//	        	for(int i=0;i<n;i++) {
//	        		if(i%2==0) {
//	        			temp[i]=Math.min(nums[2*i], nums[2*i+1]);
//	        		}else {
//	        			temp[i]=Math.max(nums[2*i], nums[2*i+1]);
//	        		}
//	        	}
//	        	nums=temp;
//	        }
//	        return nums[0];
//	    }

	private int minMaxGame(int[] nums) {
		int n=nums.length/2;
		if(n==1) {
		return nums[0];	
	} 
		int[]temp=new int[n];
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				temp[i]=Math.min(nums[2*i], nums[2*i+1]);
			}else {
				temp[i]=Math.max(nums[2*i], nums[2*i+1]);
			}
		}
return minMaxGame(temp);
}
}
