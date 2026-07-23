package Linkedin;

public class MaxMinOccurence {
// QUESTION: Given a string, find the character with the maximum frequency and the character
// with the minimum frequency (excluding characters that don't appear).
// Example: Input: "TeeeessstAutooooooomationn" -> Output: o: 8, m: 1

    public static void main(String[] args) {
        maxMinOccurence();
    }

    static void maxMinOccurence() {
        int[] counter = new int[256];
        for (char c : "TeeeessstAutooooooomationn".toCharArray()) {
            counter[c]++;
        }

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > maxCount) {
                maxCount = counter[i];
                maxChar = (char) i;
            }
            if (counter[i] >= 1 && counter[i] < minCount) {
                minCount = counter[i];
                minChar = (char) i;
            }
        }
        System.out.println(maxChar + ": " + maxCount);
        System.out.println(minChar + ": " + minCount);
    }
}