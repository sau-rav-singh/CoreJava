package LeetCode;

public class MergeSortedLists {

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

    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode tail = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return mergedList.next;
    }

    public static void main(String[] args) {
        MergeSortedLists solution = new MergeSortedLists();

        // Create sample sorted lists
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge the lists

        // Print the merged list
        ListNode current = solution.mergeTwoSortedLists(list1, list2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Add a newline for better readability.

        //Test case 2: Empty lists
        ListNode empty1 = null;
        ListNode empty2 = null;

        current = solution.mergeTwoSortedLists(empty1, empty2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        //Test case 3: One empty list
        ListNode list3 = new ListNode(5, new ListNode(6, new ListNode(7)));
        current = solution.mergeTwoSortedLists(list3, null);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}