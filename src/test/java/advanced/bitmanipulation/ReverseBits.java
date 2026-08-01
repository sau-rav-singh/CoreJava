package advanced.bitmanipulation;

public class ReverseBits {
    // QUESTION: Reverse bits of a given 32 bits unsigned integer.
    // Example: Input: n = 00000010100101000001111010011100
    //          Output: 00111001011110000010100101000000
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Shift result left
            result |= (n & 1); // Add least significant bit of n
            n >>>= 1; // Shift n right (unsigned)
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        int reversed = reverseBits(n);
        System.out.println(Integer.toBinaryString(reversed)); // Output: 111001010000111010010100000000
    }
}
