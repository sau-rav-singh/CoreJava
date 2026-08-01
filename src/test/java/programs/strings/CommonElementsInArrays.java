package programs.strings;

import org.testng.Assert;

import java.util.*;

/**
 * Common Elements in Arrays
 *
 * Problem Statement:
 * Given two arrays of strings, find the common elements between them.
 *
 * Constraints:
 * - 1 <= a1.length, a2.length <= 10^4
 * - Arrays contain strings.
 */
public class CommonElementsInArrays {

    public static void main(String[] args) {
        String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
        List<String> result = commonString(a1, a2);
        Assert.assertEquals(result, List.of("apple", "Laxmi"));
    }

    /**
     * APPROACH: HashSet (Optimal)
     *
     * Time Complexity: O(N + M)
     * - N and M are lengths of the two arrays.
     *
     * Space Complexity: O(M)
     * - HashSet for the second array.
     */
    public static List<String> commonString(String[] a1, String[] a2) {
        Set<String> a2Set = new HashSet<>(Arrays.asList(a2));
        List<String> result = new ArrayList<>();
        for (String ele : a1) {
            if (a2Set.contains(ele)) {
                result.add(ele);
            }
        }
        return result;
    }

    /**
     * APPROACH 2: Two Pointers (If arrays are sorted)
     *
     * Time Complexity: O(N log N + M log M)
     * - Sorting both arrays.
     *
     * Space Complexity: O(1)
     * - Constant extra space (ignoring sort space).
     */
    public static List<String> commonStringSorted(String[] a1, String[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        List<String> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i].equals(a2[j])) {
                result.add(a1[i]);
                i++;
                j++;
            } else if (a1[i].compareTo(a2[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
