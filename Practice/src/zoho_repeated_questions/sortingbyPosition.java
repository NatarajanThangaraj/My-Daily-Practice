package zoho_repeated_questions;
import java.util.Arrays;
public class sortingbyPosition {

	public static void main(String[] args) {
		int []arr= {13,2,4,15,12,10,5};
		int []arr1= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(sort(arr)));
		System.out.println(Arrays.toString(sort(arr1)));

	}

	private static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int max=arr[i];
			int min=arr[i];
			int odd=i,even=i;
			if(i%2==0) {
				while(odd<arr.length) {
					if(max<arr[odd]) {
						int temp=max;
						max=arr[odd];
						arr[odd]=temp;
						break;
					}
					odd++;
				}
			}
			else {
				while(even<arr.length-1) {
					if(min>arr[even]) {
						int temp=max;
						min=arr[even];
						arr[even]=temp;
						break;
			}
					even++;
		}
			}
		}
		return arr;
	}

}
