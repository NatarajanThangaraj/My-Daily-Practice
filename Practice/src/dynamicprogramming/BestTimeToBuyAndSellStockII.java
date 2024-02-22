package dynamicprogramming;

public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		int [] arr= {6,1,3,2,4,7};
System.out.println(maxProfit(arr));
	}
	private static int maxProfit(int[] arr) {
		int maxProfit=0,subProfit=0,currentProfit=0,minBuy=arr[0],currentBuy=Math.min(arr[0],arr[1]);
		
		for(int i=1;i<arr.length;i++) {
			currentProfit=arr[i]-minBuy;
			if(currentProfit>maxProfit) {
				maxProfit=currentProfit;
			}
			if(arr[i]>currentBuy) {
				subProfit+=arr[i]-currentBuy;
				currentBuy=arr[i];
			}
			if(arr[i]<minBuy) {
				minBuy=arr[i];
			}
			if(arr[i]<currentBuy) {
				currentBuy=arr[i];
			}
			System.out.println(currentBuy+" "+subProfit);
		}
		
		return (subProfit>maxProfit)?subProfit:maxProfit;
	}

}
