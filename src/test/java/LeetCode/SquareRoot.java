package LeetCode;

import org.testng.Assert;

public class SquareRoot {
    public static void main(String[] args) {
        Assert.assertEquals(mySqrt(9), 3);
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x;
        long ans = 1;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
}
