package Linkedin;

public class CharFrequency {
    //Given a string, calculate the frequency of characters in a string.
    //t:O(n),s:O(1)
    public static void main(String[] args) {
        String str = "picture perfect";
        int[] freq = new int[256];

        // Count each character's frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print the character frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}