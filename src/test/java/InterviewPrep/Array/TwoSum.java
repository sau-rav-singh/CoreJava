package InterviewPrep.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// QUESTION: Given an array of integers, find two numbers such that they add up to a specific target.
// Example: Input: [2, 7, 11, 15], target = 9 -> Output: [0, 1] (indices)
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Approach 1: HashMap (for unsorted arrays)
        System.out.println("HashMap Approach: " + Arrays.toString(twoSumHashMap(nums, target)));

        // Approach 2: Two pointers (for sorted arrays)
        int[] sortedNums = {2, 7, 11, 15};
        System.out.println("Two Pointer Approach: " + Arrays.toString(twoSumTwoPointer(sortedNums, target)));
    }

    /**
     * Approach 1: Using HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Use when array is NOT sorted
     */
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int counter = target - nums[i];
            if (hs.containsKey(counter)) {
                ans[0] = i;
                ans[1] = hs.get(counter);
                break;
            } else {
                hs.put(nums[i], i);
            }
        }
        return ans;
    }

    /**
     * Approach 2: Two Pointers
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Use when array is ALREADY sorted
     * Returns 1-indexed positions as per LeetCode convention
     */
    public static int[] twoSumTwoPointer(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}

