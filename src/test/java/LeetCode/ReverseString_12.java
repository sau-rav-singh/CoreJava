package LeetCode;

import java.util.Arrays;

public class ReverseString_12 {
    //Write a function that reverses a string. The input string is given as an array of characters s.

    public static void main(String[] args) {
        char[] arr=new char[]{'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
