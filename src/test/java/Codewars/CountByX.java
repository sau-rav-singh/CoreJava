package Codewars;

import java.util.ArrayList;
import java.util.List;

public class CountByX {

    public static int[] countBy(int x, int n){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(i+1)*x;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=countBy(3,5);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
