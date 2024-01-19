package zoho_repeated_questions;

import java.util.Arrays;

public class alternateSort {

	public static void main(String[] args) {
		int[]arr= {8,5,7,4,6,3,1,2};
		System.out.println(Arrays.toString(alternate(arr)));

	}

	private static int[] alternate(int[] arr) {
		Arrays.sort(arr);
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
