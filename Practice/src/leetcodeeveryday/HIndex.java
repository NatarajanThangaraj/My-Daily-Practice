package leetcodeeveryday;

public class HIndex {

	public static void main(String[] args) {
		int[] nums= {100, 50, 30, 20, 10};
System.out.println(hIndex(nums));
	}
public static int hIndex(int[] citations) {
       int[]nums=new int[5000];
       for(int x:citations) {
    	   nums[x]++;
       }
       int count=0;
       for(int i=4999;i>=0;i--) {
    	   count+=nums[i];
    	   if(i==count) {
    		   return i;
    	   }
       }
       return 0;
}

}
