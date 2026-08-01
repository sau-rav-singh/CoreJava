# Heaps / Priority Queue Problems - Interview Prep Guide

## Overview
This folder contains **7 problems** focused on heap data structure applications, covering priority queue patterns and optimizations.

## Problem Categories

### 1. **K-Element Problems** (2 problems)
- `KLargestElements.java` - Find K largest elements
- `TopKFrequentElements.java` - Find K most frequent elements

**Technique**: Min heap of size K
**Time Complexity**: O(n log k), **Space Complexity**: O(k)

### 2. **Merge Problems** (1 problem)
- `MergeKSortedLists.java` - Merge K sorted linked lists

**Technique**: Min heap with linked list nodes
**Interview Frequency**: Very Common

### 3. **Median & Statistics** (1 problem)
- `FindMedianFromDataStream.java` - Find median while adding numbers

**Technique**: Two heaps (max and min)
**Time Complexity**: O(log n) per operation

### 4. **Scheduling Problems** (2 problems)
- `MeetingRoomsII.java` - Minimum rooms needed for meetings
- `TaskScheduler.java` - Minimum time with cooldown

**Technique**: Heap or sorting with sweep line

### 5. **Sliding Window** (1 problem)
- `SlidingWindowMaximum.java` - Find max in each sliding window

**Technique**: Deque heap
**Interview Frequency**: Important

---

## Key Techniques to Master

### 1. **Min Heap for K Elements**
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) {
        minHeap.poll(); // Remove smallest
    }
}
```
**Use Case**: K largest/smallest elements
**Time**: O(n log k), **Space**: O(k)

### 2. **Two Heaps for Median**
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Left half
PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Right half
// Balance sizes and maintain max(left) <= min(right)
```
**Use Case**: Median from data stream
**Time**: O(log n) per operation, **Space**: O(n)

### 3. **Heap for Merging**
```java
PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
for (ListNode list : lists) {
    if (list != null) minHeap.offer(list);
}
while (!minHeap.isEmpty()) {
    ListNode node = minHeap.poll();
    // Process node
    if (node.next != null) minHeap.offer(node.next);
}
```
**Use Case**: Merging sorted lists
**Time**: O(n log k), **Space**: O(k)

### 4. **Heap for Scheduling**
```java
PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
// Sort by start time, use heap for end times
while (!maxHeap.isEmpty() && maxHeap.peek()[1] <= current[0]) {
    maxHeap.poll(); // Free up resource
}
maxHeap.offer(current);
```
**Use Case**: Meeting rooms, task scheduling
**Time**: O(n log n), **Space**: O(n)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `KLargestElements.java` - Basic heap usage
- [ ] `TopKFrequentElements.java` - Frequency + heap

### Medium Level
- [ ] `MergeKSortedLists.java` - **MOST IMPORTANT**
- [ ] `FindMedianFromDataStream.java` - Two heaps pattern
- [ ] `MeetingRoomsII.java` - Scheduling with heap
- [ ] `TaskScheduler.java` - Greedy + heap

### Hard Level
- [ ] `SlidingWindowMaximum.java` - Deque heap

---

## Common Interview Questions

### 1. K Largest Elements
**Problem**: Find K largest elements in array
**Solution**: Min heap of size K
**See**: `KLargestElements.java`

### 2. Merge K Sorted Lists
**Problem**: Merge multiple sorted linked lists
**Key Insight**: Use min heap to always get smallest element
**See**: `MergeKSortedLists.java`

### 3. Median from Data Stream
**Problem**: Find median while adding numbers
**Strategy**: Two heaps - max heap for lower half, min heap for upper half
**See**: `FindMedianFromDataStream.java`

### 4. Meeting Rooms II
**Problem**: Minimum rooms for meetings
**Technique**: Sort by start time, use heap for end times
**See**: `MeetingRoomsII.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|---------|-------|-----------|
| K Largest | O(n log k) | O(k) | Min heap |
| Top K Frequent | O(n log k) | O(n) | Frequency + heap |
| Merge K Lists | O(n log k) | O(k) | Min heap |
| Find Median | O(log n) | O(n) | Two heaps |
| Meeting Rooms II | O(n log n) | O(n) | Heap |
| Task Scheduler | O(n log n) | O(n) | Greedy + heap |
| Sliding Window Max | O(n) | O(k) | Deque heap |

*n = total elements, k = K value*

---

## Related Files

**Array folder:**
- Similar selection problems

**Sorting folder:**
- Heap sort concepts

---

## Code Patterns to Remember

### Pattern 1: K Elements with Min Heap
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) minHeap.poll();
}
```

### Pattern 2: Two Heaps for Median
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
// Balance: maxHeap.size() == minHeap.size() or maxHeap.size() == minHeap.size() + 1
```

### Pattern 3: Merge with Heap
```java
PriorityQueue<Node> heap = new PriorityQueue<>(comparator);
for (Node node : nodes) heap.offer(node);
while (!heap.isEmpty()) {
    Node current = heap.poll();
    result.add(current);
    if (current.next != null) heap.offer(current.next);
}
```

---

## Practice Tips

### When to use Heap:
- **K elements**: When you need top/bottom K elements
- **Merging**: When merging sorted sequences
- **Median**: When need median from streaming data
- **Scheduling**: When optimizing resource allocation

### Min Heap vs Max Heap:
- **Min heap**: For K largest elements (removes smallest)
- **Max heap**: For K smallest elements (removes largest)
- **Default**: Java PriorityQueue is min heap

### Common Mistakes:
- Using wrong heap type (min vs max)
- Not handling empty heap cases
- Inefficient heap operations (O(n) instead of O(log n))
- Not considering space optimization

---

Generated: Interview Prep Package - Heaps Folder
