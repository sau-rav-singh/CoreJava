package Linkedin;

import java.util.PriorityQueue;

public class KthLargest {
    //Time Complexity: O(nlogn)
    //Space Complexity: O(n)
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4, 7};
        System.out.println("Third largest number is: " + kthLargest(arr,3));
    }

    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int val : arr) {
            priorityQueue.add(val);
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
