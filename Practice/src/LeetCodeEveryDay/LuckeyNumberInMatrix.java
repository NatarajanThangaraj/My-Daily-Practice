package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.List;

public class LuckeyNumberInMatrix {

	public static void main(String[] args) {
		int[][]matrix={{3,7,8},{9,11,13},{15,16,17}};
		List<Integer>list=luckyNumbers(matrix);
		System.out.println(list);
	}
	 public static List<Integer> luckyNumbers (int[][] matrix) {
		 int max=Integer.MAX_VALUE;
	     int [] minarr=new int[matrix.length];
	     for(int i=0;i<matrix.length;i++) {
	    	 minarr[i]=max;
	     }
	     int []maxarr=new int[matrix[0].length];
	     for(int i=0;i<matrix.length;i++) {
	    	 for(int j=0;j<matrix[0].length;j++) {
	    		 if(minarr[i]>matrix[i][j]) {
	    			 minarr[i]=matrix[i][j];
	    		 }
	    		 if(maxarr[j]<matrix[i][j]) {
	    			 maxarr[j]=matrix[i][j];
	    		 }
	    	 }
	     }
	     List<Integer>list=new ArrayList<>();
	     for(int i=0;i<matrix.length;i++) {
	    	 for(int j=0;j<matrix[0].length;j++) {
	    		 if(minarr[i]==maxarr[j]) {
	    			 list.add(minarr[i]);
	    		 }
	    	 }
	     }
	     return list;
		 
	    }

}
