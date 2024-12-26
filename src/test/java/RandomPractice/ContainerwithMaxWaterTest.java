package RandomPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerwithMaxWaterTest {
    public int calculateMaxArea(List<Integer> height) {
        int i = 0, j = height.size() - 1;
        int ans = Integer.MIN_VALUE;
        while (i < j) {
            int minH = Math.min(height.get(i), height.get(j));
            int area = minH * (j - 1);
            ans = Math.max(area, ans);
            if (height.get(i) < height.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }

    @Test
    public void testMaxArea() {
        List<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        Assert.assertEquals(calculateMaxArea(height), 49, "Max area does not match the expected value!");
    }

}
