package Linkedin;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int num = 0;
        while (x != 0) {
            int rem = x % 10;
            num = num * 10 + rem;
            x /= 10;
        }
        return num == temp;
    }
}
