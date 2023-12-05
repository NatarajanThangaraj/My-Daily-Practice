package LeetCodeEveryDay;
/*You are given an integer n, the number of teams in a tournament that has strange rules:
If the current number of teams is even, each team gets paired with another team.
 A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired.
 A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided
Input: n = 7
Output: 6
Total number of matches = 3 + 2 + 1 = 6.*/
public class NumberOfMatchs {

	public static void main(String[] args) {
		NumberOfMatchs num=new NumberOfMatchs();
		System.out.println(num.numberOfMatches(7));
	}
	public int numberOfMatches(int n) {
        int total=0;
       while(n!=1){
           total+=n/2;
           n=n-n/2;
          
       }
       return total;
    } 

}
