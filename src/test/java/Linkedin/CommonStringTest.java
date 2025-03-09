package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class CommonStringTest {
    //Time Complexity: O(n + m)
    //Space Complexity: O(n + m)

    @Test
    public void test(){
        String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
        Assert.assertEquals(commonString(a1,a2),List.of("apple", "Laxmi"));
    }

    public List<String> commonString(String[] a1,String[] a2){
        Set<String> a2Set = new HashSet<>(Arrays.asList(a2));
        List<String> result = new ArrayList<>();
        for (String ele : a1) {
            if (a2Set.contains(ele)) {
                result.add(ele);
            }
        }
       return result;
    }
}