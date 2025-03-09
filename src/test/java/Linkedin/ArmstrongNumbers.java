package Linkedin;

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