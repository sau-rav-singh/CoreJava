package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode (Various): Find Second Smallest and Second Largest
 *
 * Problem Statement:
 * Given an array of integers, find the second smallest and/or second largest elements.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class SecondSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 20, 4, 5, 8, 6, 10};

        Assert.assertEquals(findSecondLargestOptimal(arr), 10);
        Assert.assertEquals(findSecondSmallestOptimal(arr), 3);

        Assert.assertEquals(findSecondLargestSort(arr), 10);
        Assert.assertEquals(findSecondSmallestSort(arr), 3);

        Assert.assertEquals(findSecondLargestBruteForce(arr), 10);
        Assert.assertEquals(findSecondSmallestBruteForce(arr), 3);

        // Test with array where all elements are same
        int[] sameArr = {5, 5, 5, 5};
        Assert.assertEquals(findSecondLargestOptimal(sameArr), -1);
    }

    /**
     * APPROACH 1: Single Pass (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int findSecondLargestOptimal(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (element > secondLargest && element != firstLargest) {
                secondLargest = element;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static int findSecondSmallestOptimal(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j < secondSmallest && j != smallest) {
                secondSmallest = j;
            }
        }

        return secondSmallest;
    }

    /**
     * APPROACH 2: Sorting
     *
     * Time Complexity: O(N log N)
     * - Sorting takes O(N log N) time.
     *
     * Space Complexity: O(log N)
     * - Arrays.sort() uses O(log N) auxiliary space.
     */
    public static int findSecondLargestSort(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        int[] sorted = array.clone();
        Arrays.sort(sorted);
        int n = sorted.length;
        for (int i = n - 2; i >= 0; i--) {
            if (sorted[i] != sorted[n - 1]) {
                return sorted[i];
            }
        }
        return -1;
    }

    public static int findSecondSmallestSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;
        }
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[0]) {
                return sorted[i];
            }
        }
        return Integer.MAX_VALUE;
    }

    /**
     * APPROACH 3: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each element, compare with all others.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int findSecondLargestBruteForce(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            boolean isLargest = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    isLargest = false;
                    break;
                }
            }
            if (isLargest) {
                firstLargest = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != firstLargest) {
                boolean isSecondLargest = true;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > array[i] && array[j] != firstLargest) {
                        isSecondLargest = false;
                        break;
                    }
                }
                if (isSecondLargest) {
                    secondLargest = array[i];
                }
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static int findSecondSmallestBruteForce(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            boolean isSmallest = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    isSmallest = false;
                    break;
                }
            }
            if (isSmallest) {
                smallest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != smallest) {
                boolean isSecondSmallest = true;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < arr[i] && arr[j] != smallest) {
                        isSecondSmallest = false;
                        break;
                    }
                }
                if (isSecondSmallest) {
                    secondSmallest = arr[i];
                }
            }
        }

        return secondSmallest;
    }
}

