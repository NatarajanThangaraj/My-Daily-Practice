package dynamicprogramming;
/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[]arr= {7,1,5,3,6,4};
		System.out.println("Maximum Profit to Buy a stock : "+maxProfit(arr));
	}

	private static int maxProfit(int[] arr) {
		int maxProfit=0,currentProfit=0,minBuy=arr[0];
		for(int i=1;i<arr.length;i++) {
			currentProfit=arr[i]-minBuy;
			if(currentProfit>maxProfit) {
				maxProfit=currentProfit;
			}
			if(arr[i]<minBuy) {
				minBuy=arr[i];
			}
		}
		return maxProfit;
	}

}
