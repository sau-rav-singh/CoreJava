package DataStructure.DoublyLinkedList;

import lombok.Getter;

@Getter
public class DoublyLinkedList {
    private Node head, tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        System.out.println("----DLL----");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Head Value is " + getHead().value + ", Tail Value is " + getTail().value + ", Length is " + getLength());
        System.out.println("-------------------");
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }
}
