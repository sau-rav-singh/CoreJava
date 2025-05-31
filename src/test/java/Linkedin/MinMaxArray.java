package Linkedin;

public class MinMaxArray {
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int min, max;
        int i;
        int n = arr.length;

        if (n % 2 == 0) {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        } else {
            min = max = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            int num1 = arr[i];
            int num2 = arr[i + 1];

            if (num1 < num2) {
                min = Math.min(min, num1);
                max = Math.max(max, num2);
            } else {
                min = Math.min(min, num2);
                max = Math.max(max, num1);
            }
            i += 2;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 7, 19, 3, 8};
        findMinMax(arr);
    }
}
