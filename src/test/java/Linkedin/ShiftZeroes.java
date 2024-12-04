package Linkedin;

import java.util.Arrays;

public class ShiftZeroes {
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

