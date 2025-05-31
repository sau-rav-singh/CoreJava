package Linkedin;

public class TrianglePattern {

//    For Outer loop use Y axis(column)
//    For inner Loop use X Axis(row)
//    https://1drv.ms/b/s!AvMeJEl0kAHtgaMdDCM6W1Oj08R8XQ?e=iKY0rt

    public static void printRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printRightAngledTriangle(n);
    }
}
