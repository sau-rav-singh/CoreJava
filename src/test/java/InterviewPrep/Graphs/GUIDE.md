# Graph Problems - Interview Prep Guide

## Overview
This folder contains **12 problems** focused on graph algorithms, covering DFS, BFS, topological sort, and advanced graph techniques.

## Problem Categories

### 1. **Graph Traversal & Connectivity** (3 problems)
- `NumberOfIslands.java` - Count islands in grid (DFS/BFS flood fill)
- `CloneGraph.java` - Deep copy graph structure
- `ValidGraphPath.java` - Check if valid path exists in graph

**Techniques**: DFS, BFS, visited tracking
**Time Complexity**: O(V + E), **Space Complexity**: O(V + E)

### 2. **Cycle Detection & Topological Sort** (2 problems)
- `CourseSchedule.java` - Detect cycle in directed graph
- `CourseScheduleII.java` - Get topological order if no cycle

**Applications**: Course prerequisites, dependency resolution
**Interview Frequency**: Very Common

### 3. **Shortest Path Problems** (2 problems)
- `WordLadder.java` - Shortest path between words
- `NetworkDelayTime.java` - Time for signal to reach all nodes (Dijkstra)

**Techniques**: BFS for unweighted, Dijkstra for weighted

### 4. **Grid-Based Graph Problems** (2 problems)
- `SurroundedRegions.java` - Mark O's surrounded by X's
- `PacificAtlanticWaterFlow.java` - Cells where water flows to both oceans

**Technique**: Reverse DFS from borders

### 5. **Advanced Graph Algorithms** (3 problems)
- `AccountsMerge.java` - Merge accounts with common emails (Union-Find)
- `CheapestFlightsWithinKStops.java` - Shortest path with edge constraint
- `CriticalConnections.java` - Find bridges in graph (Tarjan)
- `AlienDictionary.java` - Order characters from alien dictionary

**Interview Frequency**: Important

---

## Key Techniques to Master

### 1. **DFS Pattern**
```java
void dfs(Node node, Set<Node> visited) {
    if (node == null || visited.contains(node)) return;
    visited.add(node);
    for (Node neighbor : node.neighbors) {
        dfs(neighbor, visited);
    }
}
```
**Use Case**: Connectivity, cycle detection, path finding
**Time**: O(V + E), **Space**: O(V)

### 2. **BFS Pattern**
```java
Queue<Node> queue = new LinkedList<>();
queue.offer(start);
visited.add(start);
while (!queue.isEmpty()) {
    Node current = queue.poll();
    for (Node neighbor : current.neighbors) {
        if (!visited.contains(neighbor)) {
            visited.add(neighbor);
            queue.offer(neighbor);
        }
    }
}
```
**Use Case**: Shortest path, level-order traversal
**Time**: O(V + E), **Space**: O(V)

### 3. **Topological Sort (Kahn's Algorithm)**
```java
int[] inDegree = new int[n];
Queue<Integer> queue = new LinkedList<>();
for (int i = 0; i < n; i++) {
    if (inDegree[i] == 0) queue.offer(i);
}
while (!queue.isEmpty()) {
    int node = queue.poll();
    for (int neighbor : graph.get(node)) {
        inDegree[neighbor]--;
        if (inDegree[neighbor] == 0) queue.offer(neighbor);
    }
}
```
**Use Case**: Course scheduling, dependency resolution
**Time**: O(V + E), **Space**: O(V)

### 4. **Union-Find (Disjoint Set)**
```java
int find(int x) {
    if (parent[x] != x) parent[x] = find(parent[x]);
    return parent[x];
}
void union(int x, int y) {
    int rootX = find(x), rootY = find(y);
    if (rootX != rootY) parent[rootX] = rootY;
}
```
**Use Case**: Connected components, account merging
**Time**: O(α(V)) almost constant, **Space**: O(V)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `NumberOfIslands.java` - **MOST IMPORTANT** - Grid DFS/BFS
- [ ] `ValidGraphPath.java` - Basic path finding
- [ ] `CloneGraph.java` - Graph copying

### Medium Level
- [ ] `CourseSchedule.java` - **MOST IMPORTANT** - Cycle detection
- [ ] `CourseScheduleII.java` - Topological sort
- [ ] `SurroundedRegions.java` - Grid DFS from borders
- [ ] `PacificAtlanticWaterFlow.java` - Reverse DFS
- [ ] `WordLadder.java` - BFS with word transformations
- [ ] `NetworkDelayTime.java` - Dijkstra's algorithm

### Hard Level
- [ ] `AccountsMerge.java` - Union-Find
- [ ] `CheapestFlightsWithinKStops.java` - Modified Dijkstra
- [ ] `CriticalConnections.java` - Tarjan's algorithm
- [ ] `AlienDictionary.java` - Graph + topological sort

---

## Common Interview Questions

### 1. Number of Islands
**Problem**: Count islands in 2D grid
**Solution**: DFS/BFS flood fill, mark visited cells
**See**: `NumberOfIslands.java`

### 2. Course Schedule
**Problem**: Detect if course completion is possible
**Key Insight**: Cycle detection in directed graph
**See**: `CourseSchedule.java`

### 3. Clone Graph
**Problem**: Deep copy graph with random pointers
**Strategy**: DFS/BFS with visited map
**See**: `CloneGraph.java`

### 4. Word Ladder
**Problem**: Shortest path between words with one-letter changes
**Technique**: BFS treating word transformations as edges
**See**: `WordLadder.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Number of Islands | O(m*n) | O(m*n) | DFS/BFS |
| Clone Graph | O(V+E) | O(V) | DFS + Map |
| Course Schedule | O(V+E) | O(V) | DFS Coloring |
| Course Schedule II | O(V+E) | O(V) | Kahn's Algorithm |
| Word Ladder | O(N*L²) | O(N) | BFS |
| Surrounded Regions | O(m*n) | O(m*n) | DFS from borders |
| Pacific Atlantic | O(m*n) | O(m*n) | Reverse DFS |
| Accounts Merge | O(N*α(N)) | O(N) | Union-Find |
| Network Delay | O((V+E)log V) | O(V+E) | Dijkstra |
| Cheapest Flights | O(V²E) | O(V) | Modified Dijkstra |
| Critical Connections | O(V+E) | O(V) | Tarjan's |
| Alien Dictionary | O(N) | O(1) | Topological Sort |

*V = vertices, E = edges, N = total elements, L = word length*

---

## Related Files

**Trees folder:**
- Tree is a special case of graph
- Similar DFS/BFS patterns

**Backtracking folder:**
- Graph traversal with backtracking

---

## Code Patterns to Remember

### Pattern 1: Grid DFS
```java
void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != target) return;
    grid[i][j] = visited;
    dfs(grid, i+1, j); dfs(grid, i-1, j);
    dfs(grid, i, j+1); dfs(grid, i, j-1);
}
```

### Pattern 2: BFS for Shortest Path
```java
Queue<T> queue = new LinkedList<>();
queue.offer(start);
int distance = 0;
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        T current = queue.poll();
        if (current == target) return distance;
        for (T neighbor : getNeighbors(current)) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                queue.offer(neighbor);
            }
        }
    }
    distance++;
}
```

### Pattern 3: Cycle Detection
```java
boolean hasCycle(int node, int[] visited) {
    if (visited[node] == 1) return true; // Cycle
    if (visited[node] == 2) return false; // Processed
    visited[node] = 1; // Visiting
    for (int neighbor : graph[node]) {
        if (hasCycle(neighbor, visited)) return true;
    }
    visited[node] = 2; // Processed
    return false;
}
```

---

## Practice Tips

### When to use DFS vs BFS:
- **DFS**: Simpler, uses less memory, good for connectivity
- **BFS**: Guaranteed shortest path in unweighted graphs
- **Interview**: Know both, explain tradeoffs

### Graph Representation:
- **Adjacency List**: O(V + E) space, efficient for sparse graphs
- **Adjacency Matrix**: O(V²) space, efficient for dense graphs
- **Default**: Use adjacency list unless specified

### Common Mistakes:
- Not handling disconnected graphs
- Forgetting to mark nodes as visited
- Incorrect cycle detection in directed vs undirected graphs
- Not considering graph representation choice

---

Generated: Interview Prep Package - Graphs Folder
