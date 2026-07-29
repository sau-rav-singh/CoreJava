# Array Problems - Interview Prep Guide

## Overview
This folder contains **26 problems** focused on array manipulation, covering fundamental to advanced techniques.

## Problem Categories

### 1. **Basic Operations** (5 problems)
- `MergeSortedArrays.java` - Merge two sorted arrays
- `RemoveElement.java` - Remove specific element in-place
- `RemoveDuplicates.java` - Remove duplicates from sorted array
- `SearchInsertPosition.java` - Binary search variant
- `ContainsDuplicate.java` - Check for duplicates

**Time Complexity**: O(n) to O(n log n)
**Space Complexity**: O(1) to O(n)

### 2. **Zero/Element Manipulation** (4 problems)
- `MoveZeroes.java` - Move all zeros to end maintaining order
- `SeparateEvenOdd.java` - Separate even and odd numbers
- `NumbersStartingWithDigit.java` - Filter numbers by starting digit
- `ReverseArray.java` - Reverse array elements

**Technique**: In-place manipulation, two-pointers
**Best For**: Space-optimized solutions

### 3. **Range & Subarray Problems** (7 problems)
- `RangeSumQuery.java` - Range sum queries using prefix sums
- `MaxSumSubArray.java` - Maximum sum subarray (Kadane's algorithm)
- `ZeroSumSubarrays.java` - Find subarrays with zero sum
- `TrappedRainWater.java` - Classic rain water trapping problem
- `MaxAverageSubarray.java` - Maximum average subarray
- `PairSumOfSortedArray.java` - Find pair with given sum
- `StockBuySell.java` - Best time to buy and sell stock

**Techniques**: 
- Prefix sums
- Sliding window
- Dynamic programming
- Two-pointers

### 4. **Sorting & Searching** (4 problems)
- `SortedSquares.java` - Squares of sorted array
- `MissingNumber.java` - Find missing number
- `ProductArray.java` - Product of array except self
- `TwoSum.java` - Two sum problem (HashMap and Two-pointer approaches)

**Challenge**: Solve without division, in O(n) time

### 5. **Comparison & Analysis** (3 problems)
- `LargestElement.java` - Find maximum element
- `LargestUniqueNumber.java` - Largest unique number
- `SecondSmallestLargest.java` - Both second largest and smallest
- `MinMaxArray.java` - Find min and max

**Optimization**: Find both in single pass with n+1 comparisons

### 6. **Data Structure Collections** (3 problems)
- `CompareSortedArrayLists.java` - Compare sorted arrays
- `RemoveDupeCharFromList.java` - Remove duplicate characters from string array

---

## Key Techniques to Master

### 1. **Two-Pointer Technique**
Used in: `MoveZeroes.java`, `SeparateEvenOdd.java`, `PairSumOfSortedArray.java`
- Useful for sorted arrays
- Space-efficient (O(1) extra space)
- Common pattern: slow/fast pointers or left/right pointers

### 2. **Sliding Window**
Used in: `MaxAverageSubarray.java`, `PairSumOfSortedArray.java`
- Optimal for subarray problems
- Time Complexity: O(n)
- Commonly asked in interviews

### 3. **Prefix Sums**
Used in: `RangeSumQuery.java`, `ZeroSumSubarrays.java`
- Precompute to answer range queries efficiently
- Trade space (O(n)) for time (O(1) per query)

### 4. **Kadane's Algorithm**
Used in: `MaxSumSubArray.java`
- Classic for maximum subarray problem
- Time: O(n), Space: O(1)
- Can be extended for other variants

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] MergeSortedArrays.java
- [ ] RemoveElement.java
- [ ] MoveZeroes.java
- [ ] LargestElement.java
- [ ] RemoveDuplicates.java
- [ ] ReverseArray.java

### Medium Level
- [ ] MaxSumSubArray.java
- [ ] TrappedRainWater.java
- [ ] ProductArray.java
- [ ] SeparateEvenOdd.java
- [ ] PairSumOfSortedArray.java
- [ ] TwoSum.java
- [ ] MaxAverageSubarray.java

### Hard Level
- [ ] ZeroSumSubarrays.java
- [ ] StockBuySell.java
- [ ] MissingNumber.java
- [ ] SortedSquares.java

---

## Common Interview Questions

1. **How to find duplicates with O(1) space?**
   - See: `ContainsDuplicate.java`
   - Technique: Modify array in-place

2. **Find maximum sum of subarray**
   - See: `MaxSumSubArray.java`
   - Algorithm: Kadane's Algorithm

3. **Rearrange array with O(1) space**
   - See: `MoveZeroes.java`, `SeparateEvenOdd.java`
   - Technique: In-place two-pointer

4. **Range sum queries**
   - See: `RangeSumQuery.java`
   - Optimization: Prefix sum array

5. **Stock trading problems**
   - See: `StockBuySell.java`
   - Similar to max subarray

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Merge Sorted | O(n) | O(n) | Two pointers |
| Max Sum | O(n) | O(1) | Kadane's |
| Trapped Water | O(n) | O(1) | Two pointers |
| Product Array | O(n) | O(n) | Prefix/Suffix |
| Find Missing | O(n) | O(1) | XOR/Math |
| Subarray Sum | O(n) | O(n) | HashMap |
| Duplicate Check | O(n) | O(1)* | In-place mark |

---

## Review Notes

**Most Important:**
1. Two-pointer technique - used in 5+ problems
2. In-place modifications - space optimization is key
3. Prefix sums - powerful for range queries

**Practice Priority:**
1. Start with "Easy" problems to understand patterns
2. Compare different approaches to same problem
3. Focus on space optimization in interviews

---

Generated: Interview Prep Package - Array Folder

