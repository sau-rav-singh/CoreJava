package advanced.dp;

import java.util.Arrays;

public class CoinChange {
    // QUESTION: You are given an integer array coins representing coins of different denominations and an integer
    // amount representing a total amount of money. Return the fewest number of coins that you need to make up that
    // amount. If that amount of money cannot be made up by any combination of the coins, return -1.
    // Example: Input: coins = [1,2,5], amount = 11
    //          Output: 3 (5 + 5 + 1)
    // Time Complexity: O(n * amount)
    // Space Complexity: O(amount)

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        System.out.println(coinChange(coins1, 11)); // Output: 3

        int[] coins2 = {2};
        System.out.println(coinChange(coins2, 3)); // Output: -1
    }
}
