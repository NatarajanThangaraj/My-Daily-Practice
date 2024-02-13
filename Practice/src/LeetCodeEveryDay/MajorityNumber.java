package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityNumber {

	public static void main(String[] args) {
		int[]arr= {2,2,1,1,1,2,2};
		System.out.println(" Mejority Element : "+majorityElement(arr));
	}
	 public static List<Integer> majorityElement(int[] nums) {
		 int n=nums.length/3;
		 List<Integer>list=new ArrayList<>();
		Map<Integer,Integer>map=new HashMap<>();
	        for(int x:nums) {
	        	map.put(x, map.getOrDefault(x, 0)+1);
	        }
	       for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
	    	   if(entry.getValue()>n) {
	    		   list.add(entry.getKey());
	    	   }
	       }
	       return list;
	    }

}
