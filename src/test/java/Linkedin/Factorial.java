package Linkedin;

public class Factorial {
    // QUESTION: Write a recursive function to calculate the factorial of a given number.
    // Example: Input: 5 -> Output: 120 (5 * 4 * 3 * 2 * 1)
    //S/T:n
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
