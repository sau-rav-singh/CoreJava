package programs.array;

import org.testng.Assert;

/**
 * LeetCode 121: Best Time to Buy and Sell Stock
 *
 * Problem Statement:
 * Given an array of stock prices where prices[i] is the price on day i, find the
 * maximum profit you can achieve by buying on one day and selling on a different day.
 *
 * Constraints:
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 */
public class StockBuySell {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(maxProfitOptimal(prices), 5);
        Assert.assertEquals(maxProfitBruteForce(prices), 5);
    }

    /**
     * APPROACH 1: Single Pass (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int maxProfitOptimal(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price > buyPrice) {
                int profit = price - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each day, check all future days for selling.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int maxProfitBruteForce(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
