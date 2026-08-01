package programs.dp;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 322: Coin Change
 *
 * Problem Statement:
 * You are given an integer array coins representing coins of different denominations and an integer
 * amount representing a total amount of money. Return the fewest number of coins that you need to make up that
 * amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * Constraints:
 * - 1 <= coins.length <= 12
 * - 1 <= coins[i] <= 2^31 - 1
 * - 0 <= amount <= 10^4
 */
public class CoinChange {

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        Assert.assertEquals(coinChangeDP(coins1, 11), 3);
        Assert.assertEquals(coinChangeBruteForce(coins1, 11), 3);

        int[] coins2 = {2};
        Assert.assertEquals(coinChangeDP(coins2, 3), -1);
    }

    /**
     * APPROACH 1: Dynamic Programming (Optimal)
     *
     * Time Complexity: O(N * amount)
     * - N coins, amount iterations.
     *
     * Space Complexity: O(amount)
     * - DP array of size amount + 1.
     */
    public static int coinChangeDP(int[] coins, int amount) {
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

    /**
     * APPROACH 2: Brute Force (Recursion)
     *
     * Time Complexity: O(N^amount)
     * - Exponential due to repeated calculations.
     *
     * Space Complexity: O(amount)
     * - Recursion stack depth.
     */
    public static int coinChangeBruteForce(int[] coins, int amount) {
        return coinChangeHelper(coins, amount, 0);
    }

    private static int coinChangeHelper(int[] coins, int remaining, int count) {
        if (remaining == 0) return count;
        if (remaining < 0) return -1;

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = coinChangeHelper(coins, remaining - coin, count + 1);
            if (result >= 0 && result < minCoins) {
                minCoins = result;
            }
        }
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }
}
