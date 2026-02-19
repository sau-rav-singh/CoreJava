package Notion;

public class LL {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    static class SinglyLinkedList {
        Node head, tail;

        public SinglyLinkedList() {
            head = null;
            tail = null;
        }

        public void insertAtHead(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public void insertAtTail(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
                return;
            }
            tail.next = node;
            tail = node;
        }

        public void deleteValue(int value) {
            if (head == null) return;

            if (head.value == value) {
                if (head == tail) tail = null;
                head = head.next;
                return;
            }

            Node p1 = head;
            Node p2 = null;

            while (p1 != null) {
                if (p1.value == value) {
                    if (p1 == tail) tail = p2;
                    p2.next = p1.next;
                    return;
                }
                p2 = p1;
                p1 = p1.next;
            }
        }

        public void print() {
            Node p1 = head;
            while (p1 != null) {
                System.out.print(p1.value + " -> ");
                p1 = p1.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(0);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);

        System.out.println("Initial list:");
        list.print();

        System.out.println("Deleting 2:");
        list.deleteValue(2);
        list.print();

        System.out.println("Deleting 0 (Head):");
        list.deleteValue(0);
        list.print();
    }
}