package Linkedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 9};
        List<Integer> result = addOne(arr);
        System.out.println(result);
    }

    public static List<Integer> addOne(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }
}

