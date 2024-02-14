//import java.util.ArrayList;
//import java.util.List;
package algorithemicProblems;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllGoodIndices {

	public static void main(String[] args) {
		FindAllGoodIndices goodIndex=new FindAllGoodIndices();
		int[] arr= {478184,863008,716977,921182,182844,350527,541165,881224};
		int k=1;
		System.out.println(goodIndex.findGoodIndex(arr,k));

	}

	private List<Integer> findGoodIndex(int[] arr, int k) {
		
		List<Integer>list=new ArrayList<>();
		Set<Integer>set=new HashSet<>();
		set.addAll(new ArrayList(Arrays.asList(arr)));
		if(set.size()==1) {
			return list;
		}
		for(int i=k;i<arr.length-k;i++) {
			if(isGoodIndex(arr,i,k)) {
				list.add(i);
			}
		}
		return list;
	}

	private boolean isGoodIndex(int[] arr, int index, int k) {
		for(int i=index+1;i<index+k;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		for(int i=index-k;i<index-1;i++) {
			if(arr[i]<arr[i+1]) {
				return false;
			}
		}
		return true;
	}

}


