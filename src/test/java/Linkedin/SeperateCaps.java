package Linkedin;

public class SeperateCaps {

    //Given the string sumitM28, print the lowercase characters, the numbers, and the uppercase letter separately. The output should be
    //sumit,M,28

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
