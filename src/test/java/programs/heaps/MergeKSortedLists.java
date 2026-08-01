package programs.heaps;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    // QUESTION: You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
    // Merge all the linked-lists into one sorted linked-list and return it.
    // Example: Input: lists = [[1,4,5],[1,3,4],[2,6]]
    //          Output: [1,1,2,3,4,4,5,6]
    // Time Complexity: O(n log k) where n is total nodes and k is number of lists
    // Space Complexity: O(k)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min heap based on node value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add first node of each list
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create lists: [[1,4,5],[1,3,4],[2,6]]
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {list1, list2, list3};
        ListNode merged = mergeKLists(lists);

        System.out.print("Merged list: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        System.out.println(); // Output: 1 1 2 3 4 4 5 6
    }
}
