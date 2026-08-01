package advanced.linkedlist;

public class PalindromeLinkedList {
    // QUESTION: Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
    // Example: Input: head = [1,2,2,1]
    //          Output: true
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

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        // Compare first half with reversed second half
        boolean result = true;
        ListNode secondHalfCopy = secondHalf;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the list (optional)
        reverseList(secondHalfCopy);

        return result;
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
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(head1)); // Output: true

        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println(isPalindrome(head2)); // Output: false
    }
}
