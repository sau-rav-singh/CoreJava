package Algorithms.Sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array ={2,65,23,67,34,56};
        int length= array.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        Arrays.stream(array).forEach(e->System.out.print(e+" "));
    }
}
