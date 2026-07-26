# Dynamic Programming Problems - Interview Prep Guide

## Overview
This folder contains **8 problems** focused on dynamic programming techniques, covering classic DP patterns and optimizations.

## Problem Categories

### 1. **Classic DP Patterns** (3 problems)
- `ClimbingStairs.java` - Fibonacci-like pattern
- `HouseRobber.java` - Rob houses without robbing adjacent ones
- `HouseRobberII.java` - Circular arrangement variant

**Technique**: 1D DP with state variables
**Time Complexity**: O(n), **Space Complexity**: O(1) optimized

### 2. **Knapsack Variants** (2 problems)
- `CoinChange.java` - Minimum coins for amount (unbounded knapsack)
- `UniquePaths.java` - Count paths in grid (combinatorics)

**Applications**: Resource allocation, path counting
**Interview Frequency**: Very Common

### 3. **Sequence Problems** (2 problems)
- `LongestIncreasingSubsequence.java` - Find length of LIS
- `LongestCommonSubsequence.java` - LCS of two strings

**Techniques**: Binary search optimization, 2D DP

### 4. **String DP** (1 problem)
- `EditDistance.java` - Minimum edits to transform one string to another

**Interview Frequency**: Very Important

### 5. **Array DP** (1 problem)
- `MaximumProductSubarray.java` - Subarray with maximum product

**Technique**: Track both min and max products

---

## Key Techniques to Master

### 1. **1D DP Pattern**
```java
int[] dp = new int[n + 1];
dp[0] = 0; // Base case
for (int i = 1; i <= n; i++) {
    dp[i] = dp[i - 1] + dp[i - 2]; // Recurrence
}
return dp[n];
```
**Use Case**: Fibonacci, climbing stairs, house robber
**Time**: O(n), **Space**: O(n) or O(1) optimized

### 2. **2D DP Pattern**
```java
int[][] dp = new int[m + 1][n + 1];
for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= n; j++) {
        if (s1[i-1] == s2[j-1]) {
            dp[i][j] = dp[i-1][j-1] + 1;
        } else {
            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
}
```
**Use Case**: LCS, edit distance, grid problems
**Time**: O(m*n), **Space**: O(m*n) or O(n) optimized

### 3. **Space Optimization**
```java
int prev2 = 0, prev1 = 0;
for (int i = 0; i < n; i++) {
    int current = Math.max(prev1, prev2 + nums[i]);
    prev2 = prev1;
    prev1 = current;
}
return prev1;
```
**Use Case**: When only previous states are needed
**Time**: O(n), **Space**: O(1)

### 4. **Binary Search Optimization (LIS)**
```java
int[] tails = new int[n];
int size = 0;
for (int num : nums) {
    int left = 0, right = size;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (tails[mid] < num) left = mid + 1;
        else right = mid;
    }
    tails[left] = num;
    if (left == size) size++;
}
return size;
```
**Use Case**: Longest increasing subsequence
**Time**: O(n log n), **Space**: O(n)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `ClimbingStairs.java` - Basic DP pattern
- [ ] `HouseRobber.java` - 1D DP with optimization
- [ ] `UniquePaths.java` - Grid DP

### Medium Level
- [ ] `CoinChange.java` - **MOST IMPORTANT** - Unbounded knapsack
- [ ] `LongestIncreasingSubsequence.java` - Binary search optimization
- [ ] `HouseRobberII.java` - Circular variant
- [ ] `MaximumProductSubarray.java` - Track min/max

### Hard Level
- [ ] `LongestCommonSubsequence.java` - 2D DP
- [ ] `EditDistance.java` - **MOST IMPORTANT** - String DP

---

## Common Interview Questions

### 1. Climbing Stairs
**Problem**: Count ways to climb n stairs taking 1 or 2 steps
**Solution**: Fibonacci pattern, DP or formula
**See**: `ClimbingStairs.java`

### 2. Coin Change
**Problem**: Minimum coins to make amount
**Key Insight**: Unbounded knapsack, DP with amount dimension
**See**: `CoinChange.java`

### 3. Longest Common Subsequence
**Problem**: Find longest common subsequence of two strings
**Strategy**: 2D DP comparing characters
**See**: `LongestCommonSubsequence.java`

### 4. Edit Distance
**Problem**: Minimum edits to transform one string to another
**Technique**: 2D DP with three operations (insert, delete, replace)
**See**: `EditDistance.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Climbing Stairs | O(n) | O(1) | 1D DP |
| House Robber | O(n) | O(1) | 1D DP |
| House Robber II | O(n) | O(1) | Two DP calls |
| Coin Change | O(n*m) | O(n) | 1D DP (knapsack) |
| Unique Paths | O(m*n) | O(n) | 2D DP optimized |
| LIS | O(n log n) | O(n) | Binary search |
| LCS | O(m*n) | O(m*n) | 2D DP |
| Edit Distance | O(m*n) | O(m*n) | 2D DP |
| Max Product | O(n) | O(1) | Track min/max |

*n = length/amount, m = other dimension*

---

## Related Files

**Array folder:**
- Similar subarray problems

**String folder:**
- String manipulation techniques

---

## Code Patterns to Remember

### Pattern 1: 1D DP with Optimization
```java
int prev2 = 0, prev1 = 0;
for (int i = 0; i < n; i++) {
    int current = calculate(prev1, prev2, nums[i]);
    prev2 = prev1;
    prev1 = current;
}
return prev1;
```

### Pattern 2: Knapsack Pattern
```java
int[] dp = new int[amount + 1];
Arrays.fill(dp, amount + 1);
dp[0] = 0;
for (int coin : coins) {
    for (int i = coin; i <= amount; i++) {
        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
    }
}
return dp[amount];
```

### Pattern 2: 2D DP for Strings
```java
int[][] dp = new int[m + 1][n + 1];
for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= n; j++) {
        if (s1[i-1] == s2[j-1]) {
            dp[i][j] = dp[i-1][j-1] + 1;
        } else {
            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
}
```

---

## Practice Tips

### DP Problem Identification:
- **Optimal substructure**: Can problem be broken into subproblems?
- **Overlapping subproblems**: Are subproblems repeated?
- **State definition**: What parameters define the state?

### Common DP Patterns:
- **Linear DP**: Climbing stairs, house robber
- **Knapsack**: Coin change, subset problems
- **LCS/Edit Distance**: String comparison
- **Grid DP**: Unique paths, minimum path sum

### Space Optimization:
- Always ask: Can we reduce space?
- Use rolling arrays for 2D DP
- Use variables for 1D DP when possible

### Common Mistakes:
- Not defining base cases correctly
- Off-by-one errors in DP array
- Not considering space optimization
- Incorrect recurrence relation

---

Generated: Interview Prep Package - Dynamic Programming Folder
