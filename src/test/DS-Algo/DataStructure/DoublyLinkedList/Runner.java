package DataStructure.DoublyLinkedList;

public class Runner {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList(10);
        dll.append(20);
        dll.append(30);
        dll.printList();
        dll.removeLast();
        dll.printList();
    }
}
