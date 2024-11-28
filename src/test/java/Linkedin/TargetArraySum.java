package Linkedin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetArraySum {
    //Input: nums = [2, 7, 11, 15], target = 9
    //Output: [0, 1] (since nums[0] + nums[1] = 2 + 7 = 9)
    //Space/Time Complexity: O(n)
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (hm.containsKey(compliment)) {
                return new int[]{hm.get(compliment), i};
            }
            hm.put(arr[i], i);
        }
        return null;
    }

}
