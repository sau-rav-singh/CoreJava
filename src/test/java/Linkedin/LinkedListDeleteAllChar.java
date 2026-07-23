package Linkedin;

public class LinkedListDeleteAllChar {
    // QUESTION: Given a linked list and a key, delete all occurrences of the given key in the linked list.
    // Example: Input: 3 -> 3 -> 6 -> 9 -> 3 -> NULL, key = 3
    //          Output: 6 -> 9 -> NULL

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.printList();
        System.out.println("----------------------------");
        list.deleteKey(10);
        list.printList();
    }
}