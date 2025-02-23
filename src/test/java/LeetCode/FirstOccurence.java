package LeetCode;

import org.testng.Assert;

public class FirstOccurence {
    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    public static void main(String[] args) {
        Assert.assertEquals(strStr("sadbutsad","sad"),0);
    }

    public static int strStr(String haystack, String needle) {
        int m=haystack.length(),n=needle.length();
        for(int i=0;i<=m-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
