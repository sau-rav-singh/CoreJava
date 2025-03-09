package Linkedin;

public class FibonacciSeries {

    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, nextNum, count = 10;
        System.out.print(firstNum + " " + secondNum);
        for (int i = 2; i < count; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
