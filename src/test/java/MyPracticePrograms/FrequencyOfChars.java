package MyPracticePrograms;

public class FrequencyOfChars {

    //calculate frequency of each character of string without using HashMap.

    public static void main(String[] args) {
        //frequencyOfStringWithSpaces("Amazon is Good");
        frequencyOfStringWithoutSpaces("Amazon");
    }

    static void frequencyOfStringWithSpaces(String str) {
        int[] counter = new int[256];
        for (char c : str.toLowerCase().toCharArray()) {
            counter[c]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    static void frequencyOfStringWithoutSpaces(String str) {
        int[] counter = new int[26];
        for (char c : str.toLowerCase().toCharArray()) {
            counter[c - 'a']++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + counter[i]);
            }
        }
    }
}
