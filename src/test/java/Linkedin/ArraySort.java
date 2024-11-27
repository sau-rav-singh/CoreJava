package Linkedin;

public class ArraySort {
    //Time Complexity: O(n2)
    //Space Complexity: O(1)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 10, 2, 3, 4, 5, -10};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
