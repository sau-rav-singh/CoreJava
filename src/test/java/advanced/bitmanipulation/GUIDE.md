# Bit Manipulation Problems - Interview Prep Guide

## Overview
This folder contains **6 problems** focused on bit manipulation techniques, covering XOR operations, bit counting, and bitwise algorithms.

## Problem Categories

### 1. **XOR-Based Problems** (2 problems)
- `SingleNumber.java` - Find single number appearing once
- `SingleNumberIII.java` - Find two numbers appearing once

**Technique**: XOR properties (a ^ a = 0, a ^ 0 = a)
**Time Complexity**: O(n), **Space Complexity**: O(1)

### 2. **Power of Two Problems** (1 problem)
- `PowerOfTwo.java` - Check if number is power of 2

**Technique**: n & (n-1) == 0
**Interview Frequency**: Very Common

### 3. **Bit Counting Problems** (2 problems)
- `NumberOf1Bits.java` - Count number of 1 bits (Hamming weight)
- `HammingDistance.java` - Count differing bits between two numbers

**Techniques**: Bit manipulation, Brian Kernighan's algorithm

### 4. **Bit Reversal** (1 problem)
- `ReverseBits.java` - Reverse bits of 32-bit integer

**Interview Frequency**: Medium

---

## Key Techniques to Master

### 1. **XOR Properties**
```java
// Find single number
int result = 0;
for (int num : nums) {
    result ^= num; // a ^ a = 0, a ^ 0 = a
}
```
**Use Case**: Finding unique elements
**Time**: O(n), **Space**: O(1)

### 2. **Power of Two Check**
```java
boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    return (n & (n - 1)) == 0; // Only one bit set
}
```
**Use Case**: Power of two validation
**Time**: O(1), **Space**: O(1)

### 3. **Count Set Bits**
```java
int countBits(int n) {
    int count = 0;
    while (n != 0) {
        count += n & 1;
        n >>>= 1; // Unsigned right shift
    }
    return count;
}
```
**Use Case**: Hamming weight, bit counting
**Time**: O(1) - at most 32 iterations, **Space**: O(1)

### 4. **Brian Kernighan's Algorithm**
```java
int countBitsOptimized(int n) {
    int count = 0;
    while (n != 0) {
        n &= (n - 1); // Clear least significant set bit
        count++;
    }
    return count;
}
```
**Use Case**: Faster bit counting
**Time**: O(number of set bits), **Space**: O(1)

### 5. **Bit Grouping for Two Unique Numbers**
```java
int rightmostBit = xor & (-xor);
int num1 = 0, num2 = 0;
for (int num : nums) {
    if ((num & rightmostBit) == 0) {
        num1 ^= num;
    } else {
        num2 ^= num;
    }
}
```
**Use Case**: Find two unique numbers
**Time**: O(n), **Space**: O(1)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `SingleNumber.java` - **MOST IMPORTANT** - XOR basics
- [ ] `PowerOfTwo.java` - Bit property
- [ ] `NumberOf1Bits.java` - Bit counting
- [ ] `HammingDistance.java` - XOR + counting

### Medium Level
- [ ] `ReverseBits.java` - Bit manipulation
- [ ] `SingleNumberIII.java` - Bit grouping

### Hard Level
- (None in this package)

---

## Common Interview Questions

### 1. Single Number
**Problem**: Find number appearing once when others appear twice
**Solution**: XOR all numbers together
**See**: `SingleNumber.java`

### 2. Power of Two
**Problem**: Check if number is power of 2
**Key Insight**: Power of two has exactly one bit set
**See**: `PowerOfTwo.java`

### 3. Hamming Distance
**Problem**: Count differing bits between two numbers
**Strategy**: XOR then count set bits
**See**: `HammingDistance.java`

### 4. Reverse Bits
**Problem**: Reverse bits of 32-bit integer
**Technique**: Shift and build result
**See**: `ReverseBits.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Single Number | O(n) | O(1) | XOR |
| Power of Two | O(1) | O(1) | Bit property |
| Number of 1 Bits | O(1) | O(1) | Bit counting |
| Hamming Distance | O(1) | O(1) | XOR + counting |
| Reverse Bits | O(1) | O(1) | Bit manipulation |
| Single Number III | O(n) | O(1) | Bit grouping |

*n = array length*

---

## Related Files

**Array folder:**
- Similar XOR applications

**Math folder:**
- Related mathematical operations

---

## Code Patterns to Remember

### Pattern 1: XOR for Unique Elements
```java
int result = 0;
for (int num : nums) {
    result ^= num;
}
return result;
```

### Pattern 2: Power of Two Check
```java
boolean isPowerOfTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

### Pattern 3: Count Set Bits
```java
int count = 0;
while (n != 0) {
    count += n & 1;
    n >>>= 1;
}
return count;
```

### Pattern 4: Brian Kernighan's Algorithm
```java
int count = 0;
while (n != 0) {
    n &= (n - 1);
    count++;
}
return count;
```

---

## Practice Tips

### Common Bit Operations:
- **AND (&)**: Check if bit is set, clear bits
- **OR (|)**: Set bits
- **XOR (^)**: Toggle bits, find unique elements
- **NOT (~)**: Complement bits
- **Shift (<<, >>, >>>)**: Move bits

### Bit Manipulation Tricks:
- **n & (n-1)**: Clear least significant set bit
- **n & (-n)**: Get least significant set bit
- **n | (n+1)**: Set least significant 0 bit
- **n & (n+1)**: Clear least significant 1 bit

### Common Mistakes:
- Using signed shift instead of unsigned
- Forgetting to handle negative numbers
- Off-by-one errors in bit positions
- Not considering integer overflow

---

Generated: Interview Prep Package - BitManipulation Folder
