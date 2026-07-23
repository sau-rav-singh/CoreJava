package Linkedin;

public class SeperateCaps {
    // QUESTION: Given a string containing lowercase letters, uppercase letters, and digits,
    // print the lowercase characters, uppercase characters, and digits separately.
    // Example: Input: "sumitM28" -> Output: sumit, M, 28

    public static void main(String[] args) {
        String input = "sumitM28";
        input.chars().filter(Character::isLowerCase).forEach(c -> System.out.print((char) c));
        System.out.println();
        input.chars().filter(Character::isUpperCase).forEach(c -> System.out.print((char) c));
        System.out.println();
        input.chars().filter(Character::isDigit).forEach(c -> System.out.print((char) c));
        System.out.println();
    }

}
