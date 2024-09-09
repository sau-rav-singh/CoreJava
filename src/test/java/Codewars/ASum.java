package Codewars;

public class ASum {

    public static long findNb(long m) {
        long n = 0;
        long sum = 0;
        while (sum < m) {
            n++;
            sum += n * n * n;
        }
        if (sum == m) {
            return n;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findNb(1071225)); // Should return 45
        System.out.println(findNb(91716553919377L)); // Should return -1
    }
}
