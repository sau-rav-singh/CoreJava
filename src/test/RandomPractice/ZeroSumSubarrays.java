import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        printZeroSumSubarrays(arr);
    }

    public static void printZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        map.put(0,new ArrayList<>(List.of(-1)));
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                List<Integer> indexes=map.get(sum);
                for(Integer index:indexes){
                    System.out.println("Zero Sum SUb Array found: "+ Arrays.toString(Arrays.copyOfRange(arr,index+1,i+1)));
                }
            }
            map.putIfAbsent(sum,new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
