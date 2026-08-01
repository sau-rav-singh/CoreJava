package programs.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    // QUESTION: Implement a last-in-first-out (LIFO) stack using only two queues.
    // The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
    // Time Complexity: O(1) for push, O(n) for pop and top
    // Space Complexity: O(n)

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public ImplementStackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return queue1.poll();
    }

    public int top() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());    // Output: 3
        System.out.println(stack.pop());    // Output: 3
        System.out.println(stack.pop());    // Output: 2
        System.out.println(stack.empty());  // Output: false
        System.out.println(stack.pop());    // Output: 1
        System.out.println(stack.empty());  // Output: true
    }
}
