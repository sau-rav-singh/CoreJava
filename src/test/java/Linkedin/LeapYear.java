package Linkedin;

public class LeapYear {
    // QUESTION: Write a function to determine if a given year is a leap year.
    // A leap year is divisible by 4, except for century years which must be divisible by 400.
    // Example: Input: 2000 -> Output: true
    //          Input: 1900 -> Output: false

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}