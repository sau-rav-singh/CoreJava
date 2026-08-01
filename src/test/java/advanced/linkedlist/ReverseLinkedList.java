package advanced.linkedlist;

public class ReverseLinkedList {
    // QUESTION: Given the head of a singly linked list, reverse the list, and return the reversed list.
    // Example: Input: head = [1,2,3,4,5]
    //          Output: [5,4,3,2,1]
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

    // Iterative solution
    public static ListNode reverseList(ListNode head) {
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

    // Recursive solution
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversed = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        ListNode reversed = reverseList(head);
        System.out.print("Reversed (iterative): ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        System.out.println();

        // Test recursive
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reversed2 = reverseListRecursive(head2);
        System.out.print("Reversed (recursive): ");
        while (reversed2 != null) {
            System.out.print(reversed2.val + " ");
            reversed2 = reversed2.next;
        }
        System.out.println();
    }
}
