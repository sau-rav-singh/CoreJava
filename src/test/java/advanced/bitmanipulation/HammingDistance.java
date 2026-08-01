package advanced.bitmanipulation;

public class HammingDistance {
    // QUESTION: The Hamming distance between two integers is the number of positions at which the corresponding
    // bits are different. Given two integers x and y, return the Hamming distance between them.
    // Example: Input: x = 1, y = 4
    //          Output: 2 (1: 0001, 4: 0100)
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR gives 1 where bits differ
        int distance = 0;

        while (xor != 0) {
            distance += xor & 1; // Count set bits
            xor >>>= 1; // Unsigned right shift
        }

        return distance;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4)); // Output: 2
        System.out.println(hammingDistance(3, 1)); // Output: 1
    }
}
