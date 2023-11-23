package zoho_repeated_questions;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;


public class mergeSortedArrayGS {

	public static void main(String[] args) {
		int[]Arr1= {2,4,5,6,7,9,10,13};
		int[]Arr2= {2,3,4,5,6,7,8,9,11,15};
		System.out.println(Arrays.toString(mergetheSortedArray(Arr1,Arr2)));
	}

	private static int[] mergetheSortedArray(int[] arr1, int[] arr2) {
		Set<Integer>set=new TreeSet(); 
		for(int x:arr1)
			set.add(x);
		for(int x:arr2)
			set.add(x);
		int ans[]=new int[set.size()];
		int i=0;
		for(int x:set)
			ans[i++]=x;
		return ans ;
	}

}
