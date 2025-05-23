package DSA.DataStructure.LinkedList;

import lombok.Getter;

@Getter
public class LinkedList {

    private Node head, tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        System.out.println("----Linked List----");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Head Value is " + getHead().value +
                ", Tail Value is " + getTail().value +
                ", Length is " + getLength());
        System.out.println("-------------------");
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
        }
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        if (length <= 1) return;

        Node temp = head;
        head = tail;
        tail = temp;

        Node prev = null;
        Node next;

        for (int i = 0; i < length; i++) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
    }
    public void deleteDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
                length--;
                if(current.next == null) {
                    tail = current;
                }
            } else {
                current = current.next;
            }
        }
    }
}
