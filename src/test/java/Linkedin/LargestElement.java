package Linkedin;

public class LargestElement {
    // QUESTION: Given an array of integers, find the largest element.
    // Example: Input: [1, 2, 3, 1, 2, 3, 4, 5] -> Output: 5
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
