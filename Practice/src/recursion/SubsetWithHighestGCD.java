package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetWithHighestGCD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			int arrLen=scan.nextInt();
			int subset=scan.nextInt();
			System.out.println(findAnswer(arrLen,subset));
		}
	}

	private static int[] findAnswer(int arrLen, int subset) {
		int[]arr=new int[arrLen];
		for(int i=1;i<=arrLen;i++) {
			arr[i-1]=i;
		}
		List<Integer>list=new ArrayList<>();
		 combinations(0,1,arr,list,subset);
		 int[]ans=new int[subset];
		 for(int i=0;i<subset;i++) {
			 ans[i]=list.get(i);
		 }
		 return ans;
	}

	private static void combinations(int index, int GCD, int[] arr,List<Integer>list, int size) {
		if(index==arr.length) {
			//if()
		}
		
	}

}
