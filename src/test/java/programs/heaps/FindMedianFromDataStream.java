package programs.heaps;

import org.testng.Assert;

import java.util.PriorityQueue;

/**
 * LeetCode 295: Find Median from Data Stream
 *
 * Problem Statement:
 * The median is the middle value in an ordered integer list. If the size of the list is even,
 * there is no middle value and the median is the mean of the two middle values.
 * Implement the MedianFinder class with addNum and findMedian methods.
 *
 * Constraints:
 * - -10^5 <= num <= 10^5
 * - There will be at least 1 element in the data structure before calling findMedian.
 * - At most 5 * 10^4 calls will be made to addNum and findMedian.
 */
public class FindMedianFromDataStream {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public FindMedianFromDataStream() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>();
    }

    public static void main(String[] args) {
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        Assert.assertEquals(medianFinder.findMedian(), 1.5);
        medianFinder.addNum(3);
        Assert.assertEquals(medianFinder.findMedian(), 2.0);
    }

    /**
     * APPROACH: Two Heaps (Optimal)
     *
     * Time Complexity: O(log N) for addNum, O(1) for findMedian
     * - Heap operations for insertion.
     *
     * Space Complexity: O(N)
     * - Storing all elements in two heaps.
     */
    public void addNum(int num) {
        maxHeap.offer(num);

        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return maxHeap.peek();
    }
}
