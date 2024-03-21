package matrix;

import java.util.Arrays;

public class ArrowsToBurstBalloons {

	public static void main(String[] args) {
		int[][]matrix= {{-2147483646,-2147483645},{2147483646,2147483647}};
		System.out.println("output : "+findMinArrowShots(matrix));

	}
	public static  int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->{
        if(a[0]<b[0]) {
        	return -1;
        }else if(a[0]>b[0]){
        	return 1;
        }else {
        	if(a[1]<b[1]) {
        		return -1;
        	}
        	return 1;
        }
        	
        	});
        printoo(points);
        int i,n=points.length,currNum=points[0][1],arrow=1;
        for( i=1;i<n;i++){
        	if(points[i][1]<currNum) {
        		currNum=points[i][1];
        	}else if(currNum<points[i][0]) {
        		arrow++;
        		currNum=points[i][1];
        	}
        }
        return arrow;
    }
	static void printoo(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			System.out.print(Arrays.toString(matrix[i]));
		}
	}

}
