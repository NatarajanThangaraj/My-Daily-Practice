package recursion;

import java.util.ArrayList;
import java.util.List;

/*Given a collection of candidate numbers (candidates) and a target number (target),
 *  find all unique combinations in candidates where the candidate numbers sum to target.
 *  Each number in candidates may only be used once in the combination.*/
public class CombinationSumII {

	public static void main(String[] args) {
		int[]arr= {1,2,4};
		int target=6;
		List<List<Integer>>list=new ArrayList<>();
		findCombinations(0,list,new ArrayList<Integer>(),arr,target);
			
	}

	private static void findCombinations(int i, List<List<Integer>> list, ArrayList<Integer> arrayList,int[]arr ,int target) {
		if(i==arr.length) {
			if(target==0) {
				list.add(new ArrayList<>(arrayList));
			}
			return;
		}
		arrayList.add(arr[i]);
		findCombinations(i+1,list,arrayList,arr,target-arr[i]);
		findCombinations(i,list,arrayList,arr,target);
	}

}
