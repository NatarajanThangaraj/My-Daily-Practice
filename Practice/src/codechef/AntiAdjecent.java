package codechef;

import java.util.Scanner;

/*In Chefland, it is illegal for two people to use adjacent urinals at the same time (as it should be).
It is also obviously illegal for them to use the same urinal at the same time (as it definitely should be).

There are 

N urinals in a row in Chefland.
Find both the maximum and the minimum number of people that can use these 

N urinals simultaneously, such that there is no place for another person to join.*/
public class AntiAdjecent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int n= scan.nextInt();
		int n=1;
		for(int j=0;j<n;j++) {
			//int len=scan.nextInt();
			int[] arr={6,6,2};//new int[len];
//			for(int i=0;i<len;i++) {
//				arr[i]=scan.nextInt();
//			}
			int len=arr.length;
			boolean flag =false;
			for(int i=0;i<len;i++) {
//				flag=true;
				for(int x=i+1;x<len;x++) {
					flag=true;
					if(arr[i]>arr[j]) {
						flag=false;
						if(j-i>1) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						}
					}
				}
			}
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}

	}

}
