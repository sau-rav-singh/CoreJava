package InterviewPrep.Trees;

import java.util.Stack;

public class KthSmallestInBST {
    // QUESTION: Given the root of a binary search tree, and an integer k, return the kth smallest value
    // (1-indexed) in the tree.
    // Example: Input: root = [3,1,4,null,2], k = 1
    //          Output: 1
    // Time Complexity: O(k + h) where h is the height of the tree
    // Space Complexity: O(h) where h is the height of the tree

    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) {
                return current.val;
            }

            current = current.right;
        }

        return -1; // k is out of bounds
    }

    public static void main(String[] args) {
        // Create BST: [3,1,4,null,2]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest(root, 1)); // Output: 1
        System.out.println(kthSmallest(root, 2)); // Output: 2
        System.out.println(kthSmallest(root, 3)); // Output: 3
        System.out.println(kthSmallest(root, 4)); // Output: 4
    }
}
