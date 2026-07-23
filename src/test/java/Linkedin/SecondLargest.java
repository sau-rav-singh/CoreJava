package Linkedin;

public class SecondLargest {
    // QUESTION: Given an array of integers, find the second largest element in the array.
    // If there is no second largest element (i.e., all elements are the same), return an appropriate message.
    // Example: Input: [1, 2, 3, 1, 2, 3, 4] -> Output: 3
    //Time Complexity: O(n)
    //Space Complexity:O(1)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
