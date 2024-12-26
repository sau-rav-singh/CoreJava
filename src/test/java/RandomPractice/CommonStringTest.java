package RandomPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonStringTest {
    public List<String> commonString(String[] a1, String[] a2) {
        Set<String> hs = new HashSet<>(Set.of(a1));
        List<String> result = new ArrayList<>();
        for (String s : a2) {
            if (!hs.add(s)) {
                result.add(s);
            }
        }
        return result;
    }

    @Test
    public void test() {
        String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
        Assert.assertEquals(commonString(a1, a2), List.of("apple", "Laxmi"));
    }
}
