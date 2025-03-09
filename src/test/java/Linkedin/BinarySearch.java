package Linkedin;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9, 2};
        Arrays.sort(arr);

        int num = 7;
        int result = binarySearch(arr, num);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int binarySearch(int[] arr, int num) {
        int len = arr.length;
        int max = len - 1;
        int min = 0;

        while (max >= min) {
            int mid = (max + min) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return -1; // Element not found
    }
}