package interview.array;

// QUESTION: Given an array of integers, find the second smallest and/or second largest elements.
// Example: Input: [1, 8, 5, 3, 20, 4, 5, 8, 6, 10] -> Output: Second Smallest: 3, Second Largest: 10
public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 20, 4, 5, 8, 6, 10};

        System.out.println("Second Smallest Element: " + findSecondSmallest(arr));
        System.out.println("Second Largest Element: " + findSecondLargest(arr));

        // Test with array where all elements are same
        int[] sameArr = {5, 5, 5, 5};
        System.out.println("Second Largest (all same): " + findSecondLargest(sameArr));
    }

    /**
     * Find the second largest element in an array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Returns -1 if no second largest exists
     */
    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (element > secondLargest && element != firstLargest) {
                secondLargest = element;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    /**
     * Find the second smallest element in an array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Returns Integer.MAX_VALUE if no second smallest exists
     */
    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j < secondSmallest && j != smallest) {
                secondSmallest = j;
            }
        }

        return secondSmallest;
    }
}

