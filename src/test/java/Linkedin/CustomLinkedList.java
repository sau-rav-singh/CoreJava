package Linkedin;

public class CustomLinkedList {
    int length;
    private Node head;
    private Node tail;

    public CustomLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public void add(int value) {
        Node node = new Node(value);
        if (length < 1) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public void removeFirst() {
        if (length <= 0)
            return;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
    }

    public void removeLast() {
        if (length <= 0)
            return;
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        length--;
    }

    public void remove(int index) {
        if (length <= 0)
            return;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete.next = null;
        length--;

    }

    public void deleteKey(int key) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.value == key) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }
}
