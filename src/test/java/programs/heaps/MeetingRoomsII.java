package programs.heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    // QUESTION: Given an array of meeting time intervals intervals where intervals[i] = [start_i, end_i],
    // return the minimum number of conference rooms required.
    // Example: Input: intervals = [[0,30],[5,10],[15,20]]
    //          Output: 2
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Min heap to track end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // If the current meeting starts after or when the earliest meeting ends
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll(); // Free up a room
            }
            minHeap.offer(intervals[i][1]); // Allocate a room
        }

        return minHeap.size();
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals1)); // Output: 2

        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(minMeetingRooms(intervals2)); // Output: 1
    }
}
