package Linkedin;

import org.testng.Assert;

public class MinCoins {
    // QUESTION: Given an array of coin denominations and a target value, find the minimum number of coins
    // required to make up that value. You may assume that you have an infinite supply of each coin type.
    // Example: Input: coins = [1,2,5,10], value = 13 -> Output: 3 (10 + 2 + 1)
    public static void main(String[] args) {
        int[] coinArray={1,2,5,10};
        Assert.assertEquals(minCoins(coinArray,13),3);
        Assert.assertEquals(minCoins(coinArray,20),2);
    }

    private static int minCoins(int[] coinArray, int value) {
        int count=0;
        for(int i=coinArray.length-1;i>=0;i--){
            while(value>=coinArray[i]){
                value-=coinArray[i];
                count++;
            }
        }
        return count;
    }
}