package programs.heaps;

import org.testng.Assert;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LeetCode 253: Meeting Rooms II
 *
 * Problem Statement:
 * Given an array of meeting time intervals intervals where intervals[i] = [start_i, end_i],
 * return the minimum number of conference rooms required.
 *
 * Constraints:
 * - 1 <= intervals.length <= 10^4
 * - 0 <= start_i < end_i <= 10^6
 */
public class MeetingRoomsII {

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        Assert.assertEquals(minMeetingRoomsHeap(intervals1), 2);
        Assert.assertEquals(minMeetingRoomsSort(intervals1), 2);

        int[][] intervals2 = {{7, 10}, {2, 4}};
        Assert.assertEquals(minMeetingRoomsHeap(intervals2), 1);
    }

    /**
     * APPROACH 1: Min Heap (Optimal)
     *
     * Time Complexity: O(N log N)
     * - Sorting O(N log N), heap operations O(N log N).
     *
     * Space Complexity: O(N)
     * - Heap storing end times.
     */
    public static int minMeetingRoomsHeap(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll();
            }
            minHeap.offer(intervals[i][1]);
        }

        return minHeap.size();
    }

    /**
     * APPROACH 2: Sorting with Two Pointers
     *
     * Time Complexity: O(N log N)
     * - Sorting both arrays.
     *
     * Space Complexity: O(N)
     * - Arrays for start and end times.
     */
    public static int minMeetingRoomsSort(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int endPointer = 0;

        for (int i = 0; i < starts.length; i++) {
            if (starts[i] < ends[endPointer]) {
                rooms++;
            } else {
                endPointer++;
            }
        }

        return rooms;
    }
}
