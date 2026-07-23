package Linkedin;

public class StockBuySell {
    // QUESTION: Given an array of stock prices where prices[i] is the price on day i, find the
    // maximum profit you can achieve by buying on one day and selling on a different day.
    // Example: Input: [7, 1, 5, 3, 6, 4] -> Output: 5 (buy at 1, sell at 6)
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks(int[] prices) {
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
}