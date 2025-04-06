package DSA.DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(10);
        myList.append(20);
        myList.removeLast();
        myList.printList();
        myList.removeLast();
        myList.prepend(30);
        Node removedNode=myList.removeFirst();
        System.out.println(removedNode.value);
    }
}
