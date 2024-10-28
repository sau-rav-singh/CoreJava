package DataStructure.DoublyLinkedList;

public class Runner {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(10);
        dll.append(20);
        dll.append(30);
        dll.printList();
        Node removed = dll.removeLast();
        System.out.println("Removed Value of the Node is " + removed.value);
        dll.printList();
        dll.prepend(5);
        dll.printList();
    }
}
