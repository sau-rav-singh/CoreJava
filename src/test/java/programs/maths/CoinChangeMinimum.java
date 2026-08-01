package programs.maths;

import org.testng.Assert;

/**
 * Coin Change Minimum (Greedy Approach)
 *
 * Problem Statement:
 * Given an array of coin denominations and a target value, find the minimum number of coins
 * required to make up that value. You may assume that you have an infinite supply of each coin type.
 * Note: This greedy approach works only for canonical coin systems (like standard currency).
 *
 * Constraints:
 * - 1 <= coins.length <= 100
 * - 1 <= coins[i] <= 10^4
 * - 1 <= value <= 10^4
 */
public class CoinChangeMinimum {

    public static void main(String[] args) {
        int[] coinArray = {1, 2, 5, 10};
        Assert.assertEquals(minCoinsGreedy(coinArray, 13), 3);
        Assert.assertEquals(minCoinsGreedy(coinArray, 20), 2);
    }

    /**
     * APPROACH: Greedy (Optimal for canonical coin systems)
     *
     * Time Complexity: O(N)
     * - Single pass through sorted coins.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    private static int minCoinsGreedy(int[] coinArray, int value) {
        int count = 0;
        for (int i = coinArray.length - 1; i >= 0; i--) {
            while (value >= coinArray[i]) {
                value -= coinArray[i];
                count++;
            }
        }
        return count;
    }
}
