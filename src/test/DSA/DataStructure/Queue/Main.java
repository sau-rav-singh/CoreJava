package DataStructure.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(20);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();

    }
}
