package InterviewPrep.Trees;

public class SymmetricTree {
    // QUESTION: Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
    // Example: Input: root = [1,2,2,3,4,4,3]
    //          Output: true
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    // Iterative solution using queue
    public static boolean isSymmetricIterative(TreeNode root) {
        if (root == null) return true;

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;

            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        // Create symmetric tree: [1,2,2,3,4,4,3]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println("Recursive: " + isSymmetric(root)); // true
        System.out.println("Iterative: " + isSymmetricIterative(root)); // true

        // Create non-symmetric tree: [1,2,2,null,3,null,3]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        System.out.println("Non-symmetric: " + isSymmetric(root2)); // false
    }
}
