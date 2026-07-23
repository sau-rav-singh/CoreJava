package Linkedin;

public class IntegerFrequency {
    // QUESTION: Given an array of integers, count the frequency of each element and print the results.
    // Do not use additional data structures like HashMap.
    // Example: Input: [1, 2, 3, 1, 2, 3, 4, 44] -> Output: Count of 1 is 2, Count of 2 is 2, etc.
    //Time:O(n2)
    //Space:O(n)
    public static void countOccurrences(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1; // Include the current element itself
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println("Count of " + arr[i] + " is " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 44};
        countOccurrences(arr);
    }
}