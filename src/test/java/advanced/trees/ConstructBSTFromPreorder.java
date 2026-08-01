package advanced.trees;

public class ConstructBSTFromPreorder {
    // QUESTION: Given an array of integers preorder, which represents the preorder traversal of a BST
    // (i.e., binary search tree), construct the tree and return its root.
    // Example: Input: preorder = [8,5,1,7,10,12]
    //          Output: [8,5,10,1,7,null,12]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int min, int max) {
        if (index >= preorder.length) return null;

        int val = preorder[index];
        if (val < min || val > max) return null;

        TreeNode node = new TreeNode(val);
        index++;
        node.left = build(preorder, min, val);
        node.right = build(preorder, val, max);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        ConstructBSTFromPreorder solution = new ConstructBSTFromPreorder();
        TreeNode root = solution.bstFromPreorder(preorder);
        System.out.println("BST constructed from preorder traversal");
        System.out.println("Root value: " + root.val); // Output: 8
    }
}
