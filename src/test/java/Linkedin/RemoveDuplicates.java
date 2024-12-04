package Linkedin;

import java.util.Arrays;

public class RemoveDuplicates {
    //t:nlogn
    //S:1
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println("J is " + j);
        int[] result = Arrays.copyOfRange(arr, j, arr.length);
        System.out.println(Arrays.toString(result));
    }

}
