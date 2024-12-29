package ApnaCollege.Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n-1; i++) {//y
            for (int j = 0; j < n; j++) {//x
                if (i == 0 || i == n-2 || j == 0 || j == n - 1)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
