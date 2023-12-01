package projecteuler;
/*If we list all the natural numbers below  that are multiples of  or , we get  and . 
 *The sum of these multiples is .
Find the sum of all the multiples of  or  below .*/
public class MultipleofThreeorFive {

	public static void main(String[] args) {
		System.out.println(new MultipleofThreeorFive().findSum(10));
	}
	public  int findSum(int n){
	    int sum=0;
	    n=n-1;
	    int multiple3=3*((n/3)*(n/3+1)/2);
	    int multiple5=5*((n/5)*(n/5+1)/2);
	    int multiple15=15*((n/15)*(n/15+1)/2);
	    return (multiple3+multiple5)-multiple15;
	  }

}
