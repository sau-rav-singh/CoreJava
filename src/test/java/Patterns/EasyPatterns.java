package Patterns;

public class EasyPatterns {
    public static void main(String[] args) {
       P4();
    }

    public static void P1(){
        int n = 4;
        for (int line = 0; line < n; line++) {
            for (int star = 0; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void P2(){
        int n = 4;
        for (int line = 0; line < n; line++) {
            for (int star = 0; star<n-line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void P3(){
        int n = 4;
        for (int line = 0; line < n; line++) {
            int num=1;
            for (int star = 0; star <= line; star++) {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
    public static void P4(){
        int n = 4;
        char c='A';
        for (int line = 0; line < n; line++) {

            for (int star = 0; star <= line; star++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}
