package Linkedin;

public class IntegerReverse {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverseInteger(num));

        int num1 = 123;
        System.out.println(reverseInteger(num1));
    }

    static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}
