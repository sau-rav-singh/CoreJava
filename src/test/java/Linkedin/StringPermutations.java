package Linkedin;

public class StringPermutations {

    public static void main(String[] args) {
        printPermutn("geek", "");
    }

    static void printPermutn(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
}
