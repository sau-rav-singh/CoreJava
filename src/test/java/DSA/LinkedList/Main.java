package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList=new LinkedList(4);
        myList.append(5);
        myList.append(6);
        myList.append(7);
        myList.getHead();
        myList.getTail();
        myList.getLength();
        myList.printList();
        LinkedList.Node removedNode=myList.removeLast();
        System.out.println("Removed Node: "+removedNode.value);
        myList.printList();
    }
}
