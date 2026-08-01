package advanced.trees;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromRootToLeaf {
    // QUESTION: Given the root of a binary tree, return all root-to-leaf paths in any order.
    // Example: Input: root = [1,2,3,null,5]
    //          Output: ["1->2->5","1->3"]
    // Time Complexity: O(n*h) where h is the height of the tree
    // Space Complexity: O(h) where h is the height of the tree

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", result);
        }
        return result;
    }

    private static void findPaths(TreeNode node, String currentPath, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(currentPath + node.val);
            return;
        }

        String newPath = currentPath + node.val + "->";
        if (node.left != null) {
            findPaths(node.left, newPath, result);
        }
        if (node.right != null) {
            findPaths(node.right, newPath, result);
        }
    }

    public static void main(String[] args) {
        // Create tree: [1,2,3,null,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        System.out.println(binaryTreePaths(root)); // ["1->2->5", "1->3"]
    }
}
