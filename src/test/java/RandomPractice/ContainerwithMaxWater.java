package RandomPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerwithMaxWater {

    public static void main(String[] args) {

        List<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        int i = 0, j = height.size() - 1;
        int maxWater = 0;
        while (i < j) {
            int min = Math.min(height.get(i), height.get(j));
            int area = min * (j - i);
            maxWater=Math.max(area,maxWater);
            if(height.get(i)>height.get(j)){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(maxWater);
    }
}
