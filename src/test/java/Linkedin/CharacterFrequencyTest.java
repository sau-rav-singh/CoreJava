package Linkedin;

public class CharacterFrequencyTest {
    // QUESTION: Given a string, calculate the frequency of each character and print the results.
    // Example: Input: "Picture Perfect" -> Output: P: 2, i: 1, c: 2, t: 2, u: 1, r: 2, e: 3, f: 1, : 1
    //t:O(n),s:O(1)
    public static void main(String[] args) {
        calculateFrequency("Picture Perfect");
    }

    public static void calculateFrequency(String str) {
        int[] countArr = new int[256];
        char[] arr = str.toCharArray();
        for (char c : arr) {
            countArr[c]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) System.out.println((char) i + " :" + countArr[i]);
        }
    }
}