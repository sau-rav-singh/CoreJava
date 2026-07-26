package InterviewPrep.BitManipulation;

public class SingleNumberIII {
    // QUESTION: Given an integer array nums where exactly two elements appear only once and all the other
    // elements appear exactly twice. Find the two elements that appear only once. You may return the answer in any order.
    // Example: Input: nums = [1,2,1,3,2,5]
    //          Output: [3,5] or [5,3]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int[] singleNumber(int[] nums) {
        // XOR of all numbers gives XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Find rightmost set bit (this bit differs between the two unique numbers)
        int rightmostBit = xor & (-xor);

        int num1 = 0, num2 = 0;

        // Partition numbers based on the rightmost bit
        for (int num : nums) {
            if ((num & rightmostBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = singleNumber(nums);
        System.out.println("Single numbers: " + result[0] + ", " + result[1]); // Output: 3, 5
    }
}
