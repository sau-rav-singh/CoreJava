package Linkedin;

public class FibonacciSeries {
    // QUESTION: Generate the first n numbers of the Fibonacci series.
    // The Fibonacci sequence is a series where each number is the sum of the two preceding ones.
    // Example: Input: 10 -> Output: 0 1 1 2 3 5 8 13 21 34

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
