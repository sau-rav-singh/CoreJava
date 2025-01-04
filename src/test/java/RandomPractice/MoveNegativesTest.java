package RandomPractice;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MoveNegativesTest {
    @Test
    public void testMoveNegatives_basicCase() {
        int[] nums = {1, 3, -1, -2, -3, 5, 6, -7};
        moveNegatives(nums);
        int[] expected = {-1, -2, -3, -7, 1, 5, 6, 3};
        assertEquals(nums, expected);
    }
    private void moveNegatives(int[] nums){
        int i=0,j=0;
        for(;j<nums.length;j++){
            if(nums[j]<0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
