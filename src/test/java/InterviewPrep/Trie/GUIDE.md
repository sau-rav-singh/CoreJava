# Trie Problems - Interview Prep Guide

## Overview
This folder contains **4 problems** focused on Trie (prefix tree) data structure, covering string operations, prefix searches, and word dictionary applications.

## Problem Categories

### 1. **Trie Implementation** (1 problem)
- `ImplementTrie.java` - Design Trie data structure

**Operations**: insert, search, startsWith
**Time Complexity**: O(L) per operation, **Space Complexity**: O(N*L)

### 2. **Word Dictionary Problems** (2 problems)
- `WordBreak.java` - Check if word can be segmented
- `LongestWordInDictionary.java` - Find longest word from dictionary

**Techniques**: Trie + DP, Trie + DFS
**Interview Frequency**: Important

### 3. **Grid + Trie** (1 problem)
- `WordSearchII.java` - Find multiple words in grid

**Technique**: Trie + DFS with backtracking
**Interview Frequency**: Medium

---

## Key Techniques to Master

### 1. **Trie Node Structure**
```java
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;
    String word; // Optional: store complete word
    
    public TrieNode() {
        children = new TrieNode[26]; // For lowercase English
        isEndOfWord = false;
    }
}
```
**Use Case**: Basic Trie implementation
**Time**: O(L) per operation, **Space**: O(N*L)

### 2. **Trie Insert Operation**
```java
void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        int index = c - 'a';
        if (node.children[index] == null) {
            node.children[index] = new TrieNode();
        }
        node = node.children[index];
    }
    node.isEndOfWord = true;
}
```
**Use Case**: Adding words to Trie
**Time**: O(L), **Space**: O(L)

### 3. **Trie Search Operation**
```java
boolean search(String word) {
    TrieNode node = searchPrefix(word);
    return node != null && node.isEndOfWord;
}

boolean startsWith(String prefix) {
    return searchPrefix(prefix) != null;
}

TrieNode searchPrefix(String prefix) {
    TrieNode node = root;
    for (char c : prefix.toCharArray()) {
        int index = c - 'a';
        if (node.children[index] == null) return null;
        node = node.children[index];
    }
    return node;
}
```
**Use Case**: Searching words and prefixes
**Time**: O(L), **Space**: O(1)

### 4. **Trie + DFS for Word Search**
```java
void dfs(char[][] board, int i, int j, TrieNode node, Set<String> result) {
    char c = board[i][j];
    if (c == '#' || node.children[c - 'a'] == null) return;
    
    node = node.children[c - 'a'];
    if (node.word != null) result.add(node.word);
    
    board[i][j] = '#'; // Mark visited
    dfs(board, i+1, j, node, result);
    dfs(board, i-1, j, node, result);
    dfs(board, i, j+1, node, result);
    dfs(board, i, j-1, node, result);
    board[i][j] = c; // Restore
}
```
**Use Case**: Finding multiple words in grid
**Time**: O(m*n*4^L), **Space**: O(N*L)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `ImplementTrie.java` - **MOST IMPORTANT** - Basic Trie

### Medium Level
- [ ] `WordBreak.java` - Trie + DP
- [ ] `LongestWordInDictionary.java` - Trie + DFS

### Hard Level
- [ ] `WordSearchII.java` - Trie + grid DFS

---

## Common Interview Questions

### 1. Implement Trie
**Problem**: Design Trie with insert, search, startsWith
**Solution**: Array-based Trie nodes with end marker
**See**: `ImplementTrie.java`

### 2. Word Break
**Problem**: Check if word can be segmented into dictionary words
**Key Insight**: DP with Trie for efficient prefix checking
**See**: `WordBreak.java`

### 3. Longest Word in Dictionary
**Problem**: Find longest word that can be built one character at a time
**Strategy**: Trie + DFS with word building validation
**See**: `LongestWordInDictionary.java`

### 4. Word Search II
**Problem**: Find multiple words in grid
**Technique**: Build Trie from words, DFS with backtracking
**See**: `WordSearchII.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Implement Trie | O(L) | O(N*L) | Trie operations |
| Word Break | O(n²) | O(n) | DP + Trie |
| Longest Word | O(N*L) | O(N*L) | Trie + DFS |
| Word Search II | O(m*n*4^L) | O(N*L) | Trie + grid DFS |

*L = word length, N = number of words, n = string length, m*n = grid size*

---

## Related Files

**String folder:**
- String manipulation techniques

**Backtracking folder:**
- DFS patterns for grid problems

---

## Code Patterns to Remember

### Pattern 1: Trie Insert
```java
void insert(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        int index = c - 'a';
        if (node.children[index] == null) {
            node.children[index] = new TrieNode();
        }
        node = node.children[index];
    }
    node.isEndOfWord = true;
}
```

### Pattern 2: Trie Search
```java
boolean search(String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        int index = c - 'a';
        if (node.children[index] == null) return false;
        node = node.children[index];
    }
    return node.isEndOfWord;
}
```

### Pattern 3: Trie + DFS
```java
void dfs(int i, int j, TrieNode node) {
    char c = board[i][j];
    if (node.children[c - 'a'] == null) return;
    node = node.children[c - 'a'];
    if (node.word != null) result.add(node.word);
    // Visit neighbors
}
```

---

## Practice Tips

### When to use Trie:
- **Prefix searches**: Words with common prefixes
- **Dictionary operations**: Efficient word lookup
- **Autocomplete**: Suggest completions
- **Word validation**: Check word existence

### Trie vs HashMap:
- **Trie**: Better for prefix operations, space-efficient for common prefixes
- **HashMap**: Simpler, faster for exact word lookup
- **Decision**: Use Trie when prefix operations are needed

### Trie Optimizations:
- **Array vs HashMap**: Array for fixed alphabet, HashMap for dynamic
- **Compression**: Compress single-child nodes
- **Memory**: Use arrays for small alphabets, HashMap for large

### Common Mistakes:
- Not handling case sensitivity
- Incorrect character to index mapping
- Memory inefficiency with sparse tries
- Not pruning during DFS for word search

---

Generated: Interview Prep Package - Trie Folder
