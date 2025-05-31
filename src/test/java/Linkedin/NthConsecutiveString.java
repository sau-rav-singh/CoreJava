package Linkedin;

public class NthConsecutiveString {

    public static void main(String[] args) {
        String word = "Amazon is a great company as it has Atooozzzz";
        System.out.println(maxRepeating(word));
    }

    static char maxRepeating(String str) {
        int maxCount = 0;
        char result = str.charAt(0);

        int currentCount = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                currentCount = 1;
                currentChar = str.charAt(i);
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                result = currentChar;
            }
        }

        return result;
    }
}
