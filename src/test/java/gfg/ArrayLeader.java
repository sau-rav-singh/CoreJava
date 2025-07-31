package gfg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    //You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.
    public static void main(String[] args) {
        System.out.println(leaders(new int[]{16, 17, 4, 3, 5, 2, 2}));
        System.out.println(leaders(new int[]{61,61,17}));
    }

    static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = arr.length - 1;
        int max = arr[len];
        result.add(max);
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] >=max) {
                result.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
