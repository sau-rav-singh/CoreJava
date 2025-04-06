package DSA.DataStructure.LinkedList;

public class RemoveDupeFromSorted {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(3);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.append(5);
        myList.printList();
        myList.deleteDuplicates();
        myList.printList();
    }
}