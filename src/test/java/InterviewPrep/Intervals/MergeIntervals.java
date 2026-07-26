package InterviewPrep.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    // QUESTION: Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
    // and return an array of the non-overlapping intervals that cover all the intervals in the input.
    // Example: Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //          Output: [[1,6],[8,10],[15,18]]
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][0];

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // Check if intervals overlap
            if (current[1] >= next[0]) {
                // Merge intervals
                current[1] = Math.max(current[1], next[1]);
            } else {
                // Add current interval and move to next
                merged.add(current);
                current = next;
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output: [[1,6],[8,10],[15,18]]
    }
}
