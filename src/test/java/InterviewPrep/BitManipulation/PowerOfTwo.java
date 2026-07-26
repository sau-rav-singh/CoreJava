package InterviewPrep.BitManipulation;

public class PowerOfTwo {
    // QUESTION: Given an integer n, return true if it is a power of two. Otherwise, return false.
    // Example: Input: n = 1
    //          Output: true
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        // A power of two has exactly one bit set
        // n & (n - 1) clears the least significant bit
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));   // Output: true
        System.out.println(isPowerOfTwo(16));  // Output: true
        System.out.println(isPowerOfTwo(3));   // Output: false
        System.out.println(isPowerOfTwo(0));   // Output: false
    }
}
