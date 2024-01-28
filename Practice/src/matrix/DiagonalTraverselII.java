package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraverselII {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		DiagonalTraverselII object=new DiagonalTraverselII ();
		List<List<Integer>>list=new ArrayList<>();
		list.add(new ArrayList(Arrays.asList(new Integer[] {1,2,3,4,5})));
		list.add(new ArrayList(Arrays.asList(new Integer[] {6,7})));
		list.add(new ArrayList(Arrays.asList(new Integer[] {12,14,15,16,17})));
		list.add(new ArrayList(Arrays.asList(new Integer[] {9,10,11})));
		list.add(new ArrayList(Arrays.asList(new Integer[] {8})));
		System.out.println(Arrays.toString(object.findDiagonalOrder(list)));

	}
	 public int[] findDiagonalOrder(List<List<Integer>> nums) {
		//List<Integer>list=new ArrayList<>();
		 Map<Integer,List<Integer>>map=new HashMap<>();
		int max=0,size=0;
		for(List<Integer> x:nums) {
			size+=x.size();
			if(max<x.size()) {
				max=x.size();
			}
		}
		for(int i=0;i<nums.size();i++) {
			getDiagonalNumbers(map,i,0,nums);
		}
		
	    for(int i=0;i<max;i++) {
	    	getDiagonalNumbers(map,nums.size()-1,i,nums);
	    }
	    System.out.println(map);
	    int[]arr=new int[size];
	    int index=0;
	    for(int i=0;i<map.size();i++) {
	    	List<Integer>list=map.get(i);
	    	for(int k=0;k<list.size();k++) {
	    		arr[index++]=list.get(k);
	    	}
	    }
	    return arr;
	    }
	 private void getDiagonalNumbers(Map<Integer,List<Integer>>map,int n,int ind,List<List<Integer>>nums) {
		int index=ind,listNum=n,key=index+listNum;
		List<Integer>list=new ArrayList<>();
			while(listNum>=0) {
				if(nums.get(listNum).size()-1>=index)
				list.add(nums.get(listNum).get(index));
				listNum--;
				index++;
			}
			map.put(key, list);
	 }

}
