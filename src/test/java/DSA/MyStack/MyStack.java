package DSA.MyStack;

public class MyStack {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node top;
    private int height;

    public MyStack(int value) {
        this.top = new Node(value);
        this.height = 1;
    }

    public void getTop() {
        System.out.println("Top Value is: "+this.top.value);
    }

    public void getHeight() {
        System.out.println("Height of the stack is: "+this.height);
    }

    public void printStack(){
        System.out.println("----------------------");
        Node temp = this.top;
        while(temp != null) {
            System.out.println("Stack Value: "+temp.value);
            temp = temp.next;
        }
        System.out.println("----------------------");
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
        this.height++;
    }
}
