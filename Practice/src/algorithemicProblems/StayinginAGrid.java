/*LeetCode - 2120.medium level 
 * Input: n = 3, 
 * startPos = [0,1],
 *  s = "RRDDLU"
Output: [1,5,4,3,1,0]*/
package algorithemicProblems;

import java.util.Arrays;

public class StayinginAGrid {

	public static void main(String[] args) {
		StayinginAGrid obj=new StayinginAGrid();
		int n=3;
		int[] startPos= {0,1};
		String s="RRDDLU";
		System.out.println(Arrays.toString(obj.executeInstructions(n, startPos, s)));
	}
public int[] executeInstructions(int n, int[] startPos, String s) {
	int[] ans=new int[s.length()];
      int index=0;
	for(int i=0;i<s.length();i++) {
		ans[index++]=move(n,startPos[0],startPos[1],s,i);
		}
		return ans;
}
public int move(int n,int row,int col,String s,int start) {
	int count=0;
	for(int j=start;j<s.length();j++) {
		if(s.charAt(j)=='R'&&col<n-1) {
			count++;
			col++;
		}else if(s.charAt(j)=='L'&&col>0) {
			count++;
			col--;
		}else if(s.charAt(j)=='U'&&row>0) {
			count++;
			row--;
		}else if(s.charAt(j)=='D'&&row<n-1){
			count++;
			row++;
		}
		else {
			break;
		}
}
	return count;
}   
}

