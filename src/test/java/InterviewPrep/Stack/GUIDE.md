# Stack Problems - Interview Prep Guide

## Overview
This folder contains **8 problems** focused on stack data structure applications, covering fundamental to advanced techniques.

## Problem Categories

### 1. **Basic Stack Operations** (2 problems)
- `ValidBrackets.java` - Check if parentheses/brackets/braces are balanced
- `MinStack.java` - Stack that returns minimum element in O(1)

**Time Complexity**: O(n) for ValidBrackets, O(1) for MinStack operations
**Space Complexity**: O(n)

### 2. **Monotonic Stack Problems** (3 problems)
- `DailyTemperatures.java` - Find next warmer temperature for each day
- `NextGreaterElement.java` - Find next greater element (circular array)
- `LargestRectangleInHistogram.java` - Find largest rectangular area in histogram

**Technique**: Maintain stack in increasing/decreasing order
**Interview Frequency**: Very Common

### 3. **Expression Evaluation** (2 problems)
- `EvaluateRPN.java` - Evaluate Reverse Polish Notation expressions
- `DecodeString.java` - Decode strings with nested number patterns

**Applications**: Calculator implementations, string parsing

### 4. **Greedy + Stack** (1 problem)
- `RemoveKDigits.java` - Remove K digits to get smallest number

**Technique**: Use stack to maintain monotonic property

---

## Key Techniques to Master

### 1. **Monotonic Stack Pattern**
```java
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < n; i++) {
    while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
        // Process previous elements
        stack.pop();
    }
    stack.push(i);
}
```
**Use Case**: Next greater/smaller element, histogram problems
**Time**: O(n), **Space**: O(n)

### 2. **Stack for Expression Parsing**
```java
Stack<Character> stack = new Stack<>();
for (char c : expression.toCharArray()) {
    if (isOperator(c)) {
        // Process operators
    } else {
        stack.push(c);
    }
}
```
**Use Case**: RPN evaluation, string decoding
**Time**: O(n), **Space**: O(n)

### 3. **Auxiliary Stack for Tracking**
```java
Stack<Integer> mainStack = new Stack<>();
Stack<Integer> minStack = new Stack<>();
// Track minimums alongside main operations
```
**Use Case**: MinStack, tracking additional properties
**Time**: O(1) per operation, **Space**: O(n)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `ValidBrackets.java` - Basic stack usage
- [ ] `MinStack.java` - Auxiliary stack pattern
- [ ] `ImplementStackUsingQueue.java` - Data structure design

### Medium Level
- [ ] `DailyTemperatures.java` - Monotonic stack
- [ ] `EvaluateRPN.java` - Expression evaluation
- [ ] `DecodeString.java` - Nested pattern handling
- [ ] `NextGreaterElement.java` - Circular array variant

### Hard Level
- [ ] `LargestRectangleInHistogram.java` - Complex monotonic stack
- [ ] `RemoveKDigits.java` - Greedy + stack

---

## Common Interview Questions

### 1. Check for Balanced Parentheses
**Problem**: Determine if string has balanced brackets
**Solution**: Use stack to match opening/closing pairs
**See**: `ValidBrackets.java`

### 2. Find Next Greater Element
**Problem**: For each element, find next greater element
**Key Insight**: Use monotonic decreasing stack
**See**: `NextGreaterElement.java`

### 3. Evaluate Mathematical Expressions
**Problem**: Evaluate expressions in RPN format
**Strategy**: Stack for operands, pop for operations
**See**: `EvaluateRPN.java`

### 4. Largest Rectangle in Histogram
**Problem**: Find maximum rectangular area
**Technique**: Stack to maintain increasing heights
**See**: `LargestRectangleInHistogram.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Valid Brackets | O(n) | O(n) | Simple stack |
| Min Stack | O(1) | O(n) | Auxiliary stack |
| Daily Temperatures | O(n) | O(n) | Monotonic stack |
| Largest Rectangle | O(n) | O(n) | Monotonic stack |
| Evaluate RPN | O(n) | O(n) | Expression parsing |
| Decode String | O(n) | O(n) | Nested stack |
| Next Greater | O(n) | O(n) | Monotonic stack |
| Remove K Digits | O(n) | O(n) | Greedy + stack |

---

## Related Files

**Array folder:**
- Similar two-pointer techniques in some problems

**Graphs folder:**
- Stack-based DFS implementations

---

## Code Patterns to Remember

### Pattern 1: Monotonic Stack
```java
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < n; i++) {
    while (!stack.isEmpty() && condition) {
        process(stack.pop());
    }
    stack.push(i);
}
```

### Pattern 2: Expression Evaluation
```java
Stack<Integer> stack = new Stack<>();
for (String token : tokens) {
    if (isOperator(token)) {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(apply(a, b, token));
    } else {
        stack.push(Integer.parseInt(token));
    }
}
```

### Pattern 3: Nested Structure Handling
```java
Stack<Integer> countStack = new Stack<>();
Stack<StringBuilder> stringStack = new Stack<>();
// Handle nested patterns by maintaining separate stacks
```

---

## Practice Tips

### When to use Stack:
- **LIFO order**: When you need to process in reverse order
- **Nested structures**: Parentheses, brackets, nested expressions
- **Monotonic sequences**: Finding next greater/smaller elements
- **Backtracking**: When you need to undo operations

### Interview Strategy:
1. Start with simple stack operations
2. Identify if problem needs monotonic property
3. Consider space-time tradeoffs
4. Handle edge cases (empty stack, single element)

### Common Mistakes:
- Forgetting to check if stack is empty before peek/pop
- Not handling circular arrays correctly
- Inefficient nested loops instead of monotonic stack
- Not considering stack overflow for large inputs

---

Generated: Interview Prep Package - Stack Folder
