package advanced.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {
    // QUESTION: Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
    // (i.e., from left to right, then right to left for the next level and alternate between).
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: [[3],[20,9],[15,7]]
    // Time Complexity: O(n)
    // Space Complexity: O(w) where w is the maximum width of the tree

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (leftToRight) {
                    currentLevel.addLast(node.val);
                } else {
                    currentLevel.addFirst(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(currentLevel);
            leftToRight = !leftToRight;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(zigzagLevelOrder(root)); // [[3], [20, 9], [15, 7]]
    }
}
