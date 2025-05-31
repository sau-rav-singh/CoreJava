package Linkedin;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 20, 4, 5, 8, 6, 10};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second Smallest Element: " + secondSmallest);
        System.out.println("Second Largest Element: " + findSecondLargestElement(new int[]{1, 8, 5, 3, 20, 4, 5, 8, 6, 10}));
    }

    public static int findSecondLargestElement(int[] array) {
        if (array == null || array.length < 2) {
            return -1; // Array has fewer than two elements
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

    static int findSecondSmallest(int[] arr) {
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
