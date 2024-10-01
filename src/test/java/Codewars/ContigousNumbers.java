package Codewars;

import java.util.ArrayList;
import java.util.List;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ContigousNumbers {
    public static void main(String[] args) {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, pipeFix(new int[] {1,2,3}));
    }

    public static int[] pipeFix(int[] numbers) {
        List<Integer> result=new ArrayList<>();
        int min = numbers[0];
        int max = numbers[numbers.length-1];

        for (int i = min; i <= max; i++) {
            result.add(i);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
