package InterviewPrep.Intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    // QUESTION: Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number
    // of intervals you need to remove to make the rest of the intervals non-overlapping.
    // Example: Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
    //          Output: 1 (remove [1,3])
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // Overlapping interval, need to remove one
                count++;
            } else {
                // Non-overlapping, update prevEnd
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals1)); // Output: 1

        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        System.out.println(eraseOverlapIntervals(intervals2)); // Output: 2
    }
}
