package InterviewPrep.LinkedList;

public class ReorderList {
    // QUESTION: You are given the head of a singly linked-list. The list can be represented as:
    // L0 → L1 → … → Ln - 1 → Ln. Reorder the list to be on the following form:
    // L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
    // Example: Input: head = [1,2,3,4]
    //          Output: [1,4,2,3]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

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

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        // Merge two halves
        while (secondHalf.next != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        
        reorderList(head);
        System.out.print("Reordered: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println(); // Output: 1 4 2 3
    }
}
