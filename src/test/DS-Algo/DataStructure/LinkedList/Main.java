package DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(10);
        myList.append(20);
        myList.removeLast();
        myList.printList();
    }
}
