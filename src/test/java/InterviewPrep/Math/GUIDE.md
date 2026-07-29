# Math Problems - Interview Prep Guide

## Overview
This folder contains **10 problems** focused on mathematical algorithms and number theory problems.

## Problem Categories

### 1. **Fibonacci & Series** (2 problems)
- `FibonacciSeries.java` - Generate Fibonacci sequence
- `ClimbingStairs.java` - DP variation of Fibonacci

**Concepts**:
- Recursive approach: O(2^n) time
- Memoization: O(n) time, O(n) space
- Iterative: O(n) time, O(1) space
- Matrix exponentiation: O(log n) time

### 2. **Factorials & Permutations** (1 problem)
- `Factorial.java` - Calculate factorial

**Approaches**:
- Recursive: Simple but can overflow for large n
- Iterative: Better for large numbers
- BigInteger: For very large factorials

### 3. **Number Classification** (3 problems)
- `ArmstrongNumbers.java` - Check if Armstrong number (narcissistic)
  - Example: 153 = 1³ + 5³ + 3³
- `PrimeNumber.java` - Check if prime
  - Optimization: Check only up to √n
- `LeapYear.java` - Determine if leap year

**Time Complexity**:
- Prime check: O(√n)
- Armstrong: O(log n) for digit count
- Leap year: O(1)

### 4. **Number Operations** (3 problems)
- `AddBinary.java` - Binary addition
- `IntegerReverse.java` - Reverse integer digits
- `PlusOne.java` - Add 1 to number array

**Techniques**:
- Bit manipulation for binary operations
- Modulo/division for digit operations
- Array manipulation for number representation

### 5. **Advanced Math** (2 problems)
- `SquareRoot.java` - Calculate square root (Newton's method, binary search)
- `CoinChangeMinimum.java` - Minimum coins for amount (DP/Greedy)

---

## Key Algorithms to Master

### 1. **Fibonacci Sequence**
**Problem**: Generate or find Nth Fibonacci number

**Approaches**:
```
1. Recursive (Naive): O(2^n) - AVOID
2. Memoization: O(n) time, O(n) space
3. Iterative: O(n) time, O(1) space ← BEST
4. Matrix: O(log n) time - ADVANCED
```

**See**: `FibonacciSeries.java`, `ClimbingStairs.java`

### 2. **Prime Number Check**
**Optimization**: Only check divisors up to √n
```java
boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}
```
**Time**: O(√n)

### 3. **Armstrong Number (Narcissistic)**
Check if sum of digits each raised to power of digit count equals number
```java
// 153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
```
**See**: `ArmstrongNumbers.java`

### 4. **Square Root Calculation**
Three approaches:
- **Binary Search**: O(log n)
- **Newton's Method**: O(log n), faster convergence
- **Built-in**: Math.sqrt() - O(1)

### 5. **Digit Manipulation**
```java
// Reverse: 12345 → 54321
// Add one to array: [1,2,3] → [1,2,4]
// Check leading zeros
```

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `Factorial.java` - Basic factorial
- [ ] `PrimeNumber.java` - Prime checking
- [ ] `LeapYear.java` - Simple logic
- [ ] `IntegerReverse.java` - Digit manipulation
- [ ] `AddBinary.java` - String conversion

### Medium Level
- [ ] `FibonacciSeries.java` - Optimization techniques
- [ ] `SquareRoot.java` - Binary search variant
- [ ] `PlusOne.java` - Array manipulation
- [ ] `ArmstrongNumbers.java` - Digit extraction

### Hard Level
- [ ] `ClimbingStairs.java` - DP optimization
- [ ] `CoinChangeMinimum.java` - DP/Greedy analysis
- [ ] Multiple Fibonacci approaches - Compare implementations

---

## Common Interview Questions

### 1. Fibonacci Number
**Problem**: Find Nth Fibonacci number efficiently
**Solutions**:
```
Approach 1: Iterative (BEST for interviews)
- Time: O(n), Space: O(1)

Approach 2: Memoization
- Time: O(n), Space: O(n)

Approach 3: Matrix Exponentiation (Advanced)
- Time: O(log n), Space: O(1)
```
**Follow-up**: "How would you handle very large n?"

### 2. Prime Number Validation
**Problem**: Check if number is prime
**Optimization**: Check only up to √n
**Why**: If n = a × b and a > √n, then b < √n (contradiction)

### 3. Square Root without Using Library
**Problem**: Calculate √n without Math.sqrt()
**Solutions**:
- Binary Search: Best for interview
- Newton's Method: Faster convergence
- Bit shifting: For perfect squares

**See**: `SquareRoot.java`

### 4. Number Reversal
**Problem**: Reverse digits of integer (handle negative, overflow)
**Edge Cases**:
- Negative numbers
- Leading zeros after reversal
- Integer overflow

### 5. Climbing Stairs (DP)
**Problem**: How many ways to climb n stairs (1 or 2 steps per move)
**Solution**: f(n) = f(n-1) + f(n-2) - it's Fibonacci!
**See**: `ClimbingStairs.java`

---

## Related Math Concepts

### Bit Manipulation (for Binary)
- AND, OR, XOR operations
- Bit shifting (>> and <<)
- Check if power of 2: n & (n-1) == 0

### Modular Arithmetic
- Division by hand using modulo
- Check divisibility: n % d == 0
- Remainders in array problems

### Combinatorics
- Factorial: n!
- Permutations: P(n,r) = n! / (n-r)!
- Combinations: C(n,r) = n! / (r! × (n-r)!)

---

## Time Complexity Reference

| Problem | Time | Space | Method |
|---------|------|-------|--------|
| Fibonacci | O(n) | O(1) | Iterative |
| Prime Check | O(√n) | O(1) | Trial division |
| Armstrong | O(log n) | O(1) | Digit extraction |
| Factorial | O(n) | O(1) | Iterative |
| Binary Add | O(max(m,n)) | O(1) | String processing |
| Reverse | O(log n) | O(1) | Modulo division |
| Square Root | O(log n) | O(1) | Binary search |

---

## Code Patterns

### Pattern 1: Check Divisibility
```java
for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
        // n is divisible by i
    }
}
```

### Pattern 2: Extract Digits
```java
while (n > 0) {
    int digit = n % 10;
    // Process digit
    n /= 10;
}
```

### Pattern 3: Fibonacci Loop
```java
int a = 0, b = 1;
for (int i = 0; i < n; i++) {
    int next = a + b;
    a = b;
    b = next;
}
```

### Pattern 4: Binary Search for Root
```java
long left = 0, right = x;
while (left <= right) {
    long mid = left + (right - left) / 2;
    if (mid * mid == x) return mid;
    else if (mid * mid < x) left = mid + 1;
    else right = mid - 1;
}
return right; // floor of square root
```

---

## Interview Strategy

### For Fibonacci Question:
1. Explain recursive approach (2^n)
2. Optimize with memoization (n)
3. Further optimize to iterative (n time, 1 space)
4. Show code for iterative approach
5. If time: mention matrix exponentiation for large n

### For Any Math Problem:
1. Clarify constraints (range of input)
2. Ask about overflow handling
3. Discuss edge cases
4. Optimize if possible
5. Code with explanation

### Common Mistakes:
- Forgot to handle negative numbers
- Integer overflow (use long for large calculations)
- Off-by-one errors in loops
- Not checking edge cases (0, 1, negative)

---

## Practice Progression

1. **Start**: Factorial, LeapYear - Simple logic
2. **Next**: PrimeNumber - Optimization technique
3. **Then**: IntegerReverse, AddBinary - Digit manipulation
4. **Advanced**: Fibonacci variants, SquareRoot - Algorithm optimization
5. **Expert**: MinCoins, ClimbingStairs - DP approach

---

Generated: Interview Prep Package - Math Folder

