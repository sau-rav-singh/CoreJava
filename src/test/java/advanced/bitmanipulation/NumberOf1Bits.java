package advanced.bitmanipulation;

public class NumberOf1Bits {
    // QUESTION: Write a function that takes the binary representation of an unsigned integer and returns the
    // number of '1' bits it has (also known as the Hamming weight).
    // Example: Input: n = 11 (binary: 1011)
    //          Output: 3
    // Time Complexity: O(1) - at most 32 iterations for 32-bit integer
    // Space Complexity: O(1)

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Check if least significant bit is 1
            n >>>= 1; // Unsigned right shift
        }
        return count;
    }

    // Alternative: Brian Kernighan's algorithm
    public static int hammingWeightOptimized(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // Clear the least significant set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11; // binary: 1011
        System.out.println(hammingWeight(n)); // Output: 3
        System.out.println(hammingWeightOptimized(n)); // Output: 3
    }
}
