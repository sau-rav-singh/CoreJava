package Linkedin;

public class SortCharArray {
    public static void main(String[] args) {
        String input = "saurav";
        char[] arr = input.toCharArray();

        // Sorting using bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted string
        for (char c : arr) {
            System.out.print(c);
        }
    }
}

