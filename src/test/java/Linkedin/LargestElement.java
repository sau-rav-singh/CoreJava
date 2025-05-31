package Linkedin;

public class LargestElement {
    //Space/Time:O(n)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println(max);
    }
}
