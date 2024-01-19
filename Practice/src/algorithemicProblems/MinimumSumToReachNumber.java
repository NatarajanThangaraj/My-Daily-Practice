package algorithemicProblems;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumSumToReachNumber {

	public static void main(String[] args) {
		MinimumSumToReachNumber search=new MinimumSumToReachNumber();
		int[][] arr= {{4,5,6,7},{3,2,4,1},{9,11,5,7},{2,4,6,8}};
	    System.out.println(search.breadhFirstSearch(arr));	
	}

	private int breadhFirstSearch(int[][] arr) {
		Point p1=new Point();
		Point p2=new Point();
		Deque<Point>queue=new LinkedList<Point>();
		p1.x=0;
		p1.y=0;
		p1.sum=arr[0][0];
		queue.add(p1);
		while(queue.size()!=0) {
			
		}
		return Math.min(p1.sum, p1.sum);
	}

}
class Point {
	int x;
	int y;
	 int sum;
	Point() {
	}
}
