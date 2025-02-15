package Gayle;

import org.testng.Assert;

import java.util.Arrays;

public class HasUniqueChars {
    public static void main(String[] args) {
        Assert.assertTrue(hasUniqueChars("ABC"));
        Assert.assertFalse(hasUniqueChars("ABCA"));
    }

    static boolean hasUniqueChars(String str){
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                return false;
        }
        return true;
    }
}
