package Linkedin;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    //t:n!,s:n
    public static void main(String[] args) {
        //printPermutn("geek", "");
        System.out.println();
        System.out.print(permute("geek"));
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
            if (!alpha[ch - 'a']) printPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

    static Set<String> permute(String str) {
        if (str == null) {
            return null;
        } else if (str.isEmpty()) {
            Set<String> set = new HashSet<>();
            set.add("");
            return set;
        }
        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        Set<String> words = permute(remainingStr);
        Set<String> permutations = new HashSet<>();
        for (String word : words) {
            for (int j = 0; j <= word.length(); j++) {
                String s = word.substring(0, j) + firstChar + word.substring(j);
                permutations.add(s);
            }
        }
        return permutations;
    }
}
