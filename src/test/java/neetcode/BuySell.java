package neetcode;


public class BuySell {
    //Best Time to Buy and Sell Stock: Given array of prices [7,1,5,3,6,4]
    //find max profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //Buy at 1, sell at 6 = profit 5.

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
