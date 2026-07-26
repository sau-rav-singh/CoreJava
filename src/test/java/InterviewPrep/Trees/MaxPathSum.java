package InterviewPrep.Trees;

public class MaxPathSum {
    // QUESTION: A path in a binary tree is a sequence of nodes where each pair of adjacent nodes
    // in the sequence has an edge connecting them. A node can only appear in the sequence at most once.
    // The path sum of a path is the sum of the node's values in the path. Return the maximum path sum.
    // Example: Input: root = [-10,9,20,null,null,15,7]
    //          Output: 42 (path: 15 -> 20 -> 7)
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    private static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }

    private static int maxGain(TreeNode node) {
        if (node == null) return 0;

        // Max gain from left and right subtrees (ignore negative gains)
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        // Path sum with current node as the root of the path
        int pathSum = node.val + leftGain + rightGain;

        // Update global maximum
        maxSum = Math.max(maxSum, pathSum);

        // Return the max gain if we continue the path
        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {
        // Create tree: [-10,9,20,null,null,15,7]
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root)); // Output: 42
    }
}
