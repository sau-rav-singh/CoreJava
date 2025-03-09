package Linkedin;

import java.util.Scanner;

public class SwapWith {
    public static void main(String[] args) {
        int x, y, t; // x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping numbers: " + x + "  " + y);
        /* swapping */
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: " + x + "   " + y);
        System.out.println();

        int x1 = 10;
        int y1 = 5;
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println("After swapping: x = " + x1 + ", y = " + y1);
    }
}
