package leetcodeeveryday;

import java.util.Arrays;

public class DivideArraIntoArrays {

	public static void main(String[] args) {
		int[] arr= {1,3,4,8,7,9,3,5,1};
		int key=2;
		int[][]ans=new int[arr.length/3][3];
		findArrays(ans,arr,key);
		for(int i=0;i<arr.length/3;i++) {
		System.out.println(Arrays.toString(ans[i]));

	}
	}

	private static void findArrays(int[][]ans,int[] arr, int key) {
		Arrays.sort(arr);
		int index=0;
		for(int i=0;i<arr.length-2;i+=3) {
			if(arr[i+1]-arr[i]<=key&&arr[i+2]-arr[i+1]<=key&&arr[i+2]-arr[i]<=key) {
				ans[index++]=new int[] {arr[i],arr[i+1],arr[i+2]};
			}
			else {
				return;
			}
		}
	
}
}
