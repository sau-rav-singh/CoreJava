package ApnaCollege.Recursion;

public class NthFib {
    public static void main(String[] args) {
        System.out.println(nthFib(6));
    }

    static int nthFib(int n) {
        if (n == 0 || n == 1)
            return n;
        return nthFib(n - 2) + nthFib(n - 1);
    }
}
