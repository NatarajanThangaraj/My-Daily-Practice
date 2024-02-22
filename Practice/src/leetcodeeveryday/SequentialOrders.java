package leetcodeeveryday;

import java.util.ArrayList;
import java.util.List;
/*Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]*/
public class SequentialOrders {

	public static void main(String[] args) {
		int low=234;
		int high=2314;
		System.out.println(new SequentialOrders().sequentialDigits(low,high));
	}
	public  List<Integer> sequentialDigits(int low, int high) {
		List<Integer>list=new ArrayList<>();
		String nums="123456789";
		int x,j;
		for(int i=2;i<=9;i++) {
			x=i;
			j=0;
		while(Integer.valueOf(nums.substring(j,x))<=high) {
			System.out.println(j+" "+x);
			if(Integer.valueOf(nums.substring(j,x))>=low)
		list.add(Integer.valueOf(nums.substring(j,x)));
				x++;
				j++;
				if(x==10) {
					j=0;
					break;
				}
			}
		}
		return list;
         
    }
	private void recursive(List<Integer> list, String nums, String temp, int high) {
		if(Integer.valueOf(temp)>high) {
			return;
		}
	}
	

}
