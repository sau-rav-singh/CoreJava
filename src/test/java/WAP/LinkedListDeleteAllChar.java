package Linkedin;

public class LinkedListDeleteAllChar {
    //Write a Program to create a linked list with following inputs and Delete all occurrences of a given key in a linked list.
    //Input: head: 3 -> 3 -> 6 -> 9 -> 3 -> NULL, key = 3
    //Output: 6 -> 9 -> NULL, i.e., we need to delete All occurrences of the given key = 3 from the Linked List

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