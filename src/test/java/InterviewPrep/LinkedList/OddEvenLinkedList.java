package InterviewPrep.LinkedList;

public class OddEvenLinkedList {
    // QUESTION: Given the head of a singly linked list, group all the nodes with odd indices together followed
    // by the nodes with even indices, and return the reordered list. The first node is considered odd.
    // Example: Input: head = [1,2,3,4,5]
    //          Output: [1,3,5,2,4]
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

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        ListNode result = oddEvenList(head);
        System.out.print("Odd-Even grouped: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println(); // Output: 1 3 5 2 4
    }
}
