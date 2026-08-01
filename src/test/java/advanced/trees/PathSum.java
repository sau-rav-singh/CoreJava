package advanced.trees;

public class PathSum {
    // QUESTION: Given the root of a binary tree and an integer targetSum, return true if the tree has a
    // root-to-leaf path such that adding up all the values along the path equals targetSum.
    // Example: Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
    //          Output: true (5 + 4 + 11 + 2 = 22)
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        
        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    public static void main(String[] args) {
        // Create tree: [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        System.out.println(hasPathSum(root, 22)); // Output: true
        System.out.println(hasPathSum(root, 26)); // Output: false
    }
}
