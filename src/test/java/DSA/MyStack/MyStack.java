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
        System.out.println("Top: "+this.top.value);
    }

    public void getHeight() {
        System.out.println("Height: "+this.height);
    }

    public void printStack(){
        Node temp = this.top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
