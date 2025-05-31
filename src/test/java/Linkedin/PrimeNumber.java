package Linkedin;

public class PrimeNumber {

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
