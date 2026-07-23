package Linkedin;

// QUESTION: Given an array of integers, move all zeros to the end of the array while maintaining
// the relative order of non-zero elements.
// Example: Input: [2, 3, 0, 0, 5, 0, 8] -> Output: [2, 3, 5, 8, 0, 0, 0]
public class SegrigateZeroAtLast {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 0, 5, 0, 8};
        pushZerosToEnd(arr, arr.length);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
}
