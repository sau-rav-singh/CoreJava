package Linkedin;
import java.util.Arrays;

//Remove duplicate chars from arraylist of strings
public class ArrayListTest {
    public static void main(String[] args) {
        String[] words = {"hello", "helloishi", "mastercard"};
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            result[i] = removeDuplicates(words[i]);
        }

        System.out.println(Arrays.toString(result));
    }

    private static String removeDuplicates(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
