package advanced.bitmanipulation;

public class SingleNumber {
    // QUESTION: Given a non-empty array of integers nums, every element appears twice except for one.
    // Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.
    // Example: Input: nums = [2,2,1]
    //          Output: 1
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all numbers
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); // Output: 4
    }
}
