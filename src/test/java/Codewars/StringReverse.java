package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {
    //"This is an example!" ==> "sihT si na !elpmaxe"
    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
    }

    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
}
