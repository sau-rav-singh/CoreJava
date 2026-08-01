package advanced.trees;

public class MaxDepth {
    // QUESTION: Given the root of a binary tree, return its maximum depth.
    // Maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: 3
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive DFS solution
    public static int maxDepthRecursive(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right));
    }

    // Iterative BFS solution using queue
    public static int maxDepthIterative(TreeNode root) {
        if (root == null) return 0;

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {
        // Create tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Recursive: " + maxDepthRecursive(root)); // 3
        System.out.println("Iterative: " + maxDepthIterative(root)); // 3
    }
}
