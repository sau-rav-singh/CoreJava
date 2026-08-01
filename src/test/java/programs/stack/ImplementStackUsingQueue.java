package programs.stack;

import org.testng.Assert;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement Stack Using Queue
 *
 * Problem Statement:
 * Implement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 *
 * Constraints:
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, top, and empty.
 */
public class ImplementStackUsingQueue {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public ImplementStackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(stack.top(), 3);
        Assert.assertEquals(stack.pop(), 3);
        Assert.assertEquals(stack.pop(), 2);
        Assert.assertFalse(stack.empty());
        Assert.assertEquals(stack.pop(), 1);
        Assert.assertTrue(stack.empty());
    }

    /**
     * APPROACH: Two Queues
     *
     * Time Complexity: O(1) for push, O(N) for pop and top
     * - Push is constant, pop/top require transferring elements.
     *
     * Space Complexity: O(N)
     * - Storing all elements in queues.
     */
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
}
