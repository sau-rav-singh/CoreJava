package programs.dp;

public class MaximumProductSubarray {
    // QUESTION: Given an integer array nums, find the contiguous subarray within an array (containing at least
    // one number) which has the largest product.
    // Example: Input: nums = [2,3,-2,4]
    //          Output: 6 ([2,3])
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // If current number is negative, swap max and min
            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(num, maxProduct * num);
            minProduct = Math.min(num, minProduct * num);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println(maxProduct(nums1)); // Output: 6

        int[] nums2 = {-2, 0, -1};
        System.out.println(maxProduct(nums2)); // Output: 0
    }
}
