package leetcodeeveryday;

import java.util.Arrays;

public class FindTheTownJudge {

	public static void main(String[] args) {
		int n = 2;
		int[][]trust = {{1,2}};
     System.out.println(findJudge(n,trust));
	}
	public static int findJudge(int n, int[][] trust) {
		 int[] arr=new int[n+1];
	        arr[0]=1;
	        boolean[] bool=new boolean[n+1];
	        bool[0]=true;
	        for(int i=0;i<trust.length;i++){
	         arr[trust[i][1]]++;
	         bool[trust[i][0]]=true;
	        }
	        for(int i=1;i<n+1;i++){
	            if(bool[i]==false&&arr[i]==n-1){
	                return i;
	            }
	        }
	    return -1;
    }

}
