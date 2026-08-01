package advanced.trees;

public class RecoverBST {
    // QUESTION: You are given the root of a binary search tree (BST), where the values of exactly two nodes
    // of the tree were swapped by mistake. Recover the tree without changing its structure.
    // Example: Input: root = [1,3,null,null,2]
    //          Output: [3,1,null,null,2]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        
        // Swap the values
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // Check for violation
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;

        inorder(node.right);
    }

    public static void main(String[] args) {
        // Create BST with swapped nodes: [1,3,null,null,2] (should be [3,1,null,null,2])
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        RecoverBST solution = new RecoverBST();
        solution.recoverTree(root);
        System.out.println("BST recovered");
        System.out.println("Root value: " + root.val); // Output: 3
    }
}
