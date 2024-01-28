package matrix;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		int n=4;
		int k=2;
		System.out.println(combine(n,k));
	}
	 public static List<List<Integer>> combine(int n, int k) {
		 List<List<Integer>>list=new ArrayList<>();
		 int[]arr=new int[n];
			for(int i=1;i<=n;i++) {
				arr[i-1]=i;
			}
			 getCombinations(0,list,arr,new ArrayList<>(),k);
			 return list;
	    }
	private static void getCombinations(int index,List<List<Integer>> list, int[] arr, ArrayList<Integer> arrayList,
			int k) {
		if(index==arr.length) {
			if(arrayList.size()==k) {
				list.add(new ArrayList<>(arrayList));
				return ;
			}
			return;
		}
		if(arrayList.size()<k) {
		arrayList.add(arr[index]);
		getCombinations(index+1,list,arr,arrayList,k);
		arrayList.remove(arrayList.get(arrayList.size()-1));
		}
		getCombinations(index+1,list,arr,arrayList,k);
		
	}

}
