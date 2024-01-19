package algorithemicProblems;

import java.util.Scanner;

/*The prime factors of  are  and .
What is the largest prime factor of a given number ?
2
10
17
answer:
5
17
Prime factors of  are ,{2,5} largest is 5.
Prime factor of 17 is 17 itself, hence largest is 17.
*/
public class LargestPrimeFactor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LargestPrimeFactor largestprime = new LargestPrimeFactor();
		//int t = in.nextInt();
		//for (int a0 = 0; a0 < t; a0++) {
			//long n = in.nextLong();
			System.out.println(largestprime.findFibo(4));
		//}
	}

	public long largestPrime(long n) {
		int mid = (int)n/2;
		boolean[] arr = new boolean[mid+1];
		int largest = 0;
		for (int i = 2; i <= mid; i++) {
			if (!arr[i]) {
				for (int j = i; j <= mid; j += i) {
					arr[j] = true;
				}
				if(n%i==0)
				largest=i;
			} 
		}
		return (largest==0)?0:largest;
	}
	 public static int findFibo(int n){
	      if(n==1){
	        return 1;
	      }
	      if(n==2)
	      return 1;
	      
	      return findFibo(n-1)+findFibo(n-2);
	    }
}