package ApnaCollege.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        search(arr, 9);
        search(arr, 90);
    }

    static void search(int[][] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println(value + " found at " + i + "," + j + " location");
                    return;
                }
            }
        }
        System.out.println(value + " not found in the Array");
    }
}
