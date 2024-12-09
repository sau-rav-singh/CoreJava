package Patterns;

public class FloydTriangle {
    public static void main(String[] args) {
        int num = 6;
        int counter = 1;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                if (j <= i) {
                    System.out.print(counter+" ");
                    counter++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
