package CommonPrograms;

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

    static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return temp == sum;
    }
}
