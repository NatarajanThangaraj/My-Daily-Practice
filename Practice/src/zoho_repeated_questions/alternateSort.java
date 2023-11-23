package zoho_repeated_questions;

import java.util.Arrays;

public class alternateSort {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(alternate(arr)));

	}

	private static int[] alternate(int[] arr) {
		int temp=0,i=0,j=arr.length-1;
		int[]ans=new int[j+1];
		while(temp<arr.length) {
			ans[temp++]=arr[j--];
			if(temp<arr.length)
			ans[temp++]=arr[i++];
			
		}
			
		return ans;
	}

}
