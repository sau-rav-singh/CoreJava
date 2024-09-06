package Codewars;

import static org.testng.Assert.assertEquals;

public class MaxSum {

    //The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
    //Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}); should be 6: {4, -1, 2, 1}

    public static void main(String[] args) {
        assertEquals(6, sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    public static int sequence(int[] arr) {
        int maxSum=0,currentSum=0;
        for(int i:arr){
            currentSum+=i;
            if(currentSum<0){
                currentSum=0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
