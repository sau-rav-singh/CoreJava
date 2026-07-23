package Linkedin;

// QUESTION: Implement bubble sort algorithm to sort an array of integers in ascending order.
// Example: Input: [9, 8, 7, 4, 5, 6, 2, 1, 3] -> Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 4, 5, 6, 2, 1, 3};
        int tempValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
