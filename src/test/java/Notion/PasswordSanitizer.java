package Notion;

import java.util.ArrayList;
import java.util.List;

class PasswordSanitizer {
    // Filter passwords with condition that, password must have atleast 5 characters and should be aplhanumeric
    public static String filter(List<String> passwords) {
        List<String> validPass = new ArrayList<>();

        for (String password : passwords) { // <-- FIXED this line
            boolean isLongEnough = password.length() >= 5;
            boolean containsOnlyLet = password.matches("[a-zA-Z]+");
            boolean containsOnlyNum = password.matches("[0-9]+");
            boolean isMixed = !(containsOnlyLet || containsOnlyNum);

            if (isLongEnough && isMixed) {
                validPass.add(password);
            }
        }

        return String.join(" ", validPass);
    }

    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("peC1");
        passwords.add("pass@123");
        passwords.add("word@321");
        passwords.add("wordpass");
        passwords.add("987345");
        System.out.println(filter(passwords));
    }
}


