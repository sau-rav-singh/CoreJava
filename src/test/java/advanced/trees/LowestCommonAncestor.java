package advanced.trees;

public class LowestCommonAncestor {
    // QUESTION: Given a binary tree, find the lowest common ancestor (LCA) of two given nodes.
    // The LCA is defined between two nodes p and q as the lowest node in T that has both p and q as descendants.
    // Example: Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    //          Output: 3
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    public static void main(String[] args) {
        // Create tree: [3,5,1,6,2,0,8,null,null,7,4]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left; // 5
        TreeNode q = root.right; // 1

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA: " + (lca != null ? lca.val : "null")); // Output: 3
    }
}
