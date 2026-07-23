package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// QUESTION: You are given an integer array height of length n. There are n vertical lines drawn such
// that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together
// with the x-axis form a container, such that the container contains the most water. Return the
// maximum amount of water a container can store.
// Example: Input: [1,8,6,2,5,4,8,3,7] -> Output: 49
public class ContainerwithMaxWaterTest {
    @Test
    public void testMaxArea() {
        List<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        Assert.assertEquals(calculateMaxArea(height), 49);
    }

    public int calculateMaxArea(List<Integer> height) {
        int i = 0, j = height.size() - 1;
        int maxArea = Integer.MIN_VALUE;
        while (i <= j) {
            int width = j - i;
            int length = Math.min(height.get(i), height.get(j));
            maxArea = Math.max(maxArea, width * length);

            if (height.get(i) < height.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}