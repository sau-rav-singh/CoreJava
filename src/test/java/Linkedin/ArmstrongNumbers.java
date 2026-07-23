package Linkedin;

// QUESTION: An Armstrong number (also known as narcissistic number) is a number that is equal to
// the sum of its own digits each raised to the power of the number of digits.
// Write a function to check if a given number is an Armstrong number.
// Example: Input: 153 -> Output: true (1^3 + 5^3 + 3^3 = 153)
//          Input: 370 -> Output: true (3^3 + 7^3 + 0^3 = 370)
public class ArmstrongNumbers {

    public static void main(String[] args) {
        int num1 = 153;
        if (isArmstrong(num1)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        int first = 50;
        int second = 50000000;
        for (int i = first; i <= second; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = countDigits(num);
        int pow = 0;

        while (num != 0) {
            int rem = num % 10;
            pow += (int) Math.pow(rem, digits);
            if (pow > originalNum) {
                return false; // Early termination
            }
            num /= 10;
        }

        return pow == originalNum;
    }

    static int countDigits(int num) {
        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }
}