# Tree Problems - Interview Prep Guide

## Overview
This folder contains **17 problems** focused on binary tree data structures, covering traversals, BST operations, and advanced tree algorithms.

## Problem Categories

### 1. **Tree Traversals** (3 problems)
- `InorderTraversal.java` - Left-Root-Right traversal
- `PreorderTraversal.java` - Root-Left-Right traversal
- `PostorderTraversal.java` - Left-Right-Root traversal

**Techniques**: Recursive and iterative approaches
**Time Complexity**: O(n), **Space Complexity**: O(h) where h is height

### 2. **Basic Tree Properties** (2 problems)
- `MaxDepth.java` - Find height/depth of binary tree
- `SymmetricTree.java` - Check if tree is mirror of itself

**Interview Frequency**: Very Common

### 3. **Level Order Traversals** (2 problems)
- `LevelOrderTraversal.java` - BFS level by level
- `ZigzagLevelOrder.java` - Alternate left-right, right-left

**Technique**: Queue-based BFS
**Time Complexity**: O(n), **Space Complexity**: O(w) where w is max width

### 4. **Path Problems** (3 problems)
- `PathSum.java` - Check if root-to-leaf path sums to target
- `AllPathsFromRootToLeaf.java` - Get all root-to-leaf paths
- `MaxPathSum.java` - Maximum sum path (any node to any node)

**Techniques**: DFS with running sum, post-order DFS

### 5. **BST Operations** (2 problems)
- `KthSmallestInBST.java` - Find kth smallest element in BST
- `ConstructBSTFromPreorder.java` - Build BST from preorder traversal

**Key Insight**: BST property enables efficient searching

### 6. **advanced Tree Problems** (5 problems)
- `LowestCommonAncestor.java` - Find LCA of two nodes
- `RightViewOfBinaryTree.java` - Get rightmost node at each level
- `SerializeDeserializeBinaryTree.java` - Convert tree to string and back
- `RecoverBST.java` - Fix BST with two swapped nodes
- `BalancedBinaryTree.java` - Check if tree is height-balanced

**Interview Frequency**: Very Important

---

## Key Techniques to Master

### 1. **Recursive Tree Traversal**
```java
void inorder(TreeNode node) {
    if (node == null) return;
    inorder(node.left);
    visit(node);
    inorder(node.right);
}
```
**Use Case**: All traversal problems
**Time**: O(n), **Space**: O(h) for recursion stack

### 2. **Iterative Traversal with Stack**
```java
Stack<TreeNode> stack = new Stack<>();
TreeNode current = root;
while (current != null || !stack.isEmpty()) {
    while (current != null) {
        stack.push(current);
        current = current.left;
    }
    current = stack.pop();
    visit(current);
    current = current.right;
}
```
**Use Case**: When recursion depth is too large
**Time**: O(n), **Space**: O(h)

### 3. **Level Order (BFS)**
```java
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while (!queue.isEmpty()) {
    int levelSize = queue.size();
    for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```
**Use Case**: Level-based problems, shortest path
**Time**: O(n), **Space**: O(w)

### 4. **Post-order DFS for Path Problems**
```java
int maxGain(TreeNode node) {
    if (node == null) return 0;
    int leftGain = Math.max(maxGain(node.left), 0);
    int rightGain = Math.max(maxGain(node.right), 0);
    // Process current node
    return node.val + Math.max(leftGain, rightGain);
}
```
**Use Case**: Max path sum, tree diameter
**Time**: O(n), **Space**: O(h)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `InorderTraversal.java` - Basic traversal
- [ ] `PreorderTraversal.java` - Root-first traversal
- [ ] `PostorderTraversal.java` - Leaf-first traversal
- [ ] `MaxDepth.java` - Simple DFS
- [ ] `SymmetricTree.java` - Recursive comparison

### Medium Level
- [ ] `LevelOrderTraversal.java` - BFS pattern
- [ ] `ZigzagLevelOrder.java` - Modified BFS
- [ ] `LowestCommonAncestor.java` - **MOST IMPORTANT**
- [ ] `PathSum.java` - Path problems
- [ ] `KthSmallestInBST.java` - BST property
- [ ] `RightViewOfBinaryTree.java` - Level tracking
- [ ] `BalancedBinaryTree.java` - Height checking

### Hard Level
- [ ] `MaxPathSum.java` - Complex post-order DFS
- [ ] `SerializeDeserializeBinaryTree.java` - Tree serialization
- [ ] `RecoverBST.java` - BST recovery
- [ ] `ConstructBSTFromPreorder.java` - Tree construction
- [ ] `BuildFromInorderPostorder.java` - Tree reconstruction

---

## Common Interview Questions

### 1. Tree Traversal Order
**Problem**: Implement different traversal orders
**Solutions**: Recursive (simple), Iterative (with stack)
**See**: `InorderTraversal.java`, `PreorderTraversal.java`, `PostorderTraversal.java`

### 2. Lowest Common Ancestor
**Problem**: Find LCA of two nodes in BST/Binary Tree
**Key Insight**: Post-order DFS or BST property
**See**: `LowestCommonAncestor.java`

### 3. Level Order Traversal
**Problem**: Traverse tree level by level
**Technique**: Queue-based BFS
**See**: `LevelOrderTraversal.java`

### 4. Maximum Path Sum
**Problem**: Find maximum sum path (any node to any node)
**Strategy**: Post-order DFS returning max path through node
**See**: `MaxPathSum.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Inorder Traversal | O(n) | O(h) | Recursive/Stack |
| Level Order | O(n) | O(w) | BFS Queue |
| Max Depth | O(n) | O(h) | DFS |
| LCA | O(n) | O(h) | Post-order DFS |
| Path Sum | O(n) | O(h) | DFS with sum |
| Max Path Sum | O(n) | O(h) | Post-order DFS |
| Serialize/Deserialize | O(n) | O(n) | Preorder + markers |
| Balanced Check | O(n) | O(h) | Height tracking |
| Kth Smallest BST | O(k+h) | O(h) | Inorder traversal |

*h = tree height, w = max width*

---

## Related Files

**Graphs folder:**
- Similar DFS/BFS patterns
- Tree is a special case of graph

**Stack folder:**
- Iterative tree traversals use stack

---

## Code Patterns to Remember

### Pattern 1: Recursive Traversal
```java
void traverse(TreeNode node) {
    if (node == null) return;
    // Preorder: process here
    traverse(node.left);
    // Inorder: process here
    traverse(node.right);
    // Postorder: process here
}
```

### Pattern 2: Level Order BFS
```java
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        // Process node
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```

### Pattern 3: Post-order for Path Problems
```java
int dfs(TreeNode node) {
    if (node == null) return 0;
    int left = dfs(node.left);
    int right = dfs(node.right);
    // Combine results
    return combine(left, right, node.val);
}
```

---

## Practice Tips

### When to use Recursion vs Iteration:
- **Recursion**: Simpler code, natural for tree problems
- **Iteration**: When recursion depth might cause stack overflow
- **Interview**: Know both, explain tradeoffs

### BST vs Binary Tree:
- **BST**: Left < Root < Right property enables efficient search
- **Binary Tree**: No ordering property
- **Strategy**: Use BST property when available for optimization

### Common Mistakes:
- Not handling null nodes properly
- Forgetting to restore state in backtracking
- Incorrect base cases in recursion
- Not considering tree height in space complexity

---

Generated: Interview Prep Package - Trees Folder
