package Codewars;

import java.util.List;
//Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
//A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
//Every smiling face must have a smiling mouth that should be marked with either ) or D
public class SmileyFaces {
    public static void main(String[] args) {
        System.out.println(countSmileys(List.of(":)", ";(", ";}", ":-D")));       // should return 2
        System.out.println(countSmileys(List.of(";D", ":-(", ":-)", ";~)")));     // should return 3
        System.out.println(countSmileys(List.of(";]", ":[", ";*", ":$", ";-D"))); // should return 1
    }

    public static int countSmileys(List<String> arr) {
        // Define a regex pattern for a valid smiley face
        String smileyPattern = "[:;][-~]?[)D]";
        int count = 0;

        for (String emoji : arr) {
            // Check if the emoji matches the smiley pattern
            if (emoji.matches(smileyPattern)) {
                count++;
            }
        }
        return count;
    }
}
