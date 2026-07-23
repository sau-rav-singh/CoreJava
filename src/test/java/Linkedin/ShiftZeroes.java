package Linkedin;

import java.util.Arrays;

public class ShiftZeroes {
    // QUESTION: Given an array of integers, move all zeros to the end of the array while maintaining
    // the relative order of non-zero elements.
    // Example: Input: [1, 4, 14, 0, 8, 9, 0, 5, 0, 6] -> Output: [1, 4, 14, 8, 9, 5, 6, 0, 0, 0]
    //T:O(n)
    //S:O(1)
    public static void main(String[] args) {
        int[] array = {1, 4, 14, 0, 8, 9, 0, 5, 0, 6};

        int[] resultFront = shiftZeroesToTheEnd(array);
        System.out.println("Zeroes to End: " + Arrays.toString(resultFront));
    }

    public static int[] shiftZeroesToTheEnd(int[] arr) {
       int count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[count];
               arr[count]=temp;
               count++;
           }
       }
       return arr;
    }
}

