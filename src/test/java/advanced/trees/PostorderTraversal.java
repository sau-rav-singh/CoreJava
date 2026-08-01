package advanced.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    // QUESTION: Given the root of a binary tree, return the postorder traversal of its nodes' values.
    // Postorder traversal: Left -> Right -> Root
    // Example: Input: root = [1,null,2,3]
    //          Output: [3,2,1]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive solution
    public static List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private static void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.val);
    }

    // Iterative solution using two stacks
    public static List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + postorderTraversalRecursive(root)); // [3, 2, 1]
        System.out.println("Iterative: " + postorderTraversalIterative(root)); // [3, 2, 1]
    }
}
