package advanced.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    // QUESTION: Given the root of a binary tree, return the inorder traversal of its nodes' values.
    // Inorder traversal: Left -> Root -> Right
    // Example: Input: root = [1,null,2,3]
    //          Output: [1,3,2]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive solution
    public static List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private static void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    // Iterative solution using stack
    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + inorderTraversalRecursive(root)); // [1, 3, 2]
        System.out.println("Iterative: " + inorderTraversalIterative(root)); // [1, 3, 2]
    }
}
