package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hs=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int counter=target-nums[i];
            if(hs.containsKey(counter)){
                ans[0]=i;
                ans[1]=hs.get(counter);
                break;
            }else{
                hs.put(nums[i],i);
            }
        }
        return ans;
    }
}
