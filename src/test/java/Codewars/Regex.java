package Codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("My phone number is 12345");
//        list.add("\\d+");

//        list.add("I like apple pie and apple juice.");
//        list.add("apple");

//        list.add("Hello World");
//        list.add("[a-z]");

//        list.add("a1B2c3");
//        list.add("\\D");

//        list.add("Contact me at john.doe@example.com email");
//        list.add("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+");

//        list.add("Call me at (123) 456-7890");
//        list.add("\\(\\d{3}\\) \\d{3}-\\d{4}");
        Pattern pattern = Pattern.compile(list.getLast());
        Matcher matcher = pattern.matcher(list.getFirst());
        while (matcher.find()) {
            System.out.print(matcher.group()+"   ");
        }
    }
}
