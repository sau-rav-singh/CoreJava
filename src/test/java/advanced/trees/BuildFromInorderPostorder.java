package advanced.trees;

public class BuildFromInorderPostorder {
    // QUESTION: Given two integer arrays inorder and postorder where inorder is the inorder traversal of a
    // binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
    // Example: Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
    //          Output: [3,9,20,null,null,15,7]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    private int postIndex;
    private int[] inorder;
    private int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        this.postIndex = postorder.length - 1;
        return build(0, inorder.length - 1);
    }

    private TreeNode build(int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode node = new TreeNode(postorder[postIndex]);
        postIndex--;

        // If this node has no children
        if (inStart == inEnd) return node;

        // Find index of this node in inorder traversal
        int inIndex = search(inorder, inStart, inEnd, node.val);

        // Build right subtree first (since postorder processes right before left)
        node.right = build(inIndex + 1, inEnd);
        node.left = build(inStart, inIndex - 1);

        return node;
    }

    private int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        
        BuildFromInorderPostorder solution = new BuildFromInorderPostorder();
        TreeNode root = solution.buildTree(inorder, postorder);
        System.out.println("Tree constructed from inorder and postorder");
        System.out.println("Root value: " + root.val); // Output: 3
    }
}
