package DSA.DataStructure.Queue;

import DSA.DataStructure.LinkedList.Node;
import lombok.Getter;

@Getter
public class Queue {
    private Node first, last;
    private int length;

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("First Value is " + getFirst().value +
                ", Last Value is " + getLast().value +
                ", Length is " + getLength());
        System.out.println("-------------------");
    }

    public void enqueue(int value){//append
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public Node dequeue(){
        if (length == 0) return null;
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;

        if (length == 0) {
            last = null;
        }

        return temp;
    }
}
