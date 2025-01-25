package Linkedin;

public class CharacterFrequencyTest {
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