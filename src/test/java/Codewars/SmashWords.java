package Codewars;

import static org.testng.Assert.assertEquals;

public class SmashWords {

    public static void main(String[] args) {
        assertEquals("hello world this is great", SmashWords.smash("hello", "world", "this", "is", "great"));
        assertEquals("hello world", SmashWords.smash("hello", "world"));
    }

    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
