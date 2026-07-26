# Backtracking Problems - Interview Prep Guide

## Overview
This folder contains **6 problems** focused on backtracking algorithms, covering combination generation, permutation problems, and constraint satisfaction.

## Problem Categories

### 1. **Combination Problems** (2 problems)
- `Combinations.java` - Generate all combinations of n items taken k at a time
- `CombinationSum.java` - Find combinations that sum to target

**Technique**: Backtracking with index tracking
**Time Complexity**: O(C(n,k)) to O(n^t/m), **Space Complexity**: O(k) to O(t)

### 2. **String/Pattern Problems** (2 problems)
- `WordSearch.java` - Search for word in 2D board
- `GenerateParentheses.java` - Generate all valid parentheses combinations

**Applications**: Constraint satisfaction, pattern matching
**Interview Frequency**: Very Common

### 3. **Partitioning Problems** (1 problem)
- `PalindromePartitioning.java` - Partition string into palindromic substrings

**Technique**: Backtracking with DP for palindrome check

### 4. **N-Queens Problem** (1 problem)
- `NQueens.java` - Place N queens safely on N×N board

**Interview Frequency**: Important

---

## Key Techniques to Master

### 1. **Basic Backtracking Pattern**
```java
void backtrack(List<Integer> current, int start) {
    if (current.size() == k) {
        result.add(new ArrayList<>(current));
        return;
    }
    for (int i = start; i < n; i++) {
        current.add(i);
        backtrack(current, i + 1);
        current.remove(current.size() - 1);
    }
}
```
**Use Case**: Combinations, subsets
**Time**: O(C(n,k)), **Space**: O(k)

### 2. **DFS with Backtracking (Grid)**
```java
void dfs(char[][] board, int i, int j, int index) {
    if (index == word.length()) {
        found = true;
        return;
    }
    if (i < 0 || i >= rows || j < 0 || j >= cols || 
        board[i][j] != word.charAt(index)) return;
    
    char temp = board[i][j];
    board[i][j] = '#'; // Mark visited
    
    dfs(board, i+1, j, index+1);
    dfs(board, i-1, j, index+1);
    dfs(board, i, j+1, index+1);
    dfs(board, i, j-1, index+1);
    
    board[i][j] = temp; // Restore
}
```
**Use Case**: Word search, grid problems
**Time**: O(m*n*4^L), **Space**: O(L)

### 3. **Constraint-Based Backtracking**
```java
void backtrack(String current, int open, int close, int max) {
    if (current.length() == max * 2) {
        result.add(current);
        return;
    }
    if (open < max) backtrack(current + "(", open + 1, close, max);
    if (close < open) backtrack(current + ")", open, close + 1, max);
}
```
**Use Case**: Generate parentheses, constraint satisfaction
**Time**: O(4^n/√n), **Space**: O(n)

### 4. **N-Queens Backtracking**
```java
void backtrack(char[][] board, int row) {
    if (row == n) {
        result.add(constructSolution(board));
        return;
    }
    for (int col = 0; col < n; col++) {
        if (isValid(board, row, col)) {
            board[row][col] = 'Q';
            backtrack(board, row + 1);
            board[row][col] = '.';
        }
    }
}
```
**Use Case**: N-Queens, constraint satisfaction
**Time**: O(n!), **Space**: O(n²)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `Combinations.java` - Basic backtracking
- [ ] `GenerateParentheses.java` - Constraint-based

### Medium Level
- [ ] `WordSearch.java` - **MOST IMPORTANT** - Grid DFS
- [ ] `PalindromePartitioning.java` - String partitioning
- [ ] `CombinationSum.java` - Sum combinations

### Hard Level
- [ ] `NQueens.java` - Constraint satisfaction

---

## Common Interview Questions

### 1. Generate Combinations
**Problem**: Generate all combinations of n items taken k at a time
**Solution**: Backtracking with index to avoid duplicates
**See**: `Combinations.java`

### 2. Word Search
**Problem**: Search for word in 2D board
**Key Insight**: DFS with backtracking, mark visited cells
**See**: `WordSearch.java`

### 3. Generate Parentheses
**Problem**: Generate all valid parentheses combinations
**Strategy**: Track open/close counts, validate constraints
**See**: `GenerateParentheses.java`

### 4. N-Queens
**Problem**: Place N queens safely on N×N board
**Technique**: Backtracking with constraint checking
**See**: `NQueens.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Combinations | O(C(n,k)) | O(k) | Backtracking |
| Word Search | O(m*n*4^L) | O(L) | Grid DFS |
| Generate Parentheses | O(4^n/√n) | O(n) | Constraint-based |
| Palindrome Partition | O(n*2^n) | O(n) | Backtracking + DP |
| Combination Sum | O(n^t/m) | O(t) | Backtracking |
| N-Queens | O(n!) | O(n²) | Constraint checking |

*n = input size, k = combination size, L = word length, t = target, m = min element*

---

## Related Files

**Graphs folder:**
- Similar DFS patterns

**Dynamic Programming folder:**
- DP optimization for some backtracking problems

---

## Code Patterns to Remember

### Pattern 1: Basic Backtracking
```java
void backtrack(List<Integer> current, int start) {
    if (condition) {
        result.add(new ArrayList<>(current));
        return;
    }
    for (int i = start; i < n; i++) {
        current.add(i);
        backtrack(current, i + 1);
        current.remove(current.size() - 1);
    }
}
```

### Pattern 2: Grid DFS with Backtracking
```java
void dfs(int i, int j, int index) {
    if (outOfBounds || !match) return;
    markVisited();
    dfs(i+1, j, index+1); dfs(i-1, j, index+1);
    dfs(i, j+1, index+1); dfs(i, j-1, index+1);
    restore();
}
```

### Pattern 3: Constraint-Based Generation
```java
void backtrack(String current, int count1, int count2) {
    if (complete) { add result; return; }
    if (valid1) backtrack(current + "1", count1 + 1, count2);
    if (valid2) backtrack(current + "2", count1, count2 + 1);
}
```

---

## Practice Tips

### When to use Backtracking:
- **Combinations/Permutations**: Generate all possibilities
- **Constraint Satisfaction**: N-Queens, Sudoku
- **Path Finding**: Word search, maze problems
- **Partitioning**: String partitioning, subset problems

### Optimization Techniques:
- **Pruning**: Skip invalid branches early
- **Memoization**: Cache results for repeated subproblems
- **Ordering**: Process most constrained elements first

### Common Mistakes:
- Not restoring state after backtracking
- Not handling duplicates properly
- Inefficient pruning leading to TLE
- Not considering space complexity of recursion stack

---

Generated: Interview Prep Package - Backtracking Folder
