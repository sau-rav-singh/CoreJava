package interview.heaps;

import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    // QUESTION: The median is the middle value in an ordered integer list. If the size of the list is even,
    // there is no middle value and the median is the mean of the two middle values.
    // Implement the MedianFinder class with addNum and findMedian methods.
    // Time Complexity: O(log n) for addNum, O(1) for findMedian
    // Space Complexity: O(n)

    private PriorityQueue<Integer> maxHeap; // Left half (smaller numbers)
    private PriorityQueue<Integer> minHeap; // Right half (larger numbers)

    public FindMedianFromDataStream() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max heap
        minHeap = new PriorityQueue<>(); // Min heap
    }

    public void addNum(int num) {
        // Add to max heap first
        maxHeap.offer(num);

        // Balance: ensure max of maxHeap <= min of minHeap
        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        // Balance sizes
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

    public static void main(String[] args) {
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); // Output: 1.5
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); // Output: 2.0
    }
}
