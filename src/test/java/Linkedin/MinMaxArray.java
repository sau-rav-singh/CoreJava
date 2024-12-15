package Linkedin;

public class MinMaxArray {
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min, max;
        int n = arr.length;

        // Initialize min and max
        int i;
        if (n % 2 == 0) { // Even number of elements
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            i = 2; // Start from the third element
        } else { // Odd number of elements
            min = arr[0];
            max = arr[0];
            i = 1; // Start from the second element
        }

        // Compare in pairs
        while (i < n - 1) {
            if (arr[i] < arr[i + 1]) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i + 1]);
            } else {
                min = Math.min(min, arr[i + 1]);
                max = Math.max(max, arr[i]);
            }
            i += 2; // Move to the next pair
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 7, 19, 3, 8};
        findMinMax(arr);
    }
}
