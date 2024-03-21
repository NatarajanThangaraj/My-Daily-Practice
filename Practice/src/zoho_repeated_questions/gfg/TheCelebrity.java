package zoho_repeated_questions.gfg;

/*
 * banner
A celebrity is a person who is known to all but does not know anyone at a party.
 If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person.
 Here M[i][i] will always be 0.
Return the index of the celebrity, if there is no celebrity return -1.
Note: Follow 0 based indexing.
Follow Up: Can you optimize it to O(N)
 

Example 1:

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity*/
public class TheCelebrity {
	public static void main(String[] args) {
		int[][] matrix={{0,1,0},{0,0,0},{0,1,0}};
		int n=3;
		System.out.println(celebrity(matrix,n));
		
	}
	static int celebrity(int mat[][], int n)
    {
    int[]freq=new int[n];
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(mat[i][j]==1&&mat[j][i]==0) {
    			freq[j]++;
    		}
    	}
    }
   for(int i=0;i<n;i++) {
	   if(freq[i]==n-1) {
		   return i;
	   }
   }
   return -1;
    }
	

}
