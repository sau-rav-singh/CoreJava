package DataStructure.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public boolean insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return true;
        }
        
        Node temp = root;
        while (true) {
            if (node.value == temp.value)
                return false;
            if (node.value < temp.value) {
                if (temp.left == null) {
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    static class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }
}
