package advanced.intervals;

import java.util.Arrays;

public class MeetingRooms {
    // QUESTION: Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person
    // could attend all meetings.
    // Example: Input: intervals = [[0,30],[5,10],[15,20]]
    //          Output: false
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)

    public static boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) return true;

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            // Check if current meeting starts before previous meeting ends
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttendMeetings(intervals1)); // Output: false

        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(canAttendMeetings(intervals2)); // Output: true
    }
}
