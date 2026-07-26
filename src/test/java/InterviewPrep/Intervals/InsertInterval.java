package InterviewPrep.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    // QUESTION: Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
    // Example: Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
    //          Output: [[1,5],[6,9]]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = insert(intervals, newInterval);
        System.out.println("Result after insertion:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output: [[1,5],[6,9]]
    }
}
