package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDupes {
    //Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{3,2,3}));
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]==arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
}
