package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * 
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
*/
public class InsertInterval {

	public static void main(String[] args) {
		int[][] mat= {{1,3},{6,9}};
		int[] arr= {2,5};
		List<int[]>list=insert(mat,arr);
		Collections.sort(list,(a,b)->a[0]-b[0]);
		int[][]ans=new int[list.size()][2];
		for(int i=0;i<list.size();i++) {
			ans[i]=list.get(i);
			System.out.println(Arrays.toString(list.get(i)));
		}
	}
public static List<int[]> insert(int[][] matrix, int[] arr) {
        List<int[]>ans=new ArrayList<int[]>();
        if(matrix.length==0) {
        	ans.add(arr);
        	return ans;
        }
       
        for(int i=0;i<matrix.length;i++) {
        	if(matrix[i][1]<arr[0]||matrix[i][0]>arr[1]) {
        		ans.add(matrix[i]);
        	}
        }
        for(int i=0;i<matrix.length;i++) {
        	if(matrix[i][0]<=arr[0]&&matrix[i][1]>=arr[0]) {
        		arr[0]=matrix[i][0];
        	}
        	if(matrix[i][0]<=arr[1]&&matrix[i][1]>=arr[1]) {
        		arr[1]=matrix[i][1];
        	}
        }
        ans.add(arr);
        return ans;
    }

}
/*
 * []
[2,5]
[[3,5],[8,10]]*
[1,2]
[[1,3],[6,9]]*
[11,12]
[[1,3],[6,9]]*
[2,5]
[[1,2],[3,5],[8,10]]
[2,9]
[[1,3],[6,9]]
[2,7]
[[1,3],[6,9]]
[4,7]
[[1,3],[6,9]]
[3,6]*/
