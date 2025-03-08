package WAP;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddOneToNumberTest {
    public static int[] addOne(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int plusOne = arr[i] + carry;
            if (plusOne > 9) {
                result.add(0);
                carry = plusOne / 10;
            } else {
                result.add(plusOne);
                carry = 0;
            }
        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(new int[]{1, 2, 5}, addOne(new int[]{1, 2, 4}));
        Assert.assertEquals(new int[]{1, 3, 0}, addOne(new int[]{1, 2, 9}));
        Assert.assertEquals(new int[]{1, 0, 0, 0}, addOne(new int[]{9, 9, 9}));
        Assert.assertEquals(new int[]{1, 0}, addOne(new int[]{9}));
        Assert.assertEquals(new int[]{6}, addOne(new int[]{5}));
    }
}