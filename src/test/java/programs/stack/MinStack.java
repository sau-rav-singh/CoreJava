package programs.stack;

import java.util.Stack;

public class MinStack {
    // QUESTION: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    // Implement the MinStack class:
    // - MinStack() initializes the stack object.
    // - void push(int val) pushes the element val onto the stack.
    // - void pop() removes the element on the top of the stack.
    // - int top() gets the top element of the stack.
    // - int getMin() retrieves the minimum element in the stack.
    // Time Complexity: O(1) for all operations
    // Space Complexity: O(n)

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println(minStack.top());    // Returns 0
        System.out.println(minStack.getMin()); // Returns -2
    }
}
