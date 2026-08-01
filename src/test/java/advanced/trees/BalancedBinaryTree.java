package advanced.trees;

public class BalancedBinaryTree {
    // QUESTION: Given a binary tree, determine if it is height-balanced.
    // A height-balanced binary tree is defined as a binary tree in which the left and right subtrees
    // of every node differ in height by no more than 1.
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: true
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private static int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Create balanced tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root)); // Output: true

        // Create unbalanced tree: [1,2,2,3,3,null,null,4,4]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);

        System.out.println(isBalanced(root2)); // Output: false
    }
}
