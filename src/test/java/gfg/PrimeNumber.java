package gfg;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(num + " is prime: " + isPrime(num));
        int num2 = 7;
        System.out.println(num2 + " is prime: " + isPrime(num2));
        int num3 = 9;
        System.out.println(num3 + " is prime: " + isPrime(num3));
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        if (num == 2 || num == 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
