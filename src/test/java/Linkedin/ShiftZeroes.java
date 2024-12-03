package Linkedin;

import java.util.Arrays;

public class ShiftZeroes {
    //T:O(n log n)
    //S:O(n)
    public static void main(String[] args) {
        int[] array = {1, 4, 14, 0, 8, 9, 0, 5, 0, 6};

        int[] resultFront = shiftZeroes(array, true);
        System.out.println("Zeroes to front: " + Arrays.toString(resultFront));

        int[] resultRear = shiftZeroes(array, false);
        System.out.println("Zeroes to rear: " + Arrays.toString(resultRear));
    }

    public static int[] shiftZeroes(int[] arr, boolean toFront) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> toFront ? Integer.compare(a == 0 ? 0 : 1, b == 0 ? 0 : 1) : Integer.compare(a == 0 ? 1 : 0, b == 0 ? 1 : 0))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

