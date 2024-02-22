package leetcodeeveryday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*ven an integer array nums representing the amount of money of each house, 
 * return the maximum amount of money you can rob tonight without alerting the police.
 * Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.*/
public class HouseRobber {

	public static void main(String[] args) {
		HouseRobber money = new HouseRobber();
		int[] monArr = {2,1,1,2};//money.getMoneyArray();
		System.out.print("Highest money :" + money.robMoney(monArr));

	}

	private int robMoney(int[] monArr) {
		int[]arr=new int[monArr.length];
		arr[0]=monArr[0];
		arr[1]=Math.max(monArr[0], monArr[1]);
		for(int i=2;i<monArr.length;i++) {
			arr[i]=Math.max(arr[i-1], arr[i-2]+monArr[i]);
		}
		//System.out.println(Arrays.toString(arr));
		return arr[monArr.length-1];
	}

	int[] getMoneyArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Length : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter array [" + i + "] :");
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;

	}

}
