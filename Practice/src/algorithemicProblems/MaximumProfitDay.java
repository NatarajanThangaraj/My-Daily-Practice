package algorithemicProblems;

public class MaximumProfitDay {

	public static void main(String[] args) {
		MaximumProfitDay day = new MaximumProfitDay();
		int[] arr = { 7, 1, 5, 3, 6, 4 };// Utility.getArray();
		System.out.println(" Maximum Profit Day : " + day.maximumProfitDay(arr));
	}

	private int maximumProfitDay(int[] arr) {
		int day = 0, profit = 0, maxProfit = 0, previousStock = arr[0];
		for (int i = 1; i < arr.length; i++) {

			profit = arr[i] - previousStock;
			if (profit > 0 && maxProfit < profit) {
				day = i + 1;
				maxProfit = profit;
			}
			previousStock = Math.min(arr[i], previousStock);

		}
		return day;
	}

}
