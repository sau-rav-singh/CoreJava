package MyPracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDupes {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,1,4};//1,1,1,2,2,3,3
        Arrays.sort(arr);
        List<Integer> uniqueList=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                uniqueList.add(arr[i-1]);
            }
        }
        uniqueList.add(arr[arr.length-1]);
        int[] result=uniqueList.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(result));
    }
}
