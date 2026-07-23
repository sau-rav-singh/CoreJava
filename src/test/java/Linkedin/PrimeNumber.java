package Linkedin;

public class PrimeNumber {
    // QUESTION: Given an integer, determine if it is a prime number. A prime number is a number greater
    // than 1 that has no positive divisors other than 1 and itself.
    // Example: Input: 23 -> Output: true
    //          Input: 4 -> Output: false

    public static void main(String[] args) {
        int num = 23;

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
