package Codewars;

import static org.testng.Assert.assertEquals;

public class ToCamelCase {
    public static void main(String[] args) {
        assertEquals(toCamelCase("the-stealth-warrior"), "theStealthWarrior");
        assertEquals(toCamelCase("The_Stealth_Warrior"), "TheStealthWarrior");
        assertEquals(toCamelCase("The_Stealth-Warrior"), "TheStealthWarrior");
    }

    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        StringBuilder result = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1));
        }

        return result.toString();
    }
}
