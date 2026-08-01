package advanced.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class EmployeeFreeTime {
    // QUESTION: We are given a list schedule of employees, which represents the working time for each employee.
    // Each employee has a list of non-overlapping Intervals, and they are in sorted order. Return the list of
    // finite intervals representing common, positive-length free time for all employees.
    // Example: Input: schedule = [[[1,2],[5,6]],[[1,3]],[[4,10]]]
    //          Output: [[3,4]]
    // Time Complexity: O(n log k) where n is total intervals and k is number of employees
    // Space Complexity: O(k)

    public static List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> result = new ArrayList<>();
        if (schedule == null || schedule.isEmpty()) return result;

        // Min heap based on start time
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.start - b.start);

        // Add all intervals to heap
        for (List<Interval> employee : schedule) {
            minHeap.addAll(employee);
        }

        Interval prev = minHeap.poll();

        while (!minHeap.isEmpty()) {
            Interval current = minHeap.poll();

            // If there's a gap between intervals, it's free time
            if (prev.end < current.start) {
                result.add(new Interval(prev.end, current.start));
                prev = current;
            } else {
                // Overlapping intervals, merge them
                prev.end = Math.max(prev.end, current.end);
            }
        }

        return result;
    }

    public static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + "," + end + "]";
        }
    }

    public static void main(String[] args) {
        List<List<Interval>> schedule = new ArrayList<>();
        schedule.add(Arrays.asList(new Interval(1, 2), new Interval(5, 6)));
        schedule.add(Arrays.asList(new Interval(1, 3)));
        schedule.add(Arrays.asList(new Interval(4, 10)));

        List<Interval> result = employeeFreeTime(schedule);
        System.out.println("Employee free time: " + result); // Output: [[3,4]]
    }
}
