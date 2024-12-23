package RandomPractice;

import java.util.Arrays;

public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};//1,1,2,2,3,3
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        int[] result = Arrays.copyOfRange(arr, j, arr.length);
        System.out.println(Arrays.toString(result));
    }
}
