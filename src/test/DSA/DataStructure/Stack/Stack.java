package DSA.DataStructure.Stack;

import DSA.DataStructure.LinkedList.Node;
import lombok.Getter;

@Getter
public class Stack {

    private Node top;
    private int height;

    public Stack(int value) {
        top = new Node(value);
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Head Value is " + getTop().value +
                ", Length is " + getHeight());
        System.out.println("-------------------");
    }

    public void push(int value) {
        Node node = new Node(value);
        if (height == 0) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        height++;
    }

    public Node pop() {
        if (height == 0)
            return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }
}
