# LinkedList Problems - Interview Prep Guide

## Overview
This folder contains **9 problems** focused on linked list data structures, covering basic operations, advanced manipulations, and algorithmic patterns.

## Problem Categories

### 1. **Basic Operations** (2 problems)
- `ReverseLinkedList.java` - Reverse the entire linked list
- `PalindromeLinkedList.java` - Check if linked list is palindrome

**Techniques**: Iterative and recursive approaches
**Time Complexity**: O(n), **Space Complexity**: O(1) or O(n)

### 2. **Node Manipulation** (3 problems)
- `RemoveNthFromEnd.java` - Remove nth node from end of list
- `ReorderList.java` - Reorder list to L1-Ln-L2-Ln-1 pattern
- `OddEvenLinkedList.java` - Group odd-indexed and even-indexed nodes

**Interview Frequency**: Very Common

### 3. **advanced Operations** (2 problems)
- `MergeSortedLists.java` - Merge two sorted linked lists
- `SinglyLinkedListImplementation.java` - Custom linked list implementation
- `DeleteAllOccurrences.java` - Delete all occurrences of a value

**Applications**: Merging, sorting, data structure design

---

## Key Techniques to Master

### 1. **Two-Pointer Technique**
```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
// slow is now at middle
```
**Use Case**: Finding middle, cycle detection
**Time**: O(n), **Space**: O(1)

### 2. **Dummy Node Pattern**
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode current = dummy;
// Process and return dummy.next
```
**Use Case**: When head might change
**Time**: O(n), **Space**: O(1)

### 3. **Reverse Linked List**
```java
ListNode prev = null, current = head;
while (current != null) {
    ListNode next = current.next;
    current.next = prev;
    prev = current;
    current = next;
}
return prev;
```
**Use Case**: Reversing portions of list
**Time**: O(n), **Space**: O(1)

### 4. **Gap Technique for Nth from End**
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode fast = dummy, slow = dummy;
for (int i = 0; i <= n; i++) fast = fast.next;
while (fast != null) {
    slow = slow.next;
    fast = fast.next;
}
slow.next = slow.next.next;
return dummy.next;
```
**Use Case**: Remove nth from end
**Time**: O(n), **Space**: O(1)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `ReverseLinkedList.java` - **MOST IMPORTANT** - Basic reversal
- [ ] `PalindromeLinkedList.java` - Two-pointer + reverse

### Medium Level
- [ ] `RemoveNthFromEnd.java` - Gap technique
- [ ] `ReorderList.java` - Find middle + reverse + merge
- [ ] `OddEvenLinkedList.java` - Separate and merge
- [ ] `MergeSortedLists.java` - Two-pointer merge

### Hard Level
- [ ] `CustomLinkedList.java` - Implementation details

---

## Common Interview Questions

### 1. Reverse Linked List
**Problem**: Reverse the entire linked list
**Solution**: Iterative with prev/current/next pointers
**See**: `ReverseLinkedList.java`

### 2. Remove Nth Node from End
**Problem**: Remove nth node from end of list
**Key Insight**: Use two pointers with gap of n
**See**: `RemoveNthFromEnd.java`

### 3. Palindrome Linked List
**Problem**: Check if linked list is palindrome
**Strategy**: Find middle, reverse second half, compare
**See**: `PalindromeLinkedList.java`

### 4. Merge Sorted Lists
**Problem**: Merge two sorted linked lists
**Technique**: Two-pointer comparison
**See**: `MergeSortedLists.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Reverse List | O(n) | O(1) | Iterative |
| Palindrome Check | O(n) | O(1) | Two-pointer + reverse |
| Remove Nth from End | O(n) | O(1) | Gap technique |
| Reorder List | O(n) | O(1) | Middle + reverse + merge |
| Merge Sorted Lists | O(n) | O(1) | Two-pointer |
| Odd Even List | O(n) | O(1) | Separate + merge |

*n = length of linked list*

---

## Related Files

**Array folder:**
- Similar two-pointer techniques

**Trees folder:**
- Tree is a special case of linked list

---

## Code Patterns to Remember

### Pattern 1: Reverse Linked List
```java
ListNode reverse(ListNode head) {
    ListNode prev = null, current = head;
    while (current != null) {
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}
```

### Pattern 2: Two-Pointer for Middle
```java
ListNode findMiddle(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```

### Pattern 3: Dummy Node for Head Changes
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode current = dummy;
// Process list
return dummy.next;
```

---

## Practice Tips

### When to use Iterative vs Recursive:
- **Iterative**: O(1) space, preferred in interviews
- **Recursive**: Simpler code, O(n) space for call stack
- **Interview**: Know both, explain tradeoffs

### Common LinkedList Patterns:
- **Two-pointer**: Middle detection, cycle detection
- **Dummy node**: When head might change
- **Reverse**: Often needed for palindrome, reorder problems
- **Gap**: For nth from end problems

### Common Mistakes:
- Not handling null/empty list cases
- Losing reference to nodes during reversal
- Off-by-one errors in pointer manipulation
- Not using dummy node when head changes

---

Generated: Interview Prep Package - LinkedList Folder
