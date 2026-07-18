package DSA.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(1);
        stack.getTop();
        stack.getHeight();
        stack.printStack();
        stack.push(2);
        stack.getTop();
        stack.getHeight();
        stack.printStack();
    }
}
