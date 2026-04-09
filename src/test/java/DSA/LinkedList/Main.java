package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(4);
        myList.append(5);
        myList.append(6);
        myList.append(7);
        myList.getHead();
        myList.getTail();
        myList.getLength();
        myList.printList();
        LinkedList.Node removedNode = myList.removeLast();
        System.out.println("Removed Node: " + removedNode.value);
        myList.printList();
        myList.prepend(3);
        myList.printList();
        LinkedList.Node removedFirstNode = myList.removeFirst();
        System.out.println("Removed First Node: " + removedFirstNode.value);
        myList.printList();
        LinkedList.Node node = myList.get(2);
        System.out.println("Node at index 2: " + node.value);
        if (myList.set(2, 8))
            myList.printList();
        if (myList.insert(2, 9))
            myList.printList();
        removedNode = myList.remove(2);
        System.out.println("Removed Node: " + removedNode.value);
        myList.printList();
        myList.reverse();
        myList.printList();
        LinkedList.Node middleNode = myList.findMiddleNode();
        System.out.println("Middle Node: " + middleNode.value);
        System.out.println("Has Loop: " + myList.hasLoop());
        System.out.println(myList.findKthFromEnd(3).value);
    }
}
