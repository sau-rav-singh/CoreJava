package ApnaCollege.Recursion;

public class PrintNumbers {

    public static void main(String[] args) {
        printNumDec(20);
        printNumAsc(20);
    }

    private static void printNumDec(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        printNumDec(num - 1);
    }

    private static void printNumAsc(int num) {
        if (num == 1) {
            System.out.print(num+" ");
            return;
        }
        printNumAsc(num - 1);
        System.out.print(num+" ");

    }


}
