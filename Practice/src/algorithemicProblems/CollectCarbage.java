/*You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house.
 *  garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively.
 *  Picking up one unit of any type of garbage takes 1 minute.
 *  You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.
 *  There are three garbage trucks in the city, each responsible for picking up one type of garbage.
 *  Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.
 *  Only one garbage truck may be used at any given moment.
 While one truck is driving or picking up garbage, the other two trucks cannot do anything.
Return the minimum number of minutes needed to pick up all the garbage.
Input: garbage = ["MMM","PGM","GP"], travel = [3,10]
Output: 37
Explanation:
The metal garbage truck takes 7 minutes to pick up all the metal garbage.
The paper garbage truck takes 15 minutes to pick up all the paper garbage.
The glass garbage truck takes 15 minutes to pick up all the glass garbage.
It takes a total of 7 + 15 + 15 = 37 minutes to collect all the garbage.*/
package algorithemicProblems;

public class CollectCarbage {

	public static void main(String[] args) {
		System.out.println(new CollectCarbage().collect( new String[]{"MMM","PGM","GP"},new int[] {3,10}));
	}
	public int collect(String[] garbage,int[] travel) {
		int metal=0,paper=0,glass=0;
		for(int i=garbage.length-1;i>=0;i--) {
			for(char x:garbage[i].toCharArray()) {
				if(x=='P') {
					paper++;
				}else if(x=='M') {
					metal++;
				}else {
					glass++;
				}
			}
			
			
		}
		return paper+metal+glass;
	}
}
