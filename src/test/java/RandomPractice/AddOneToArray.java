package RandomPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddOneToArray {
    public static void main(String[] args) {
        int[] arr={9,9,9};
        List<Integer> list=new ArrayList<>();
        int carry=1;
        for(int i=arr.length-1;i>=0;i--){
            int sum=arr[i]+carry;
            list.add(sum%10);
            carry=sum/10;
        }
        if(carry>0)
            list.add(carry);

        Collections.reverse(list);

        int[] result=list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(result));
    }
}
