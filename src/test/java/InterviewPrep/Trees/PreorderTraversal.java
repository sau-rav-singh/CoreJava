package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    // QUESTION: Given the root of a binary tree, return the preorder traversal of its nodes' values.
    // Preorder traversal: Root -> Left -> Right
    // Example: Input: root = [1,null,2,3]
    //          Output: [1,2,3]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive solution
    public static List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }

    // Iterative solution using stack
    public static List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + preorderTraversalRecursive(root)); // [1, 2, 3]
        System.out.println("Iterative: " + preorderTraversalIterative(root)); // [1, 2, 3]
    }
}
