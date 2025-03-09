package Linkedin;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}