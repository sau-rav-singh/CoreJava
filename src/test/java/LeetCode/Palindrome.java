package LeetCode;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {//O(log(x))
        if (x < 0) {
            return false;
        }
        int temp = x;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return x == rev;
    }
}
