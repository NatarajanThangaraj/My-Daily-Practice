package LeetCodeEveryDay;

import java.util.Arrays;

/*The next permutation of an array of integers is the next lexicographically greater permutation of its integer. 
 * More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, 
 * then the next permutation of that array is the permutation that follows it in the sorted container.
 *  If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).*/
public class NextPermutation {

	public static void main(String[] args) {
		NextPermutation next=new NextPermutation();
		int[] arr= {1,3,2};
		next.nextPermutation(arr);
	}
	 public void nextPermutation(int[] nums) {
		 int temp=0;
		 boolean flag=false;
	        for(int i=nums.length-1;i>0;i--) {
	        	if(nums[i-1]<nums[i]) {
	        		temp=nums[i-1];
	        		nums[i-1]=nums[i];
	        		nums[i]=temp;
	        		flag=true;
	        		break;
	        	}
	        }
	        if(!flag) {
	        	Arrays.sort(nums);
	        }
	        System.out.println(Arrays.toString(nums));
	    }

}
