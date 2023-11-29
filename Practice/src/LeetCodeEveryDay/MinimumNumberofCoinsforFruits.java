package LeetCodeEveryDay;

/*
 * You are at a fruit market with different types of exotic fruits on display.
 * You are given a 1-indexed array prices, where prices[i] denotes the number of coins needed to purchase the ith fruit.
 * Thefruit market has the following offer:
 * If you purchase the ith fruit at prices[i] coins, you can get the next i fruits for free.
 * Note that even if you can take fruit j for free, you can still purchase it for prices[j] coins to receive a new offer.
   Return the minimum number of coins needed to acquire all the fruits.
   
Input: prices = [1,10,1,1]
Output: 2
Explanation: You can acquire the fruits as follows:
- Purchase the 1st fruit with 1 coin, you are allowed to take the 2nd fruit for free.
- Take the 2nd fruit for free.
- Purchase the 3rd fruit for 1 coin, you are allowed to take the 4th fruit for free.
- Take the 4th fruit for free.
It can be proven that 2 is the minimum number of coins needed to acquire all the fruits.
   */
public class MinimumNumberofCoinsforFruits {

	public static void main(String[] args) {
		MinimumNumberofCoinsforFruits obj = new MinimumNumberofCoinsforFruits();
		int[] prices = { 3, 1, 4, 1, 5, 9, 2, 6 };
		System.out.println(obj.totalCoins(prices));
	}

	public int totalCoins(int[] prices) {
		int sum = prices[0];
		int len = prices.length;
		int start = 0;
		while (start < len - 2) {

			if ((len%2!=0)&&prices[start + 1] < prices[start + 2]) {
				sum += prices[++start];

			} else {
				sum += prices[start += 2];
			}

		}
		return sum;
	}

}
