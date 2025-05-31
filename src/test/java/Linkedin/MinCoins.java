package Linkedin;

import org.testng.Assert;

public class MinCoins {
    //Given below array represents coin value, find number of coin required to match the value
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