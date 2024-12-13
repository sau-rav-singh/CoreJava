package Linkedin;

public class StringPermutations {
//t:n2,s:n
    public static void main(String[] args) {
        printPermutn("geek", "");
        System.out.println();
    }

    static void printPermutn(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        boolean[] alpha = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            if (!alpha[ch - 'a'])
                printPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

}
