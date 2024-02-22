package codechef;

import java.util.Scanner;

class TheManCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan=new Scanner(System.in);
	System.out.print(" Enter the number of test cases : ");
	int n=scan.nextInt();
	for(int i=0;i<n;i++){
		System.out.print(" Enter the number : ");
	    int num=scan.nextInt();
	    int max=findMax(num);
	    int min;
	    if(num%3!=0) {
	     min=num/3;
	    min+=1;
	    }
	    else {
	    	min=num/3;
	    }
	    System.out.println(max+" "+min);
	    
	}

	}
	private static int findMax(int n){
	    int count=0;
	    for(int i=1;i<=n;i++){
	        if(i%2!=0){
	            count++;
	        }
	    }
	    return count;
	}
	/*You are given an array 
�
A of 
�
N elements. In one operation you can swap any two elements if they are not adjacent.
That is, you can pick two indices 
�
i and 
�
j (
1
≤
�
<
�
≤
�
1≤i<j≤N) such that 
�
−
�
>
1
j−i>1, and swap 
�
�
A 
i
​
  and 
�
�
A 
j
​
 .

Using this operation finitely many (possibly, zero) times, is it possible to turn 
�
A into a sorted array?*/
	
	/*In Chefland, it is illegal for two people to use adjacent urinals at the same time (as it should be).
	It is also obviously illegal for them to use the same urinal at the same time (as it definitely should be).

	There are 
	
	N urinals in a row in Chefland.
	Find both the maximum and the minimum number of people that can use these 
	
	N urinals simultaneously, such that there is no place for another person to join.*/
}
