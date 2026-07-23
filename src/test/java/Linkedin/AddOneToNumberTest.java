package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// QUESTION: Given a non-negative integer represented as an array of digits, add one to the integer.
// The digits are stored such that the most significant digit is at the head of the list, and each
// element in the array contains a single digit. You may assume the integer does not contain any
// leading zero, except the number 0 itself.
// Example: Input: [1,2,3] -> Output: [1,2,4]
//          Input: [9,9,9] -> Output: [1,0,0,0]
public class AddOneToNumberTest {
    public static int[] addOne(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int plusOne = arr[i] + carry;
            if (plusOne > 9) {
                result.add(0);
                carry = plusOne / 10;
            } else {
                result.add(plusOne);
                carry = 0;
            }
        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--) {
            digits[i] += carry;
            if(digits[i]<10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // First digit is 1, others are default 0
        return newDigits;
    }

    @Test
    public void test() {
        Assert.assertEquals(new int[]{1, 2, 5}, addOne(new int[]{1, 2, 4}));
        Assert.assertEquals(new int[]{1, 3, 0}, addOne(new int[]{1, 2, 9}));
        Assert.assertEquals(new int[]{1, 0, 0, 0}, addOne(new int[]{9, 9, 9}));
        Assert.assertEquals(new int[]{1, 0}, addOne(new int[]{9}));
        Assert.assertEquals(new int[]{6}, addOne(new int[]{5}));
        Assert.assertEquals(new int[]{1,0,0}, plusOne(new int[]{9,9}));
    }
}