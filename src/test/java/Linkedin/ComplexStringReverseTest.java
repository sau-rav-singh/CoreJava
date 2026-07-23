package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// QUESTION: Given a string, reverse it while maintaining the original positions of spaces.
// Example: Input: "this is a phone" -> Output: "enoh pa s isiht"
public class ComplexStringReverseTest {

    @Test
    public void test(){
        Assert.assertEquals(reverseString("this is a phone"),"enoh pa s isiht");
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == ' ') {
                left++;
            } else if (arr[right] == ' ') {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
