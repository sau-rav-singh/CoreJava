# Complete Interview Prep Master Guide

> *Generated automatically on: 2026-07-29*

---

# Topic: Array

## Notes & Concept Guide

# Array Problems - Interview Prep Guide

## Overview
This folder contains **33 problems** focused on array manipulation, covering fundamental to advanced techniques.

## Problem Categories

### 1. **Basic Operations** (6 problems)
- `MergeSortedArrays.java` - Merge two sorted arrays
- `RemoveElement.java` - Remove specific element in-place
- `RemoveDuplicates.java` - Remove duplicates from sorted array
- `RemoveDuplicates_10.java` - Alternative duplicate removal approach
- `SearchInsertPositionTest.java` - Binary search variant
- `ContainsDuplicate_1.java` - Check for duplicates

**Time Complexity**: O(n) to O(n log n)
**Space Complexity**: O(1) to O(n)

### 2. **Zero/Element Manipulation** (6 problems)
- `MoveZeroes_8.java` - Move all zeros to end maintaining order
- `ShiftZeroes.java` - Similar approach
- `SegrigateZeroAtLast.java` - Segregate zeros at end
- `SeparateEvenOdd.java` - Separate even and odd numbers
- `Startingwith1.java` - Rearrange starting with 1
- `ReverseArray.java` - Reverse array elements

**Technique**: In-place manipulation, two-pointers
**Best For**: Space-optimized solutions

### 3. **Range & Subarray Problems** (8 problems)
- `RangeSum_5.java` - Range sum queries
- `MaxSumSubArray.java` - Maximum sum subarray (Kadane's algorithm)
- `ZeroSumSubarrays.java` - Find subarrays with zero sum
- `TrappedRainWater.java` - Classic rain water trapping problem
- `MaxAverageSubarray.java` - Maximum average subarray
- `MaxAverage_13.java` - Alternative maximum average calculation
- `PairSumOfSortedArray.java` - Find pair with given sum
- `StockBuySell.java` - Best time to buy and sell stock

**Techniques**: 
- Prefix sums
- Sliding window
- Dynamic programming
- Two-pointers

### 4. **Sorting & Searching** (6 problems)
- `SortedSquares_11.java` - Squares of sorted array
- `SortedSquares.java` - Duplicate approach
- `MissingNumber_6.java` - Find missing number
- `ProductArray.java` - Product of array except self
- `TwoSum_2.java` - Two sum problem approach 1
- `TwoSum_9.java` - Two sum problem approach 2

**Challenge**: Solve without division, in O(n) time

### 5. **Comparison & Analysis** (5 problems)
- `LargestElement.java` - Find maximum element
- `LargestUniqueNumberTest.java` - Largest unique number
- `SecondLargest.java` - Second largest element
- `SecondSmallestLargest.java` - Both second largest and smallest
- `MinMaxArray.java` - Find min and max

**Optimization**: Find both in single pass with n+1 comparisons

### 6. **Data Structure Collections** (3 problems)
- `ArrayListTest.java` - ArrayList operations
- `SortedArrayListEquality.java` - Compare sorted arrays
- `ArrayElementFrequency.java` - Frequency counting

---

## Key Techniques to Master

### 1. **Two-Pointer Technique**
Used in: `MoveZeroes_8.java`, `SeparateEvenOdd.java`, `PairSumOfSortedArray.java`
- Useful for sorted arrays
- Space-efficient (O(1) extra space)
- Common pattern: slow/fast pointers or left/right pointers

### 2. **Sliding Window**
Used in: `MaxAverageSubarray.java`, `PairSumOfSortedArray.java`
- Optimal for subarray problems
- Time Complexity: O(n)
- Commonly asked in interviews

### 3. **Prefix Sums**
Used in: `RangeSum_5.java`, `ZeroSumSubarrays.java`
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
- [ ] MoveZeroes_8.java
- [ ] LargestElement.java
- [ ] RemoveDuplicates.java
- [ ] ReverseArray.java

### Medium Level
- [ ] MaxSumSubArray.java
- [ ] TrappedRainWater.java
- [ ] ProductArray.java
- [ ] SeparateEvenOdd.java
- [ ] PairSumOfSortedArray.java
- [ ] TwoSum_2.java
- [ ] MaxAverage_13.java

### Hard Level
- [ ] ZeroSumSubarrays.java
- [ ] StockBuySell.java
- [ ] MissingNumber_6.java
- [ ] SortedSquares_11.java
- [ ] TwoSum_9.java

---

## Common Interview Questions

1. **How to find duplicates with O(1) space?**
   - See: `ContainsDuplicate_1.java`
   - Technique: Modify array in-place

2. **Find maximum sum of subarray**
   - See: `MaxSumSubArray.java`
   - Algorithm: Kadane's Algorithm

3. **Rearrange array with O(1) space**
   - See: `MoveZeroes_8.java`, `SeparateEvenOdd.java`
   - Technique: In-place two-pointer

4. **Range sum queries**
   - See: `RangeSum_5.java`
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



## Code Solutions

### ArrayListTest.java

```java
package InterviewPrep.Array;
import java.util.Arrays;

// QUESTION: Given an array of strings, remove duplicate characters from each string while
// preserving the order of first occurrence.
// Example: Input: ["hello", "helloishi", "mastercard"] -> Output: ["helo", "helois", "mstercd"]
public class ArrayListTest {
    public static void main(String[] args) {
        String[] words = {"hello", "helloishi", "mastercard"};
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            result[i] = removeDuplicates(words[i]);
        }

        System.out.println(Arrays.toString(result));
    }

    private static String removeDuplicates(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}


```

### ContainsDuplicate_1.java

```java
package InterviewPrep.Array;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_1 {

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    public static void main(String[] args) {
        Assert.assertTrue(containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> dupeFilter = new HashSet<>();
        for (int i : nums) {
            if (!dupeFilter.add(i)) {
                return true;
            }
        }
        return false;
    }
}


```

### LargestElement.java

```java
package InterviewPrep.Array;

public class LargestElement {
    // QUESTION: Given an array of integers, find the largest element.
    // Example: Input: [1, 2, 3, 1, 2, 3, 4, 5] -> Output: 5
    //Space/Time:O(n)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println(max);
    }
}


```

### LargestUniqueNumberTest.java

```java
package InterviewPrep.Array;

import org.testng.Assert;
import org.testng.annotations.Test;

// QUESTION: Given an array of integers, return the largest integer that occurs only once. If no
// such integer exists, return -1.
// Example: Input: [1, 2, 2, 3, 3, 4, 4, 4] -> Output: 1
//          Input: [2, 2, 2, 2] -> Output: -1
public class LargestUniqueNumberTest {

    public static Integer findLargestUniqueNumber(int[] nums) {
        final int kMax = 1000;
        int[] count = new int[kMax + 1];

        for (int num : nums)
            count[num]++;

        for (int num = kMax; num >= 0; num--)
            if (count[num] == 1)
                return num;

        return -1;
    }

    @Test
    public void largestUniqueTest() {
        Assert.assertEquals(findLargestUniqueNumber(new int[]{2, 2, 2, 2}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 2, 3, 3, 4, 4, 4}), 1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 3, 4, 5}), Integer.valueOf(5));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 1, 2, 2, 3, 4}), Integer.valueOf(4));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{4, 3, 3, 2, 2, 1}), Integer.valueOf(4));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{3, 1, 4, 1, 5, 5}), Integer.valueOf(4));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{99}), Integer.valueOf(99));
    }
}


```

### MaxAverageSubarray.java

```java
package InterviewPrep.Array;

// QUESTION: Given an array of integers and a number k, find the contiguous subarray of length k
// that has the maximum average value and return that average.
// Example: Input: [1, 12, -5, -6, 50, 3], k = 4 -> Output: 12.75
public class MaxAverageSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        System.out.println(getMaxAverage(arr, 4)); // Output: 12.75
        System.out.println(getMaxAverage(arr, 3)); // Output: 15.666...
    }

    private static double getMaxAverage(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        double maxWindowSum = currentSum;
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            maxWindowSum = Math.max(maxWindowSum, currentSum);
        }
        return maxWindowSum / k;
    }
}


```

### MaxSumSubArray.java

```java
package InterviewPrep.Array;

public class MaxSumSubArray {
    // QUESTION: Given an array of integers, find the maximum sum of any contiguous subarray.
    // Example: Input: [1, 12, -5, -6, 50, 3] -> Output: 55 (12 + (-5) + (-6) + 50 + 3)
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i : arr) {
            currentSum += i;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Maximum Sum of Contiguous Subarray: " + maxSum);
    }
}

```

### MergeSortedArrays.java

```java
package InterviewPrep.Array;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        merge(nums1_1, m1, nums2_1, n1);
        System.out.print("Merged Array 1: ");
        for (int num : nums1_1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array (nums1)

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}


```

### MinMaxArray.java

```java

```

### MissingNumber_6.java

```java
package InterviewPrep.Array;

import org.testng.Assert;

public class MissingNumber_6 {
    //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    public static void main(String[] args) {
        Assert.assertEquals(missingNumber(new int[]{3, 0, 1}),2);
        char a='a';
        if(Character.isAlphabetic(a)){
            System.out.println(true);
        }
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len * (len + 1)) / 2;
        int arraySum = 0;
        for (int i : nums) {
            arraySum += i;
        }
        return sum - arraySum;
    }
}


```

### MoveZeroes_8.java

```java
package InterviewPrep.Array;

import java.util.Arrays;

public class MoveZeroes_8 {

    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static void moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                if (fast != slow) {
                    int temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                }
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}


```

### PairSumOfSortedArray.java

```java
package InterviewPrep.Array;

// QUESTION: Given a sorted array of integers and a target sum, find if there exists a pair of elements
// in the array that sum to the target. Return the pair if found.
// Example: Input: [1, 2, 3, 4, 5, 6], target = 8 -> Output: (2, 6) or (3, 5)
public class PairSumOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        targetSum(arr, 8);
        targetSum(arr, 5);
    }

    static void targetSum(int[] arr, int targetSum) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == targetSum) {
                System.out.println("Target Sum found: " + arr[i] + ", " + arr[j]);
                return;
            } else if (sum < targetSum) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Target Sum not found.");
    }
}


```

### ProductArray.java

```java
package InterviewPrep.Array;

import java.util.Arrays;

// QUESTION: Given an integer array nums, return an array answer such that answer[i] is equal to the
// product of all the elements of nums except nums[i]. You must write an algorithm that runs in O(n)
// time and without using the division operation.
// Example: Input: [1, 2, 3, 4] -> Output: [24, 12, 8, 6]
public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}


```

### RangeSum_5.java

```java
package InterviewPrep.Array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RangeSum_5 {
   //Given an integer array nums, handle multiple queries of the following type:
   //Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.

    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
     */

   static class NumArray {
      private final int[] prefixSums;

      public NumArray(int[] nums) {
         prefixSums = new int[nums.length + 1];
         for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
         }
      }

      public int sumRange(int left, int right) {
         return prefixSums[right + 1] - prefixSums[left];
      }
   }

   @Test
   public void testStandardRange() {
      int[] nums = {-2, 0, 3, -5, 2, -1};
      RangeSum.NumArray numArray = new NumArray(nums);

      // Sum of indices 0 to 2: (-2 + 0 + 3) = 1
      Assert.assertEquals(numArray.sumRange(0, 2), 1, "Sum of range [0, 2] failed");

      // Sum of indices 2 to 5: (3 + -5 + 2 + -1) = -1
      Assert.assertEquals(numArray.sumRange(2, 5), -1, "Sum of range [2, 5] failed");

      // Sum of indices 0 to 5 (Full Array): -3
      Assert.assertEquals(numArray.sumRange(0, 5), -3, "Sum of full range failed");
   }

   @Test
   public void testSingleElementRange() {
      int[] nums = {1, 10, 100};
      RangeSum.NumArray numArray = new NumArray(nums);

      // If left == right, it should return just that element
      Assert.assertEquals(numArray.sumRange(1, 1), 10, "Single element range [1, 1] failed");
      Assert.assertEquals(numArray.sumRange(0, 0), 1, "Single element range [0, 0] failed");
   }

   @Test
   public void testLargeValues() {
      int[] nums = {1000, -1000, 1000};
      RangeSum.NumArray numArray = new NumArray(nums);

      // Sum of [0, 1] should be 0
      Assert.assertEquals(numArray.sumRange(0, 1), 0, "Sum of cancelling values failed");
   }
}


```

### RemoveDuplicates.java

```java
package InterviewPrep.Array;

import org.testng.Assert;

import java.util.Arrays;

// QUESTION: Given a sorted array of integers, remove the duplicates in-place such that each element
// appears only once. Return the array after removing duplicates.
// Example: Input: [1, 1, 2, 3, 4, 4, 4, 5] -> Output: [1, 2, 3, 4, 5]
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 4, 5};
        Assert.assertEquals(removeDuplicates(arr), new int[]{1, 2, 3, 4, 5});
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        Arrays.sort(arr);
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {//Shifts unique elements forward instead of swapping
                j++;
                arr[j] = arr[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, j + 1);
    }
}

```

### RemoveElement.java

```java
package InterviewPrep.Array;

import java.util.Arrays;

public class RemoveElement {
    //Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(nums, j)));
        return j;
    }
}


```

### ReverseArray.java

```java
package InterviewPrep.Array;

// QUESTION: Given an array of integers, reverse the array in-place.
// Example: Input: [1, 2, 3, 4, 5, 6] -> Output: [6, 5, 4, 3, 2, 1]
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6};
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}


```

### SearchInsertPositionTest.java

```java
package InterviewPrep.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInsertPositionTest {

    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return len;
    }

    public int searchInsertBinary(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    @Test
    public void testExample1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        assertEquals(searchInsert(nums, target), 2);
        assertEquals(searchInsertBinary(nums, target), 2);
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        assertEquals(searchInsert(nums, target), 1);
        assertEquals(searchInsertBinary(nums, target), 1);
    }

    @Test
    public void testExample3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        assertEquals(searchInsert(nums, target), 4);
        assertEquals(searchInsertBinary(nums, target), 4);
    }

    @Test
    public void testExample4() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        assertEquals(searchInsert(nums, target), 0);
        assertEquals(searchInsertBinary(nums, target), 0);
    }

    @Test
    public void testExample5() {
        int[] nums = {1};
        int target = 0;
        assertEquals(searchInsert(nums, target), 0);
        assertEquals(searchInsertBinary(nums, target), 0);
    }

    @Test
    public void testExample6() {
        int[] nums = {1};
        int target = 2;
        assertEquals(searchInsert(nums, target), 1);
        assertEquals(searchInsertBinary(nums, target), 1);
    }

    @Test
    public void testExample7() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        assertEquals(searchInsert(nums, target), 2);
        assertEquals(searchInsertBinary(nums, target), 2);
    }

    @Test
    public void testExample8() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        assertEquals(searchInsert(nums, target), 5);
        assertEquals(searchInsertBinary(nums, target), 5);
    }

    @Test
    public void testExample9() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 0;
        assertEquals(searchInsert(nums, target), 0);
        assertEquals(searchInsertBinary(nums, target), 0);
    }
}


```

### SecondSmallestLargest.java

```java
package InterviewPrep.Array;

// QUESTION: Given an array of integers, find the second smallest and/or second largest elements.
// Example: Input: [1, 8, 5, 3, 20, 4, 5, 8, 6, 10] -> Output: Second Smallest: 3, Second Largest: 10
public class SecondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 20, 4, 5, 8, 6, 10};

        System.out.println("Second Smallest Element: " + findSecondSmallest(arr));
        System.out.println("Second Largest Element: " + findSecondLargest(arr));

        // Test with array where all elements are same
        int[] sameArr = {5, 5, 5, 5};
        System.out.println("Second Largest (all same): " + findSecondLargest(sameArr));
    }

    /**
     * Find the second largest element in an array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Returns -1 if no second largest exists
     */
    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (element > secondLargest && element != firstLargest) {
                secondLargest = element;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    /**
     * Find the second smallest element in an array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Returns Integer.MAX_VALUE if no second smallest exists
     */
    public static int findSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j < secondSmallest && j != smallest) {
                secondSmallest = j;
            }
        }

        return secondSmallest;
    }
}


```

### SeparateEvenOdd.java

```java
package InterviewPrep.Array;

import java.util.Arrays;

public class SeparateEvenOdd {
    // QUESTION: Given an array of integers, move all even numbers to the left side and odd numbers to the right side.
    // Example: Input: [1, 2, 3, 4, 5, 6, 7, 8, 9] -> Output: [2, 4, 6, 8, 1, 3, 5, 7, 9]
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        moveEven(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveEven(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}


```

### SortedArrayListEquality.java

```java
package InterviewPrep.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedArrayListEquality {
    // QUESTION: Given two ArrayLists of integers, determine if they contain the same elements
    // regardless of their initial order. Sort both lists and compare them.
    // Example: Input: [5, 2, 7, 1, 4] and [1, 2, 4, 5, 7] -> Output: true
    public static void main(String[] args) {
        // Example 1: Equal ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 2, 7, 1, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 7));

        // Step 1: Sort both ArrayLists
        Collections.sort(list1);
        Collections.sort(list2);

        // Step 2: Check for equality
        boolean isEqual1 = list1.equals(list2);
        System.out.println("Are sorted ArrayLists equal? " + isEqual1);

        // Example 2: Different ArrayLists
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 2, 7, 1, 4));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        // Step 1: Sort both ArrayLists
        Collections.sort(list3);
        Collections.sort(list4);

        // Step 2: Check for equality
        boolean isEqual2 = list3.equals(list4);
        System.out.println("Are sorted ArrayLists equal? " + isEqual2);
    }
}


```

### SortedSquares.java

```java
package InterviewPrep.Array;

import java.util.Arrays;

public class SortedSquares {
    // QUESTION: Given a sorted array of integers (may contain negative numbers), return an array
    // of the squares of each number sorted in non-decreasing order.
    // Example: Input: [-7, -3, 2, 3, 11] -> Output: [4, 9, 9, 49, 121]
    //t:s:n
    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}



```

### Startingwith1.java

```java
package InterviewPrep.Array;

import java.util.Arrays;

public class Startingwith1 {
    // QUESTION: Given an array of integers, print all numbers that start with the digit 1.
    // Example: Input: [1, 23, 123, 45, 134] -> Output: 1, 23, 123, 134
    public static void main(String[] args) {
        int[] arr = {1, 23, 123, 45, 134};
        Arrays.stream(arr).filter(num -> String.valueOf(num).startsWith("1")).forEach(System.out::println);
    }
}


```

### StockBuySell.java

```java
package InterviewPrep.Array;

public class StockBuySell {
    // QUESTION: Given an array of stock prices where prices[i] is the price on day i, find the
    // maximum profit you can achieve by buying on one day and selling on a different day.
    // Example: Input: [7, 1, 5, 3, 6, 4] -> Output: 5 (buy at 1, sell at 6)
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price > buyPrice) {
                int profit = price - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }
}

```

### TrappedRainWater.java

```java
package InterviewPrep.Array;

public class TrappedRainWater {
    // QUESTION: Given an array of non-negative integers representing the height of bars, compute how
    // much water it can trap after raining.
    // Example: Input: [4,2,0,6,3,2,5] -> Output: 9
    public static void main(String[] args) {
        int[] height=new int[]{4,2,0,6,3,2,5};
        int waterTrapped=trapRainWater(height);
        System.out.println(waterTrapped);

    }

    public static int trapRainWater(int[] height){
        int length=height.length;
        int[] leftMaxBoundary=new int[length];
        int[] rightMaxBoundary=new int[length];

        leftMaxBoundary[0]=height[0];
        for(int i=1;i<length;i++){
            leftMaxBoundary[i]=Math.max(leftMaxBoundary[i-1],height[i]);
        }

        rightMaxBoundary[length-1]=height[length-1];
        for(int i=length-2;i>=0;i--){
            rightMaxBoundary[i]=Math.max(height[i],rightMaxBoundary[i+1]);
        }
        int result=0;
        for(int i=0;i<length;i++){
            int waterLevel=Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
            result+=waterLevel-height[i];
        }

        return result;
    }
}


```

### TwoSum.java

```java
package InterviewPrep.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// QUESTION: Given an array of integers, find two numbers such that they add up to a specific target.
// Example: Input: [2, 7, 11, 15], target = 9 -> Output: [0, 1] (indices)
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Approach 1: HashMap (for unsorted arrays)
        System.out.println("HashMap Approach: " + Arrays.toString(twoSumHashMap(nums, target)));

        // Approach 2: Two pointers (for sorted arrays)
        int[] sortedNums = {2, 7, 11, 15};
        System.out.println("Two Pointer Approach: " + Arrays.toString(twoSumTwoPointer(sortedNums, target)));
    }

    /**
     * Approach 1: Using HashMap
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Use when array is NOT sorted
     */
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int counter = target - nums[i];
            if (hs.containsKey(counter)) {
                ans[0] = i;
                ans[1] = hs.get(counter);
                break;
            } else {
                hs.put(nums[i], i);
            }
        }
        return ans;
    }

    /**
     * Approach 2: Two Pointers
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Use when array is ALREADY sorted
     * Returns 1-indexed positions as per LeetCode convention
     */
    public static int[] twoSumTwoPointer(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}


```

### ZeroSumSubarrays.java

```java
package InterviewPrep.Array;

import java.util.*;

public class ZeroSumSubarrays {
    // QUESTION: Given an array of integers, find all subarrays that sum to zero. Print each subarray.
    // Example: Input: [6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7]
    //          Output: All subarrays that sum to zero
    public static void printZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(List.of(-1)));// To handle cases where the subarray starts from index 0

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int startIdx : indices) {
                    System.out.println("Subarray found: " + Arrays.toString(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("Zero-sum subarrays:");
        printZeroSumSubarrays(arr);
    }
}


```


---

# Topic: Backtracking

## Notes & Concept Guide

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


## Code Solutions

### Combinations.java

```java
package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    // QUESTION: Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
    // Example: Input: n = 4, k = 2
    //          Output: [[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]
    // Time Complexity: O(C(n,k) * k)
    // Space Complexity: O(k) for recursion stack

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, int start, int n, int k) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(result, current, i + 1, n, k);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> result = combine(n, k);
        System.out.println("Combinations of " + k + " numbers from 1 to " + n + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}

```

### CombinationSum.java

```java
package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    // QUESTION: Given an array of distinct integers candidates and a target integer target, return a list of
    // all unique combinations of candidates where the chosen numbers sum to target. The same number may be
    // chosen from candidates an unlimited number of times.
    // Example: Input: candidates = [2,3,6,7], target = 7
    //          Output: [[2,2,3],[7]]
    // Time Complexity: O(N^(T/M + 1)) where N is candidates, T is target, M is min candidate
    // Space Complexity: O(T/M) for recursion stack

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, 
                                  int[] candidates, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (remaining < 0) return;

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(result, current, candidates, remaining - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}

```

### GenerateParentheses.java

```java
package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    // QUESTION: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    // Example: Input: n = 3
    //          Output: ["((()))","(()())","(())()","()(())","()()()"]
    // Time Complexity: O(4^n / sqrt(n))
    // Space Complexity: O(n) for recursion stack

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println("All valid parentheses combinations for n=" + n + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}

```

### NQueens.java

```java
package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    // QUESTION: The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two
    // queens attack each other. Given an integer n, return all distinct solutions to the n-queens puzzle.
    // Example: Input: n = 4
    //          Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
    // Time Complexity: O(n!)
    // Space Complexity: O(n^2) for the board

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backtrack(result, board, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, char[][] board, int row) {
        if (row == board.length) {
            result.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(result, board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isValid(char[][] board, int row, int col) {
        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solveNQueens(n);
        System.out.println("Solutions for " + n + "-Queens problem:");
        for (List<String> solution : result) {
            System.out.println(solution);
        }
    }
}

```

### PalindromePartitioning.java

```java
package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    // QUESTION: Given a string s, partition s such that every substring of the partition is a palindrome.
    // Return all possible palindrome partitionings of s.
    // Example: Input: s = "aab"
    //          Output: [["a","a","b"],["aa","b"]]
    // Time Complexity: O(n * 2^n)
    // Space Complexity: O(n) for recursion stack

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, List<String> current, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                current.add(substring);
                backtrack(result, current, s, end);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = partition(s);
        System.out.println("Palindrome partitions of \"" + s + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}

```

### WordSearch.java

```java
package InterviewPrep.Backtracking;

public class WordSearch {
    // QUESTION: Given an m x n grid of characters board and a string word, return true if word exists in the grid.
    // The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally
    // or vertically neighboring. The same letter cell may not be used more than once.
    // Example: Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    //          Output: true
    // Time Complexity: O(m * n * 4^L) where L is word length
    // Space Complexity: O(L) for recursion stack

    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited

        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                       dfs(board, word, i - 1, j, index + 1) ||
                       dfs(board, word, i, j + 1, index + 1) ||
                       dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp; // Restore
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word)); // Output: true

        String word2 = "SEE";
        System.out.println(exist(board, word2)); // Output: true
    }
}

```


---

# Topic: BitManipulation

## Notes & Concept Guide

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


## Code Solutions

### HammingDistance.java

```java
package InterviewPrep.BitManipulation;

public class HammingDistance {
    // QUESTION: The Hamming distance between two integers is the number of positions at which the corresponding
    // bits are different. Given two integers x and y, return the Hamming distance between them.
    // Example: Input: x = 1, y = 4
    //          Output: 2 (1: 0001, 4: 0100)
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR gives 1 where bits differ
        int distance = 0;

        while (xor != 0) {
            distance += xor & 1; // Count set bits
            xor >>>= 1; // Unsigned right shift
        }

        return distance;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4)); // Output: 2
        System.out.println(hammingDistance(3, 1)); // Output: 1
    }
}

```

### NumberOf1Bits.java

```java
package InterviewPrep.BitManipulation;

public class NumberOf1Bits {
    // QUESTION: Write a function that takes the binary representation of an unsigned integer and returns the
    // number of '1' bits it has (also known as the Hamming weight).
    // Example: Input: n = 11 (binary: 1011)
    //          Output: 3
    // Time Complexity: O(1) - at most 32 iterations for 32-bit integer
    // Space Complexity: O(1)

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Check if least significant bit is 1
            n >>>= 1; // Unsigned right shift
        }
        return count;
    }

    // Alternative: Brian Kernighan's algorithm
    public static int hammingWeightOptimized(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // Clear the least significant set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11; // binary: 1011
        System.out.println(hammingWeight(n)); // Output: 3
        System.out.println(hammingWeightOptimized(n)); // Output: 3
    }
}

```

### PowerOfTwo.java

```java
package InterviewPrep.BitManipulation;

public class PowerOfTwo {
    // QUESTION: Given an integer n, return true if it is a power of two. Otherwise, return false.
    // Example: Input: n = 1
    //          Output: true
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        // A power of two has exactly one bit set
        // n & (n - 1) clears the least significant bit
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));   // Output: true
        System.out.println(isPowerOfTwo(16));  // Output: true
        System.out.println(isPowerOfTwo(3));   // Output: false
        System.out.println(isPowerOfTwo(0));   // Output: false
    }
}

```

### ReverseBits.java

```java
package InterviewPrep.BitManipulation;

public class ReverseBits {
    // QUESTION: Reverse bits of a given 32 bits unsigned integer.
    // Example: Input: n = 00000010100101000001111010011100
    //          Output: 00111001011110000010100101000000
    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Shift result left
            result |= (n & 1); // Add least significant bit of n
            n >>>= 1; // Shift n right (unsigned)
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        int reversed = reverseBits(n);
        System.out.println(Integer.toBinaryString(reversed)); // Output: 111001010000111010010100000000
    }
}

```

### SingleNumber.java

```java
package InterviewPrep.BitManipulation;

public class SingleNumber {
    // QUESTION: Given a non-empty array of integers nums, every element appears twice except for one.
    // Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.
    // Example: Input: nums = [2,2,1]
    //          Output: 1
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all numbers
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); // Output: 4
    }
}

```

### SingleNumberIII.java

```java
package InterviewPrep.BitManipulation;

public class SingleNumberIII {
    // QUESTION: Given an integer array nums where exactly two elements appear only once and all the other
    // elements appear exactly twice. Find the two elements that appear only once. You may return the answer in any order.
    // Example: Input: nums = [1,2,1,3,2,5]
    //          Output: [3,5] or [5,3]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int[] singleNumber(int[] nums) {
        // XOR of all numbers gives XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Find rightmost set bit (this bit differs between the two unique numbers)
        int rightmostBit = xor & (-xor);

        int num1 = 0, num2 = 0;

        // Partition numbers based on the rightmost bit
        for (int num : nums) {
            if ((num & rightmostBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = singleNumber(nums);
        System.out.println("Single numbers: " + result[0] + ", " + result[1]); // Output: 3, 5
    }
}

```


---

# Topic: DynamicProgramming

## Notes & Concept Guide

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


## Code Solutions

### ClimbingStairs.java

```java
package InterviewPrep.DynamicProgramming;

public class ClimbingStairs {
    //You are climbing a staircase. It takes n steps to reach the top.
    //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}


```

### CoinChange.java

```java
package InterviewPrep.DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    // QUESTION: You are given an integer array coins representing coins of different denominations and an integer
    // amount representing a total amount of money. Return the fewest number of coins that you need to make up that
    // amount. If that amount of money cannot be made up by any combination of the coins, return -1.
    // Example: Input: coins = [1,2,5], amount = 11
    //          Output: 3 (5 + 5 + 1)
    // Time Complexity: O(n * amount)
    // Space Complexity: O(amount)

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        System.out.println(coinChange(coins1, 11)); // Output: 3

        int[] coins2 = {2};
        System.out.println(coinChange(coins2, 3)); // Output: -1
    }
}

```

### EditDistance.java

```java
package InterviewPrep.DynamicProgramming;

public class EditDistance {
    // QUESTION: Given two strings word1 and word2, return the minimum number of operations required to convert
    // word1 to word2. You have the following three operations permitted on a word:
    // - Insert a character
    // - Delete a character
    // - Replace a character
    // Example: Input: word1 = "horse", word2 = "ros"
    //          Output: 3 (horse -> rorse (replace 'h' with 'r') -> rose (remove 'r') -> ros (remove 'e'))
    // Time Complexity: O(m * n)
    // Space Complexity: O(m * n)

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // delete all characters
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // insert all characters
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // replace
                                   Math.min(dp[i - 1][j],    // delete
                                            dp[i][j - 1]));  // insert
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros")); // Output: 3
        System.out.println(minDistance("intention", "execution")); // Output: 5
    }
}

```

### HouseRobber.java

```java
package InterviewPrep.DynamicProgramming;

public class HouseRobber {
    // QUESTION: You are a professional robber planning to rob houses along a street. Each house has a certain
    // amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent
    // houses have security systems connected and it will automatically contact the police if two adjacent houses
    // were broken into on the same night. Given an integer array nums representing the amount of money at each
    // house, return the maximum amount of money you can rob tonight without alerting the police.
    // Example: Input: nums = [1,2,3,1]
    //          Output: 4 (rob house 1 and 3)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0; // max money if we skip previous house
        int prev1 = 0; // max money if we rob previous house

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(rob(nums1)); // Output: 4

        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println(rob(nums2)); // Output: 12
    }
}

```

### HouseRobberII.java

```java
package InterviewPrep.DynamicProgramming;

public class HouseRobberII {
    // QUESTION: You are a professional robber planning to rob houses along a street. Each house has a certain
    // amount of money stashed. All houses at this place are arranged in a circle. This means the first house is
    // the neighbor of the last one. Return the maximum amount of money you can rob tonight without alerting the police.
    // Example: Input: nums = [2,3,2]
    //          Output: 3 (rob house 2)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // Rob houses from 0 to n-2 (exclude last house)
        int max1 = robLinear(nums, 0, nums.length - 2);
        // Rob houses from 1 to n-1 (exclude first house)
        int max2 = robLinear(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    private static int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        System.out.println(rob(nums1)); // Output: 3

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(rob(nums2)); // Output: 4

        int[] nums3 = {1, 2, 3};
        System.out.println(rob(nums3)); // Output: 3
    }
}

```

### LongestCommonSubsequence.java

```java
package InterviewPrep.DynamicProgramming;

public class LongestCommonSubsequence {
    // QUESTION: Given two strings text1 and text2, return the length of their longest common subsequence.
    // A subsequence of a string is a new string generated from the original string with some characters
    // (can be none) deleted without changing the relative order of the remaining characters.
    // Example: Input: text1 = "abcde", text2 = "ace"
    //          Output: 3 ("ace")
    // Time Complexity: O(m * n)
    // Space Complexity: O(m * n)

    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace")); // Output: 3
        System.out.println(longestCommonSubsequence("abc", "abc")); // Output: 3
        System.out.println(longestCommonSubsequence("abc", "def")); // Output: 0
    }
}

```

### LongestIncreasingSubsequence.java

```java
package InterviewPrep.DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    // QUESTION: Given an integer array nums, return the length of the longest strictly increasing subsequence.
    // Example: Input: nums = [10,9,2,5,3,7,101,18]
    //          Output: 4 ([2,3,7,101])
    // Time Complexity: O(n log n) using binary search
    // Space Complexity: O(n)

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] tails = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tails[left] = num;
            if (left == size) {
                size++;
            }
        }

        return size;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums1)); // Output: 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(nums2)); // Output: 4
    }
}

```

### MaximumProductSubarray.java

```java
package InterviewPrep.DynamicProgramming;

public class MaximumProductSubarray {
    // QUESTION: Given an integer array nums, find the contiguous subarray within an array (containing at least
    // one number) which has the largest product.
    // Example: Input: nums = [2,3,-2,4]
    //          Output: 6 ([2,3])
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // If current number is negative, swap max and min
            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(num, maxProduct * num);
            minProduct = Math.min(num, minProduct * num);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println(maxProduct(nums1)); // Output: 6

        int[] nums2 = {-2, 0, -1};
        System.out.println(maxProduct(nums2)); // Output: 0
    }
}

```

### UniquePaths.java

```java
package InterviewPrep.DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    // QUESTION: There is a robot on an m x n grid. The robot can only move either down or right at any point in time.
    // The robot is trying to reach the bottom-right corner of the grid. How many possible unique paths are there?
    // Example: Input: m = 3, n = 7
    //          Output: 28
    // Time Complexity: O(m * n)
    // Space Complexity: O(n) optimized

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7)); // Output: 28
        System.out.println(uniquePaths(3, 2)); // Output: 3
    }
}

```


---

# Topic: FileIO

## Code Solutions

### AppendFile.java

```java
package InterviewPrep.FileIO;

import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        String text = "Welcome to GeeksforGeeks\nHappy Learning!";
        String filePath = "src/test/resources/file3.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(text);
            System.out.println("Successfully appended to the file: " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }

        System.out.println("\n--- Reading file contents ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

```

### CompareFiles.java

```java
package InterviewPrep.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class CompareFiles {
    public static void main(String[] args) {
        String file1 = "src/test/resources/file1.txt";
        String file2 = "src/test/resources/file2.txt";
        try (
                Stream<String> fileStream1 = Files.lines(Paths.get(file1));
                Stream<String> fileStream2 = Files.lines(Paths.get(file2))
        ) {
            Iterator<String> it1 = fileStream1.iterator();
            Iterator<String> it2 = fileStream2.iterator();
            int lineNum = 1;
            while (it1.hasNext() || it2.hasNext()) {
                String line1 = it1.hasNext() ? it1.next() : "<no line>";
                String line2 = it2.hasNext() ? it2.next() : "<no line>";
                if (!line1.equals(line2)) {
                    System.out.printf("Difference at line %d:\nFile1: %s\nFile2: %s\n\n", lineNum, line1, line2);
                }
                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

### CountLogsTest.java

```java
package InterviewPrep.FileIO;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLogsTest {

    @Test
    public void countLogLevelsBufferedTest() {
        Path path = Paths.get("src/test/resources/application.log");
        Map<String, Integer> logLevels = countLogLevelsBuffered(path);
        System.out.println(logLevels);
    }

    @Test
    public void countLogLevelsTest() {
        Path path = Paths.get("src/test/resources/application.log");
        Map<String, Long> logLevels = countLogLevels(path);
        System.out.println(logLevels);
    }

    @Test
    public void findLongestLineTest() {
        Path path = Paths.get("src/test/resources/emp.txt");
        findLongestLine(path).ifPresent(line -> {
            System.out.println("Longest Line:");
            System.out.println(line);

            System.out.println("\nLength:");
            System.out.println(line.length());
        });
    }

    public static Map<String, Long> countLogLevels(Path path) {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .map(line -> line.split("\\s+")[2])
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read log file", e);
        }
    }

    public static Optional<String> findLongestLine(Path path) {
        try (Stream<String> lines = Files.lines(path)) {
            return lines.max(Comparator.comparingInt(String::length));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read lines for longest line check", e);
        }
    }

    public static Map<String, Integer> countLogLevelsBuffered(Path path) {
        Map<String, Integer> counts = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String level = line.split("\\s+")[2];
                counts.merge(level, 1, Integer::sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return counts;
    }

}


```

### FileIO.java

```java
package InterviewPrep.FileIO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FileIO {
    public static void main(String[] args) {
        readWriteWithBuffer();
        readWriteWithStream();
    }

    private static void readWriteWithBuffer() {
        String filePath = "src/test/resources/file3.txt";

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8))) {
            writer.write("Hello World");
            writer.newLine();
            writer.write(String.valueOf(Math.random()));
            writer.newLine();
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void readWriteWithStream() {
        Path path = Paths.get("src/test/resources/file3.txt");

        try {
            Files.writeString(path, "Hello World\n" + Math.random() + "\n", StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


```

### MasterStudyGuideBundler.java

```java
package InterviewPrep.FileIO;

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class MasterStudyGuideBundler {

    // Relative path to the InterviewPrep folder from project root
    private static final String INTERVIEW_PREP_PATH = "src/test/java/InterviewPrep";
    private static final String OUTPUT_FILE_NAME = "ALL_INTERVIEW_PREP.md";

    public static void main(String[] args) {
        bundleAllPackages();
    }

    public static void bundleAllPackages() {
        Path rootDir = Paths.get(INTERVIEW_PREP_PATH);
        Path outputFile = rootDir.resolve(OUTPUT_FILE_NAME);

        if (!Files.exists(rootDir) || !Files.isDirectory(rootDir)) {
            System.err.println("Root directory does not exist: " + rootDir.toAbsolutePath());
            return;
        }

        StringBuilder masterContent = new StringBuilder();

        // Title and Table of Contents Header
        masterContent.append("# Complete Interview Prep Master Guide\n\n");
        masterContent.append("> *Generated automatically on: ").append(java.time.LocalDate.now()).append("*\n\n");
        masterContent.append("---\n\n");

        try (Stream<Path> subDirs = Files.list(rootDir)) {
            // Process subdirectories (packages) alphabetically, ignoring non-directories
            subDirs.filter(Files::isDirectory)
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(packageDir -> processSubpackage(packageDir, masterContent));

            // Write the complete master content into one single Markdown file
            Files.writeString(outputFile, masterContent.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Master guide created successfully at: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error bundling master guide: " + e.getMessage());
        }
    }

    private static void processSubpackage(Path packageDir, StringBuilder masterContent) {
        String packageName = packageDir.getFileName().toString();

        // Header for each main topic/subpackage
        masterContent.append("# Topic: ").append(packageName).append("\n\n");

        // 1. Process GUIDE.md if present
        Path guideFile = packageDir.resolve("GUIDE.md");
        if (Files.exists(guideFile)) {
            try {
                masterContent.append("## Notes & Concept Guide\n\n");
                masterContent.append(Files.readString(guideFile)).append("\n\n");
            } catch (IOException e) {
                System.err.println("Error reading guide in " + packageName + ": " + e.getMessage());
            }
        }

        // 2. Process Java Files
        masterContent.append("## Code Solutions\n\n");

        try (Stream<Path> files = Files.walk(packageDir, 1)) {
            files.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(javaFile -> {
                        try {
                            String fileName = javaFile.getFileName().toString();
                            String code = Files.readString(javaFile);

                            masterContent.append("### ").append(fileName).append("\n\n");
                            masterContent.append("```java\n");
                            masterContent.append(code).append("\n");
                            masterContent.append("```\n\n");
                        } catch (IOException e) {
                            System.err.println("Error reading " + javaFile + ": " + e.getMessage());
                        }
                    });

            masterContent.append("\n---\n\n"); // Visual separator between topics

        } catch (IOException e) {
            System.err.println("Error traversing files in " + packageName + ": " + e.getMessage());
        }
    }
}
```

### PasswordSanitizer.java

```java
package InterviewPrep.FileIO;

import java.util.ArrayList;
import java.util.List;

class PasswordSanitizer {
    // Filter passwords with condition that, password must have atleast 5 characters and should be aplhanumeric
    public static String filter(List<String> passwords) {
        List<String> validPass = new ArrayList<>();

        for (String password : passwords) { // <-- FIXED this line
            boolean isLongEnough = password.length() >= 5;
            boolean containsOnlyLet = password.matches("[a-zA-Z]+");
            boolean containsOnlyNum = password.matches("[0-9]+");
            boolean isMixed = !(containsOnlyLet || containsOnlyNum);

            if (isLongEnough && isMixed) {
                validPass.add(password);
            }
        }

        return String.join(" ", validPass);
    }

    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("peC1");
        passwords.add("pass@123");
        passwords.add("word@321");
        passwords.add("wordpass");
        passwords.add("987345");
        System.out.println(filter(passwords));
    }
}




```

### ReadLogs.java

```java
package InterviewPrep.FileIO;

import java.io.*;
import java.nio.file.Paths;

public class ReadLogs {
    public static void main(String[] args) {
        String inputFile = "src/test/resources/application.log";
        String outputFile = "src/test/resources/error.log";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("ERROR")) {
                    writer.write(currentLine);
                    writer.newLine();
                }
            }
            System.out.println("Successfully extracted error logs to: " + Paths.get(outputFile).toAbsolutePath());
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

```

### ReadLogsModern.java

```java
package InterviewPrep.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class ReadLogsModern {
    public static void main(String[] args) {
        Path inputFile = Paths.get("src/test/resources/application.log");
        Path outputFile = Paths.get("src/test/resources/error.log");
        try {
            List<String> errorLines = Files.lines(inputFile).filter(line -> line.contains("ERROR")).collect(Collectors.toList());
            Files.write(outputFile, errorLines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Successfully extracted error logs to: " + outputFile.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

```

### StudyGuideBundler.java

```java
package InterviewPrep.FileIO; // Or place it in a utility package

import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class StudyGuideBundler {

    // Update this path if necessary to match your project root
    private static final String BASE_PATH = "src/test/java/InterviewPrep";

    public static void main(String[] args) {
        // Pass the subpackage folder name here (case-sensitive to directory)
        bundleSubpackage("Array");
    }

    public static void bundleSubpackage(String subpackageName) {
        Path targetDir = Paths.get(BASE_PATH, subpackageName);
        Path guideFile = targetDir.resolve("GUIDE.md");
        Path outputFile = targetDir.resolve("BUNDLE_" + subpackageName + ".md");

        if (!Files.exists(targetDir) || !Files.isDirectory(targetDir)) {
            System.err.println("Directory does not exist: " + targetDir.toAbsolutePath());
            return;
        }

        StringBuilder content = new StringBuilder();

        // 1. Read existing GUIDE.md if it exists
        if (Files.exists(guideFile)) {
            try {
                content.append(Files.readString(guideFile)).append("\n\n");
            } catch (IOException e) {
                System.err.println("Failed to read GUIDE.md: " + e.getMessage());
            }
        } else {
            content.append("# ").append(subpackageName).append(" Revision Guide\n\n");
        }

        content.append("---\n\n## Java Source Code Solutions\n\n");

        // 2. Iterate through all .java files and append them
        try (Stream<Path> paths = Files.walk(targetDir, 1)) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(javaFile -> {
                        try {
                            String fileName = javaFile.getFileName().toString();
                            String code = Files.readString(javaFile);

                            content.append("### ").append(fileName).append("\n\n");
                            content.append("```java\n");
                            content.append(code).append("\n");
                            content.append("```\n\n");
                        } catch (IOException e) {
                            System.err.println("Could not read file: " + javaFile);
                        }
                    });

            // 3. Write bundled output file
            Files.writeString(outputFile, content.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Bundled guide successfully generated: " + outputFile.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error processing folder: " + e.getMessage());
        }
    }
}
```


---

# Topic: Graphs

## Notes & Concept Guide

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


## Code Solutions

### AccountsMerge.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsMerge {
    // QUESTION: Given a list of accounts where each element accounts[i] is a list of strings, where the first
    // element accounts[i][0] is a name, and the rest of the elements are emails representing emails of the account.
    // Merge all accounts that have the same email. After merging, return the accounts in the following format:
    // the first element of each account is the name, and the rest of the elements are emails in sorted order.
    // Example: Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],
    //                              ["John","johnsmith@mail.com","john00@mail.com"],
    //                              ["Mary","mary@mail.com"],
    //                              ["John","johnnybravo@mail.com"]]
    //          Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],
    //                   ["Mary","mary@mail.com"],
    //                   ["John","johnnybravo@mail.com"]]
    // Time Complexity: O(N * α(N)) where N is total emails and α is inverse Ackermann function
    // Space Complexity: O(N)

    private static Map<String, String> parent;
    private static Map<String, String> owner;
    private static Map<String, List<String>> unions;

    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        parent = new HashMap<>();
        owner = new HashMap<>();
        unions = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                parent.put(email, email);
                owner.put(email, name);
            }
        }

        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            for (int i = 2; i < account.size(); i++) {
                String email = account.get(i);
                union(firstEmail, email);
            }
        }

        for (String email : parent.keySet()) {
            String root = find(email);
            unions.computeIfAbsent(root, k -> new ArrayList<>()).add(email);
        }

        List<List<String>> result = new ArrayList<>();
        for (String root : unions.keySet()) {
            List<String> emails = unions.get(root);
            Collections.sort(emails);
            List<String> account = new ArrayList<>();
            account.add(owner.get(root));
            account.addAll(emails);
            result.add(account);
        }

        return result;
    }

    private static String find(String email) {
        if (!parent.get(email).equals(email)) {
            parent.put(email, find(parent.get(email)));
        }
        return parent.get(email);
    }

    private static void union(String email1, String email2) {
        String root1 = find(email1);
        String root2 = find(email2);
        if (!root1.equals(root2)) {
            parent.put(root1, root2);
        }
    }

    public static void main(String[] args) {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));

        List<List<String>> result = accountsMerge(accounts);
        System.out.println("Merged accounts:");
        for (List<String> account : result) {
            System.out.println(account);
        }
    }
}

```

### AlienDictionary.java

```java
package InterviewPrep.Graphs;

import java.util.*;

public class AlienDictionary {
    // QUESTION: There is a new alien language that uses the English alphabet. However, the order among the
    // letters is unknown to you. You are given a list of strings words from the alien language's dictionary,
    // where the strings in words are sorted lexicographically by the rules of this new language.
    // Derive the order of letters in this alien language. If the order is invalid, return "".
    // Example: Input: words = ["wrt","wrf","er","ett","rftt"]
    //          Output: "wertf"
    // Time Complexity: O(C) where C is total length of all words
    // Space Complexity: O(1) since alphabet size is constant (26)

    public static String alienOrder(String[] words) {
        // Build graph
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new HashSet<>());
                inDegree.putIfAbsent(c, 0);
            }
        }

        // Build edges by comparing adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            // Check for invalid case: word1 is prefix of word2 but longer
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return "";
            }

            int minLen = Math.min(word1.length(), word2.length());
            for (int j = 0; j < minLen; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if (c1 != c2) {
                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        inDegree.put(c2, inDegree.get(c2) + 1);
                    }
                    break;
                }
            }
        }

        // Topological sort using BFS
        Queue<Character> queue = new LinkedList<>();
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                queue.offer(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            result.append(c);

            for (char neighbor : graph.get(c)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Check if all characters are used (no cycle)
        if (result.length() != graph.size()) {
            return "";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] words1 = {"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println(alienOrder(words1)); // Output: "wertf"

        String[] words2 = {"z", "x"};
        System.out.println(alienOrder(words2)); // Output: "zx"

        String[] words3 = {"z", "x", "z"};
        System.out.println(alienOrder(words3)); // Output: "" (invalid)
    }
}

```

### CheapestFlightsWithinKStops.java

```java
package InterviewPrep.Graphs;

import java.util.*;

public class CheapestFlightsWithinKStops {
    // QUESTION: You are given a graph with n nodes labeled from 0 to n - 1, and an array of flights where
    // flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.
    // You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
    // If there is no such route, return -1.
    // Example: Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
    //          Output: 200
    // Time Complexity: O(n * k)
    // Space Complexity: O(n * k)

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Build adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] flight : flights) {
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        // Priority queue: [cost, city, stops]
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, src, 0});

        // Track minimum cost to reach each city with given stops
        int[][] minCost = new int[n][k + 2];
        for (int[] row : minCost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minCost[src][0] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0];
            int city = current[1];
            int stops = current[2];

            if (city == dst) return cost;
            if (stops > k) continue;

            for (int[] neighbor : graph.get(city)) {
                int nextCity = neighbor[0];
                int price = neighbor[1];
                int newCost = cost + price;

                if (newCost < minCost[nextCity][stops + 1]) {
                    minCost[nextCity][stops + 1] = newCost;
                    pq.offer(new int[]{newCost, nextCity, stops + 1});
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0, dst = 2, k = 1;
        System.out.println(findCheapestPrice(n, flights, src, dst, k)); // Output: 200

        int n2 = 3;
        int[][] flights2 = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src2 = 0, dst2 = 2, k2 = 0;
        System.out.println(findCheapestPrice(n2, flights2, src2, dst2, k2)); // Output: 500
    }
}

```

### CloneGraph.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    // QUESTION: Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
    // Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
    // Time Complexity: O(V + E) where V is vertices and E is edges
    // Space Complexity: O(V)

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public static Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> visited = new HashMap<>();
        return cloneGraphHelper(node, visited);
    }

    private static Node cloneGraphHelper(Node node, Map<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.val);
        visited.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraphHelper(neighbor, visited));
        }

        return clone;
    }

    public static void main(String[] args) {
        // Create graph: [[2,4],[1,3],[2,4],[1,3]]
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node cloned = cloneGraph(node1);
        System.out.println("Cloned graph root value: " + cloned.val); // Output: 1
        System.out.println("Cloned graph neighbors count: " + cloned.neighbors.size()); // Output: 2
    }
}

```

### CourseSchedule.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    // QUESTION: There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
    // You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take
    // course bi first if you want to take course ai. Return true if you can finish all courses, otherwise false.
    // Example: Input: numCourses = 2, prerequisites = [[1,0]]
    //          Output: true
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[numCourses]; // 0 = unvisited, 1 = visiting, 2 = visited

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adjList.get(prereq[1]).add(prereq[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, adjList, visited)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasCycle(int node, List<List<Integer>> adjList, int[] visited) {
        if (visited[node] == 1) return true; // Cycle detected
        if (visited[node] == 2) return false; // Already processed

        visited[node] = 1; // Mark as visiting

        for (int neighbor : adjList.get(node)) {
            if (hasCycle(neighbor, adjList, visited)) {
                return true;
            }
        }

        visited[node] = 2; // Mark as visited
        return false;
    }

    public static void main(String[] args) {
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(canFinish(numCourses1, prerequisites1)); // Output: true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println(canFinish(numCourses2, prerequisites2)); // Output: false
    }
}

```

### CourseScheduleII.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    // QUESTION: Return the ordering of courses you should take to finish all courses.
    // If it is impossible to finish all courses, return an empty array.
    // Example: Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
    //          Output: [0,2,1,3] or [0,1,2,3]
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adjList.get(prereq[1]).add(prereq[0]);
            inDegree[prereq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[index++] = course;

            for (int neighbor : adjList.get(course)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return index == numCourses ? result : new int[0];
    }

    public static void main(String[] args) {
        int numCourses1 = 4;
        int[][] prerequisites1 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] result1 = findOrder(numCourses1, prerequisites1);
        System.out.print("Course order: ");
        for (int course : result1) {
            System.out.print(course + " ");
        }
        System.out.println(); // Output: [0, 1, 2, 3] or [0, 2, 1, 3]

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        int[] result2 = findOrder(numCourses2, prerequisites2);
        System.out.println("Course order (cycle): " + result2.length); // Output: 0
    }
}

```

### CriticalConnections.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnections {
    // QUESTION: There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections
    // forming a network where connections[i] = [a, b] represents a connection between servers a and b.
    // Any server can reach any other server directly or indirectly through the network.
    // A critical connection is a connection that, if removed, will make some servers unable to reach some other server.
    // Return all critical connections in the network in any order.
    // Example: Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
    //          Output: [[1,3]]
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    private static List<List<Integer>> result;
    private static List<List<Integer>> graph;
    private static int[] disc;
    private static int[] low;
    private static int time;

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        result = new ArrayList<>();
        graph = new ArrayList<>();
        disc = new int[n];
        low = new int[n];
        time = 0;

        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        // Build adjacency list
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // DFS to find bridges
        dfs(0, -1);

        return result;
    }

    private static void dfs(int node, int parent) {
        disc[node] = low[node] = time++;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;

            if (disc[neighbor] == -1) {
                dfs(neighbor, node);
                low[node] = Math.min(low[node], low[neighbor]);

                // Check for bridge
                if (low[neighbor] > disc[node]) {
                    result.add(Arrays.asList(node, neighbor));
                }
            } else {
                low[node] = Math.min(low[node], disc[neighbor]);
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));

        List<List<Integer>> result = criticalConnections(n, connections);
        System.out.println("Critical connections:");
        for (List<Integer> connection : result) {
            System.out.println(connection);
        }
        // Output: [[1,3]]
    }
}

```

### NetworkDelayTime.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    // QUESTION: You are given a network of n nodes, labeled from 1 to n. You are given times, a list of travel times
    // as directed edges times[i] = (ui, vi, wi), where wi is the time it takes for a signal to travel from ui to vi.
    // We send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal.
    // If it is impossible for all n nodes to receive the signal, return -1.
    // Example: Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
    //          Output: 2
    // Time Complexity: O((V + E) log V)
    // Space Complexity: O(V + E)

    public static int networkDelayTime(int[][] times, int n, int k) {
        // Build adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] time : times) {
            int from = time[0];
            int to = time[1];
            int weight = time[2];
            graph.get(from).add(new int[]{to, weight});
        }

        // Dijkstra's algorithm
        int[] distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];

            if (dist > distances[node]) continue;

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                int newDist = dist + weight;

                if (newDist < distances[nextNode]) {
                    distances[nextNode] = newDist;
                    pq.offer(new int[]{nextNode, newDist});
                }
            }
        }

        // Find maximum distance
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (distances[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, distances[i]);
        }

        return maxTime;
    }

    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;
        System.out.println(networkDelayTime(times, n, k)); // Output: 2
    }
}

```

### NumberOfIslands.java

```java
package InterviewPrep.Graphs;

public class NumberOfIslands {
    // QUESTION: Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
    // return the number of islands. An island is surrounded by water and is formed by connecting adjacent
    // lands horizontally or vertically.
    // Example: Input: grid = [
    //   ["1","1","1","1","0"],
    //   ["1","1","0","1","0"],
    //   ["1","1","0","0","0"],
    //   ["0","0","0","0","0"]
    // ]
    //          Output: 1
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n) in worst case due to recursion stack

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0'; // Mark as visited

        // Visit all adjacent cells
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid1)); // Output: 1

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid2)); // Output: 3
    }
}

```

### PacificAtlanticWaterFlow.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    // QUESTION: There is an m x n rectangular island that borders both the Pacific and Atlantic oceans.
    // The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's
    // right and bottom edges. The island receives rain, and water flows to neighboring cells in 4 directions.
    // Return a 2D list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
    // Example: Input: heights = [
    //   [1,2,2,3,5],
    //   [3,2,3,4,4],
    //   [2,4,5,3,1],
    //   [6,7,1,4,5],
    //   [5,1,1,2,4]
    // ]
    //          Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n)

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return result;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // DFS from Pacific border (top and left)
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, pacific, heights[i][0]);
        }
        for (int j = 0; j < cols; j++) {
            dfs(heights, 0, j, pacific, heights[0][j]);
        }

        // DFS from Atlantic border (bottom and right)
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, cols - 1, atlantic, heights[i][cols - 1]);
        }
        for (int j = 0; j < cols; j++) {
            dfs(heights, rows - 1, j, atlantic, heights[rows - 1][j]);
        }

        // Find cells that can reach both oceans
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }

        return result;
    }

    private static void dfs(int[][] heights, int i, int j, boolean[][] visited, int prevHeight) {
        int rows = heights.length;
        int cols = heights[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || heights[i][j] < prevHeight) {
            return;
        }

        visited[i][j] = true;

        dfs(heights, i + 1, j, visited, heights[i][j]);
        dfs(heights, i - 1, j, visited, heights[i][j]);
        dfs(heights, i, j + 1, visited, heights[i][j]);
        dfs(heights, i, j - 1, visited, heights[i][j]);
    }

    public static void main(String[] args) {
        int[][] heights = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = pacificAtlantic(heights);
        System.out.println("Cells that can flow to both oceans:");
        for (List<Integer> cell : result) {
            System.out.println("[" + cell.get(0) + "," + cell.get(1) + "]");
        }
    }
}

```

### SurroundedRegions.java

```java
package InterviewPrep.Graphs;

public class SurroundedRegions {
    // QUESTION: Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally
    // surrounded by 'X'. A region is captured by flipping all 'O's into 'X's in that surrounded region.
    // Example: Input: board = [
    //   ["X","X","X","X"],
    //   ["X","O","O","X"],
    //   ["X","X","O","X"],
    //   ["X","O","X","X"]
    // ]
    //          Output: [
    //   ["X","X","X","X"],
    //   ["X","X","X","X"],
    //   ["X","X","X","X"],
    //   ["X","O","X","X"]
    // ]
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n) in worst case due to recursion stack

    public static void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        // Mark 'O's on the border and connected to border as safe
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
        }

        // Flip remaining 'O's to 'X' and restore safe 'O's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static void dfs(char[][] board, int i, int j) {
        int rows = board.length;
        int cols = board[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'S'; // Mark as safe

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        solve(board);

        System.out.println("Result:");
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

```

### ValidGraphPath.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidGraphPath {
    // QUESTION: There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1.
    // The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi]
    // denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge,
    // and no vertex has an edge to itself. Return true if there is a valid path from source to destination, or false otherwise.
    // Example: Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
    //          Output: true
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        // Build adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // DFS to find path
        Set<Integer> visited = new HashSet<>();
        return dfs(graph, source, destination, visited);
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, int current, int destination, Set<Integer> visited) {
        if (current == destination) return true;
        if (visited.contains(current)) return false;

        visited.add(current);

        for (int neighbor : graph.get(current)) {
            if (dfs(graph, neighbor, destination, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0, destination = 2;
        System.out.println(validPath(n, edges, source, destination)); // Output: true

        int n2 = 6;
        int[][] edges2 = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source2 = 0, destination2 = 5;
        System.out.println(validPath(n2, edges2, source2, destination2)); // Output: false
    }
}

```

### WordLadder.java

```java
package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    // QUESTION: A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence
    // of words beginWord -> s1 -> s2 -> ... -> sk such that every adjacent pair differs by a single letter.
    // Return the length of the shortest transformation sequence, or 0 if no such sequence exists.
    // Example: Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
    //          Output: 5 (hit -> hot -> dot -> dog -> cog)
    // Time Complexity: O(N * M^2) where N is number of words and M is word length
    // Space Complexity: O(N * M^2)

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                String currentWord = queue.poll();

                if (currentWord.equals(endWord)) {
                    return level;
                }

                char[] wordChars = currentWord.toCharArray();
                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;

                        wordChars[j] = c;
                        String newWord = new String(wordChars);

                        if (wordSet.contains(newWord)) {
                            queue.offer(newWord);
                            wordSet.remove(newWord);
                        }
                    }

                    wordChars[j] = originalChar;
                }
            }

            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        System.out.println(ladderLength(beginWord, endWord, wordList)); // Output: 5
    }
}

```


---

# Topic: HashMaps

## Notes & Concept Guide

# HashMaps & Frequency Problems - Interview Prep Guide

## Overview
This folder contains **11 problems** focused on hash-based data structures, frequency counting, and grouping patterns.

## Problem Categories

### 1. **Anagram Problems** (4 problems)
- `GroupAnagrams_4.java` - Group all anagrams together (IMPORTANT!)
- `GroupAnagrams.java` - Alternative approach
- `ValidAnagram_3.java` - Check if two strings are anagrams
- `AnagramCheck.java` - Basic anagram verification

**Techniques**:
- Sorting characters: Time O(n log n), Space O(n)
- HashMap: Time O(n), Space O(n)
- Character array (26 letters): Time O(n), Space O(1)

**Interview Focus**: Compare approaches, discuss tradeoffs

### 2. **Character Frequency** (4 problems)
- `CharacterFrequencyTest.java` - Count character occurrences
- `NonRepChar.java` - Non-repeating character
- `SecondMostFrequentChar.java` - Second most frequent
- `CharsRepeatedTwice.java` - Characters that repeat exactly twice

**Techniques**: HashMap, LinkedHashMap (for order), Array counting

### 3. **Integer/Element Frequency** (3 problems)
- `IntegerFrequency.java` - Count integer occurrences
- `ArrayElementFrequency.java` - Frequency of array elements
- `MaxMinOccurence.java` - Elements with max/min frequency

**Data Structures**: HashMap<Integer, Integer>, HashMap<Integer, List<Integer>>

### 4. **String Frequency** (1 problem)
- `SecondMostFrequentString.java` - Frequency in strings

---

## Key Techniques to Master

### 1. **HashMap for Frequency Counting**
```java
Map<Character, Integer> freq = new HashMap<>();
for (char c : str.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
}
```
**Use Case**: Anagrams, frequency counting, duplicates
**Time**: O(n), **Space**: O(k) where k = unique elements

### 2. **Sorting Approach**
```java
char[] chars = str.toCharArray();
Arrays.sort(chars);
String key = new String(chars);
```
**Use Case**: Grouping anagrams, checking anagrams
**Time**: O(n log n), **Space**: O(n)

### 3. **Character Array (Optimization)**
For lowercase English letters only:
```java
int[] freq = new int[26];
for (char c : str.toCharArray()) {
    freq[c - 'a']++;
}
```
**Time**: O(n), **Space**: O(1) - only 26 letters
**Advantage**: Faster than HashMap for this specific case

### 4. **LinkedHashMap for Order**
Maintain insertion order while counting:
```java
Map<Character, Integer> map = new LinkedHashMap<>();
```
**Use Case**: Finding first non-repeating character while maintaining order

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `AnagramCheck.java` - Basic anagram logic
- [ ] `CharacterFrequencyTest.java` - Simple frequency counting
- [ ] `IntegerFrequency.java` - Count occurrences
- [ ] `ValidAnagram_3.java` - String comparison method

### Medium Level
- [ ] `GroupAnagrams_4.java` - **MOST IMPORTANT** - Multiple approaches
- [ ] `NonRepChar.java` - First non-repeating
- [ ] `SecondMostFrequentChar.java` - Min heap approach
- [ ] `ArrayElementFrequency.java` - Map all elements

### Hard Level
- [ ] `MaxMinOccurence.java` - Complex frequency queries
- [ ] `SecondMostFrequentString.java` - Sorting frequencies

---

## Common Interview Questions

### 1. Check if Two Strings are Anagrams
**Problem**: Determine if str1 and str2 are anagrams
**Solutions**:
```
Approach 1: Sort and compare
- Time: O(n log n), Space: O(n)

Approach 2: Use HashMap
- Time: O(n), Space: O(1) for 26 letters

Approach 3: Character count array
- Time: O(n), Space: O(1)
```
**See**: `ValidAnagram_3.java`

### 2. Group Anagrams
**Problem**: Given array of strings, group anagrams together
**Key Insight**: Anagrams have same sorted characters
**Solution Strategy**:
1. Sort each word's characters
2. Use as HashMap key
3. Group words by key
**See**: `GroupAnagrams_4.java` (has multiple approaches!)

### 3. Find First Non-Repeating Character
**Problem**: Return first character that appears only once
**Solution**:
1. Count all frequencies (HashMap)
2. Iterate through string to maintain order
3. Return first char with count = 1
**See**: `NonRepChar.java`

### 4. Character Frequency Analysis
**Problem**: Analyze character distribution
**Applications**:
- Frequency analysis in cryptography
- Data compression analysis
- Natural language processing
**See**: `CharacterFrequencyTest.java`

---

## Comparison of Approaches

### For Anagram Detection:

| Approach | Time | Space | Pros | Cons |
|----------|------|-------|------|------|
| Sort | O(n log n) | O(n) | Simple | Slower |
| HashMap | O(n) | O(k) | Fast | More code |
| Array[26] | O(n) | O(1) | Fastest, fixed space | English only |
| Compare counts | O(n) | O(k) | Most readable | Still O(n) |

**Interview Recommendation**: Mention all three, implement HashMap approach for O(n) complexity

---

## Related Files

**String folder has related problems:**
- `PermutationInString.java` - Similar to anagram detection
- `LongestUniqueCharSubstring.java` - Uses frequency map

**Array folder:**
- `ArrayElementFrequency.java` - Similar frequency concept

---

## Code Patterns to Remember

### Pattern 1: Count Frequency
```java
Map<T, Integer> freq = new HashMap<>();
for (T item : collection) {
    freq.put(item, freq.getOrDefault(item, 0) + 1);
}
```

### Pattern 2: Group by Key
```java
Map<K, List<V>> groups = new HashMap<>();
for (V value : values) {
    K key = getKey(value);
    groups.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
}
```

### Pattern 3: Find Most Frequent
```java
Map<T, Integer> freq = getFrequency(items);
T mostFrequent = freq.entrySet().stream()
    .max(Comparator.comparingInt(Map.Entry::getValue))
    .map(Map.Entry::getKey)
    .orElse(null);
```

---

## Time Complexity Reference

| Problem | Time | Space | Approach |
|---------|------|-------|----------|
| Anagram Check | O(n) | O(1) | Array[26] |
| Valid Anagram | O(n) | O(1) | Freq count |
| Group Anagrams | O(n·m log m) | O(n) | Sort + HashMap |
| First Non-Rep | O(n) | O(k) | HashMap |
| Frequency Count | O(n) | O(k) | HashMap |
| Most Frequent | O(n) | O(k) | HashMap + Max |

*n = string/array length, m = average word length, k = unique elements*

---

## Practice Tips

### When to use HashMap vs Array:
- **HashMap**: When you don't know character range
- **Array[26]**: When you know it's only a-z
- **Array[256]**: For extended ASCII
- **Array[128]**: For basic ASCII

### Interview Strategy:
1. Start with simple sorting approach
2. Mention time complexity: O(n log n)
3. Optimize to HashMap: O(n)
4. Further optimize to array: O(n) with O(1) space
5. Discuss which is best depending on context

### Common Mistakes:
- Forgetting `getOrDefault()` method
- Not handling case sensitivity (uppercase vs lowercase)
- Not considering Unicode characters
- Inefficient iteration order

---

Generated: Interview Prep Package - HashMaps Folder



## Code Solutions

### ArrayElementFrequency.java

```java
package InterviewPrep.HashMaps;

import java.util.HashMap;

// QUESTION: Given an array of integers, count the frequency of each element and print the result.
// Example: Input: [1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3] -> Output: 1: 2, 2: 4, 3: 3, 4: 2

public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        for (int element : frequencyMap.keySet()) {
            System.out.println(element + ": " + frequencyMap.get(element));
        }
    }
}


```

### CharacterFrequencyTest.java

```java
package InterviewPrep.HashMaps;

public class CharacterFrequencyTest {
    // QUESTION: Given a string, calculate the frequency of each character and print the results.
    // Example: Input: "Picture Perfect" -> Output: P: 2, i: 1, c: 2, t: 2, u: 1, r: 2, e: 3, f: 1, : 1
    //t:O(n),s:O(1)
    public static void main(String[] args) {
        calculateFrequency("Picture Perfect");
    }

    public static void calculateFrequency(String str) {
        int[] countArr = new int[256];
        char[] arr = str.toCharArray();
        for (char c : arr) {
            countArr[c]++;
        }
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) System.out.println((char) i + " :" + countArr[i]);
        }
    }
}

```

### GroupAnagrams.java

```java
package InterviewPrep.HashMaps;

import java.util.*;

// QUESTION: Given an array of strings, group the anagrams together. An anagram is a word or phrase
// formed by rearranging the letters of a different word or phrase.
// Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//          Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println("Brute Force Approach (O(n²)):");
        List<List<String>> result1 = groupAnagramsBruteForce(arr.clone());
        for (List<String> group : result1) {
            System.out.println(group);
        }

        System.out.println("\nOptimized Approach (O(n*k log k)):");
        List<List<String>> result2 = groupAnagramsOptimized(arr);
        for (List<String> group : result2) {
            System.out.println(group);
        }
    }

    /**
     * Approach 1: Brute Force
     * Time Complexity: O(n² * k log k) where n is number of strings, k is avg string length
     * Space Complexity: O(n)
     * Use when interviewer asks NOT to use HashMap
     */
    public static List<List<String>> groupAnagramsBruteForce(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> anagrams = new ArrayList<>();
            if (strs[i] != null) {
                char[] sortedWordArray = strs[i].toCharArray();
                Arrays.sort(sortedWordArray);
                anagrams.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null) {
                        char[] sortedWordArray1 = strs[j].toCharArray();
                        Arrays.sort(sortedWordArray1);
                        if (Arrays.equals(sortedWordArray, sortedWordArray1)) {
                            anagrams.add(strs[j]);
                            strs[j] = null;
                        }
                    }
                }
                result.add(anagrams);
            }
        }
        return result;
    }

    /**
     * Approach 2: HashMap with Sorted Keys
     * Time Complexity: O(n * k log k) where n is number of strings, k is avg string length
     * Space Complexity: O(n)
     * Use when HashMap is allowed
     */
    public static List<List<String>> groupAnagramsOptimized(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}

```

### IntegerFrequency.java

```java
package InterviewPrep.HashMaps;

public class IntegerFrequency {
    // QUESTION: Given an array of integers, count the frequency of each element and print the results.
    // Do not use additional data structures like HashMap.
    // Example: Input: [1, 2, 3, 1, 2, 3, 4, 44] -> Output: Count of 1 is 2, Count of 2 is 2, etc.
    //Time:O(n2)
    //Space:O(n)
    public static void countOccurrences(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1; // Include the current element itself
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println("Count of " + arr[i] + " is " + count);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 44};
        countOccurrences(arr);
    }
}

```

### MaxMinOccurence.java

```java
package InterviewPrep.HashMaps;

public class MaxMinOccurence {
// QUESTION: Given a string, find the character with the maximum frequency and the character
// with the minimum frequency (excluding characters that don't appear).
// Example: Input: "TeeeessstAutooooooomationn" -> Output: o: 8, m: 1

    public static void main(String[] args) {
        maxMinOccurence();
    }

    static void maxMinOccurence() {
        int[] counter = new int[256];
        for (char c : "TeeeessstAutooooooomationn".toCharArray()) {
            counter[c]++;
        }

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > maxCount) {
                maxCount = counter[i];
                maxChar = (char) i;
            }
            if (counter[i] >= 1 && counter[i] < minCount) {
                minCount = counter[i];
                minChar = (char) i;
            }
        }
        System.out.println(maxChar + ": " + maxCount);
        System.out.println(minChar + ": " + minCount);
    }
}

```

### NonRepChar.java

```java
package InterviewPrep.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class NonRepChar {
    // QUESTION: Given a string s, find the first non-repeating character in it and return its index.
    // If it does not exist, return -1.
    // Example: Input: "geeksforgeeks" -> Output: 5 (character 'f' at index 5)

    public static void main(String[] args) {
        System.out.println(nonRepCharWithMap("geeksforgeeks"));
        System.out.println(nonRepChar("geeksforgeeks"));
    }

    //Time Complexity: O(N)
    //Space Complexity: O(N)
    public static int nonRepCharWithMap(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        for (Character c : str.toLowerCase().toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) return i;
        }
        return -1;
    }

    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public static int nonRepChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

```

### SecondMostFrequentChar.java

```java
package InterviewPrep.HashMaps;

public class SecondMostFrequentChar {
    // QUESTION: Given a string, find the second most frequent character in it.
    // Example: Input: "banana" -> Output: 'n' (b:1, a:3, n:2)
    public static void main(String[] args) {
        String name = "banana";
        char[] arr = name.toCharArray();
        int[] counter = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int loopCount = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    loopCount++;
                    counter[j] = -1;
                }
            }
            if (counter[i] != -1) {
                counter[i] = loopCount;
            }
        }

        int largest = 0;
        int secLar = 0;

        for (int i = 0; i < arr.length; i++) {
            if (counter[i] > counter[largest]) {
                secLar = largest;
                largest = i;
            } else if (counter[i] > counter[secLar] && counter[i] != counter[largest]) {
                secLar = i;
            }
        }

        System.out.println("Second most frequent character: " + arr[secLar]);
    }
}


```

### SecondMostFrequentString.java

```java
package InterviewPrep.HashMaps;

import java.util.HashMap;
import java.util.Map;

// QUESTION: Given a string of space-separated words, find the second most frequent word in the string.
// If there is no second most frequent word (i.e., all words have the same frequency), return null.
// Example: Input: "apple banana apple orange banana apple banana grape banana orange orange"
//          Output: "orange" (frequency 3, while "banana" has frequency 4 and "apple" has frequency 3)
public class SecondMostFrequentString {
    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple banana grape banana orange orange";
        String[] words=input.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        frequencyMap.forEach((word, frequency) -> System.out.println(word + ": " + frequency));
        String secondMostFrequent = getSecondMostFrequent(frequencyMap);
        System.out.println("Second most frequent string: " + secondMostFrequent);
    }

    private static String getSecondMostFrequent(Map<String, Integer> frequencyMap) {
        String secondMostFrequent = null;
        int secondMaxFrequency = 0;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                secondMostFrequent = word;
                maxFrequency = frequency;
            } else if (frequency > secondMaxFrequency && frequency < maxFrequency) {
                secondMaxFrequency = frequency;
                secondMostFrequent = word;
            }
        }
        return secondMostFrequent;
    }
}


```

### ValidAnagram.java

```java
package InterviewPrep.HashMaps;

import org.testng.Assert;

import java.util.Arrays;

// QUESTION: Given two strings, determine if they are anagrams of each other.
// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
public class ValidAnagram {

    public static void main(String[] args) {
        // Basic anagram check
        Assert.assertTrue(isAnagramSorting("anagram", "nagaram"));
        Assert.assertTrue(isAnagramFrequency("anagram", "nagaram"));

        // Anagram with spaces and case-insensitive
        Assert.assertTrue(isAnagramWithSpaces("Saurav is Singh Hexaware", "Singh Saurav Hexaware is"));
    }

    /**
     * Approach 1: Sorting
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     * Use when interviewer asks NOT to use extra data structures
     */
    public static boolean isAnagramSorting(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        return Arrays.equals(arrayS, arrayT);
    }

    /**
     * Approach 2: Frequency Array
     * Time Complexity: O(n)
     * Space Complexity: O(1) - fixed size array of 26
     * Use when only lowercase letters are involved
     */
    public static boolean isAnagramFrequency(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }

    /**
     * Approach 3: Sorting with space/ignore handling
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     * Use when strings contain spaces and need case-insensitive comparison
     */
    public static boolean isAnagramWithSpaces(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}


```


---

# Topic: Heaps

## Notes & Concept Guide

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


## Code Solutions

### FindMedianFromDataStream.java

```java
package InterviewPrep.Heaps;

import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    // QUESTION: The median is the middle value in an ordered integer list. If the size of the list is even,
    // there is no middle value and the median is the mean of the two middle values.
    // Implement the MedianFinder class with addNum and findMedian methods.
    // Time Complexity: O(log n) for addNum, O(1) for findMedian
    // Space Complexity: O(n)

    private PriorityQueue<Integer> maxHeap; // Left half (smaller numbers)
    private PriorityQueue<Integer> minHeap; // Right half (larger numbers)

    public FindMedianFromDataStream() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max heap
        minHeap = new PriorityQueue<>(); // Min heap
    }

    public void addNum(int num) {
        // Add to max heap first
        maxHeap.offer(num);

        // Balance: ensure max of maxHeap <= min of minHeap
        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        // Balance sizes
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); // Output: 1.5
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); // Output: 2.0
    }
}

```

### KLargestElements.java

```java
package InterviewPrep.Heaps;

import java.util.PriorityQueue;

public class KLargestElements {
    // QUESTION: Given an integer array nums and an integer k, return the k largest elements in the array.
    // Example: Input: nums = [3,2,1,5,6,4], k = 2
    //          Output: [5,6] or [6,5]
    // Time Complexity: O(n log k)
    // Space Complexity: O(k)

    public static int[] findKLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        // Min heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int[] result = findKLargest(nums, k);
        System.out.print("K largest elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [5, 6]
    }
}

```

### MeetingRoomsII.java

```java
package InterviewPrep.Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    // QUESTION: Given an array of meeting time intervals intervals where intervals[i] = [start_i, end_i],
    // return the minimum number of conference rooms required.
    // Example: Input: intervals = [[0,30],[5,10],[15,20]]
    //          Output: 2
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Min heap to track end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // If the current meeting starts after or when the earliest meeting ends
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll(); // Free up a room
            }
            minHeap.offer(intervals[i][1]); // Allocate a room
        }

        return minHeap.size();
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals1)); // Output: 2

        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(minMeetingRooms(intervals2)); // Output: 1
    }
}

```

### MergeKSortedLists.java

```java
package InterviewPrep.Heaps;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    // QUESTION: You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
    // Merge all the linked-lists into one sorted linked-list and return it.
    // Example: Input: lists = [[1,4,5],[1,3,4],[2,6]]
    //          Output: [1,1,2,3,4,4,5,6]
    // Time Complexity: O(n log k) where n is total nodes and k is number of lists
    // Space Complexity: O(k)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min heap based on node value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add first node of each list
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create lists: [[1,4,5],[1,3,4],[2,6]]
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {list1, list2, list3};
        ListNode merged = mergeKLists(lists);

        System.out.print("Merged list: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        System.out.println(); // Output: 1 1 2 3 4 4 5 6
    }
}

```

### SlidingWindowMaximum.java

```java
package InterviewPrep.Heaps;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    // QUESTION: You are given an array of integers nums, there is a sliding window of size k moving from the
    // very left of the array to the very right. You can only see the k numbers in the window. Return the
    // max sliding window.
    // Example: Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    //          Output: [3,3,5,5,6,7]
    // Time Complexity: O(n log k)
    // Space Complexity: O(k)

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Max heap: store [value, index]
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            // Add current element to heap
            maxHeap.offer(new int[]{nums[i], i});

            // Remove elements outside the window
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }

            // Start recording results when window is full
            if (i >= k - 1) {
                result[i - k + 1] = maxHeap.peek()[0];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        System.out.print("Sliding window maximum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 3 3 5 5 6 7
    }
}

```

### TaskScheduler.java

```java
package InterviewPrep.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    // QUESTION: Given a characters array tasks, representing the tasks a CPU needs to do, where each letter
    // represents a different task. Tasks could be done in any order. Each task is done in one unit of time.
    // For each unit of time, the CPU could complete either one task or just be idle. However, there is a
    // non-negative integer n that represents the cooldown period between two same tasks. Return the least
    // number of units of times that the CPU will take to finish all the given tasks.
    // Example: Input: tasks = ["A","A","A","B","B","B"], n = 2
    //          Output: 8 (A -> B -> idle -> A -> B -> idle -> A -> B)
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)

    public static int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) return 0;

        // Count frequency of each task
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char task : tasks) {
            frequencyMap.put(task, frequencyMap.getOrDefault(task, 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(frequencyMap.values());

        int intervals = 0;

        while (!maxHeap.isEmpty()) {
            int cycle = n + 1;
            int tasksExecuted = 0;
            java.util.List<Integer> temp = new java.util.ArrayList<>();

            // Execute tasks in the cycle
            while (cycle-- > 0 && !maxHeap.isEmpty()) {
                int freq = maxHeap.poll();
                if (freq > 1) {
                    temp.add(freq - 1);
                }
                tasksExecuted++;
            }

            // Add remaining tasks back to heap
            maxHeap.addAll(temp);

            // If heap is not empty, we need idle time
            intervals += maxHeap.isEmpty() ? tasksExecuted : n + 1;
        }

        return intervals;
    }

    public static void main(String[] args) {
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(leastInterval(tasks1, 2)); // Output: 8

        char[] tasks2 = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(leastInterval(tasks2, 0)); // Output: 6
    }
}

```

### TopKFrequentElements.java

```java
package InterviewPrep.Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    // QUESTION: Given an integer array nums and an integer k, return the k most frequent elements.
    // You may return the answer in any order.
    // Example: Input: nums = [1,1,1,2,2,3], k = 2
    //          Output: [1,2]
    // Time Complexity: O(n log k)
    // Space Complexity: O(n)

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        // Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> frequencyMap.get(a) - frequencyMap.get(b)
        );

        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.print("Top K frequent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [1, 2]
    }
}

```


---

# Topic: Intervals

## Notes & Concept Guide

# Intervals Problems - Interview Prep Guide

## Overview
This folder contains **5 problems** focused on interval manipulation, covering merging, insertion, scheduling, and interval-based algorithms.

## Problem Categories

### 1. **Interval Merging** (1 problem)
- `MergeIntervals.java` - Merge overlapping intervals

**Technique**: Sort by start time + merge
**Time Complexity**: O(n log n), **Space Complexity**: O(1)

### 2. **Interval Insertion** (1 problem)
- `InsertInterval.java` - Insert new interval into merged intervals

**Technique**: Find overlapping region + merge
**Interview Frequency**: Very Common

### 3. **Meeting/Scheduling Problems** (2 problems)
- `MeetingRooms.java` - Check if person can attend all meetings
- `NonOverlappingIntervals.java` - Minimum intervals to remove

**Applications**: Calendar scheduling, resource allocation

### 4. **Advanced Interval Problems** (1 problem)
- `EmployeeFreeTime.java` - Find free time between schedules

**Technique**: Merge all intervals + find gaps

---

## Key Techniques to Master

### 1. **Merge Intervals Pattern**
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> merged = new ArrayList<>();
int[] current = intervals[0];

for (int i = 1; i < intervals.length; i++) {
    if (current[1] >= intervals[i][0]) {
        current[1] = Math.max(current[1], intervals[i][1]);
    } else {
        merged.add(current);
        current = intervals[i];
    }
}
merged.add(current);
```
**Use Case**: Merging overlapping intervals
**Time**: O(n log n), **Space**: O(n)

### 2. **Insert Interval Pattern**
```java
List<int[]> result = new ArrayList<>();
int i = 0;
// Add intervals before newInterval
while (i < n && intervals[i][1] < newInterval[0]) {
    result.add(intervals[i++]);
}
// Merge overlapping intervals
while (i < n && intervals[i][0] <= newInterval[1]) {
    newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
    newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
}
result.add(newInterval);
// Add remaining intervals
while (i < n) result.add(intervals[i++]);
```
**Use Case**: Inserting into sorted intervals
**Time**: O(n), **Space**: O(n)

### 3. **Sweep Line Technique**
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
int count = 0, maxCount = 0;
for (int[] interval : intervals) {
    count++; // Start
    if (interval[1] < nextStart) count--; // End
    maxCount = Math.max(maxCount, count);
}
```
**Use Case**: Finding maximum overlapping intervals
**Time**: O(n log n), **Space**: O(1)

### 4. **Greedy for Non-Overlapping**
```java
Arrays.sort(intervals, (a, b) -> a[1] - b[1]); // Sort by end time
int count = 0, prevEnd = intervals[0][1];
for (int i = 1; i < intervals.length; i++) {
    if (intervals[i][0] < prevEnd) {
        count++; // Overlapping, remove
    } else {
        prevEnd = intervals[i][1];
    }
}
```
**Use Case**: Minimum removals for non-overlapping
**Time**: O(n log n), **Space**: O(1)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `MeetingRooms.java` - Basic overlap check
- [ ] `MergeIntervals.java` - **MOST IMPORTANT** - Merging pattern

### Medium Level
- [ ] `InsertInterval.java` - Insertion pattern
- [ ] `NonOverlappingIntervals.java` - Greedy approach

### Hard Level
- [ ] `EmployeeFreeTime.java` - Advanced merging

---

## Common Interview Questions

### 1. Merge Intervals
**Problem**: Merge overlapping intervals
**Solution**: Sort by start time, merge overlapping
**See**: `MergeIntervals.java`

### 2. Insert Interval
**Problem**: Insert new interval into sorted intervals
**Key Insight**: Find overlap region, merge, add remaining
**See**: `InsertInterval.java`

### 3. Meeting Rooms
**Problem**: Check if person can attend all meetings
**Strategy**: Sort by start time, check for overlaps
**See**: `MeetingRooms.java`

### 4. Non-Overlapping Intervals
**Problem**: Minimum intervals to remove for non-overlapping
**Technique**: Sort by end time, greedy selection
**See**: `NonOverlappingIntervals.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Merge Intervals | O(n log n) | O(n) | Sort + merge |
| Insert Interval | O(n) | O(n) | Linear scan |
| Meeting Rooms | O(n log n) | O(1) | Sort + check |
| Non-Overlapping | O(n log n) | O(1) | Greedy |
| Employee Free Time | O(n log k) | O(k) | Heap |

*n = number of intervals, k = number of employees*

---

## Related Files

**Array folder:**
- Similar sorting and merging patterns

**Heaps folder:**
- Heap-based interval scheduling

---

## Code Patterns to Remember

### Pattern 1: Merge Intervals
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> merged = new ArrayList<>();
int[] current = intervals[0];
for (int i = 1; i < intervals.length; i++) {
    if (current[1] >= intervals[i][0]) {
        current[1] = Math.max(current[1], intervals[i][1]);
    } else {
        merged.add(current);
        current = intervals[i];
    }
}
merged.add(current);
```

### Pattern 2: Check Overlaps
```java
boolean hasOverlap(int[] a, int[] b) {
    return a[1] >= b[0] && b[1] >= a[0];
}
```

### Pattern 3: Greedy Selection
```java
Arrays.sort(intervals, (a, b) -> a[1] - b[1]); // Sort by end
int count = 0, lastEnd = intervals[0][1];
for (int i = 1; i < intervals.length; i++) {
    if (intervals[i][0] < lastEnd) count++;
    else lastEnd = intervals[i][1];
}
```

---

## Practice Tips

### When to use Sorting:
- **Merge intervals**: Always sort by start time first
- **Non-overlapping**: Sort by end time for greedy
- **Meeting rooms**: Sort by start time for overlap check

### Common Interval Patterns:
- **Merge**: Sort by start, merge overlapping
- **Insert**: Find overlap region, merge, add rest
- **Overlap check**: a.end >= b.start && b.end >= a.start
- **Gap finding**: Merge all, find spaces between

### Common Mistakes:
- Not sorting intervals before processing
- Incorrect overlap condition
- Off-by-one errors in interval boundaries
- Not handling edge cases (empty, single interval)

---

Generated: Interview Prep Package - Intervals Folder


## Code Solutions

### EmployeeFreeTime.java

```java
package InterviewPrep.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class EmployeeFreeTime {
    // QUESTION: We are given a list schedule of employees, which represents the working time for each employee.
    // Each employee has a list of non-overlapping Intervals, and they are in sorted order. Return the list of
    // finite intervals representing common, positive-length free time for all employees.
    // Example: Input: schedule = [[[1,2],[5,6]],[[1,3]],[[4,10]]]
    //          Output: [[3,4]]
    // Time Complexity: O(n log k) where n is total intervals and k is number of employees
    // Space Complexity: O(k)

    public static List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> result = new ArrayList<>();
        if (schedule == null || schedule.isEmpty()) return result;

        // Min heap based on start time
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.start - b.start);

        // Add all intervals to heap
        for (List<Interval> employee : schedule) {
            minHeap.addAll(employee);
        }

        Interval prev = minHeap.poll();

        while (!minHeap.isEmpty()) {
            Interval current = minHeap.poll();

            // If there's a gap between intervals, it's free time
            if (prev.end < current.start) {
                result.add(new Interval(prev.end, current.start));
                prev = current;
            } else {
                // Overlapping intervals, merge them
                prev.end = Math.max(prev.end, current.end);
            }
        }

        return result;
    }

    public static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + "," + end + "]";
        }
    }

    public static void main(String[] args) {
        List<List<Interval>> schedule = new ArrayList<>();
        schedule.add(Arrays.asList(new Interval(1, 2), new Interval(5, 6)));
        schedule.add(Arrays.asList(new Interval(1, 3)));
        schedule.add(Arrays.asList(new Interval(4, 10)));

        List<Interval> result = employeeFreeTime(schedule);
        System.out.println("Employee free time: " + result); // Output: [[3,4]]
    }
}

```

### InsertInterval.java

```java
package InterviewPrep.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    // QUESTION: Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
    // Example: Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
    //          Output: [[1,5],[6,9]]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = insert(intervals, newInterval);
        System.out.println("Result after insertion:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output: [[1,5],[6,9]]
    }
}

```

### MeetingRooms.java

```java
package InterviewPrep.Intervals;

import java.util.Arrays;

public class MeetingRooms {
    // QUESTION: Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person
    // could attend all meetings.
    // Example: Input: intervals = [[0,30],[5,10],[15,20]]
    //          Output: false
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)

    public static boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) return true;

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            // Check if current meeting starts before previous meeting ends
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttendMeetings(intervals1)); // Output: false

        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(canAttendMeetings(intervals2)); // Output: true
    }
}

```

### MergeIntervals.java

```java
package InterviewPrep.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    // QUESTION: Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
    // and return an array of the non-overlapping intervals that cover all the intervals in the input.
    // Example: Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //          Output: [[1,6],[8,10],[15,18]]
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][0];

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // Check if intervals overlap
            if (current[1] >= next[0]) {
                // Merge intervals
                current[1] = Math.max(current[1], next[1]);
            } else {
                // Add current interval and move to next
                merged.add(current);
                current = next;
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        // Output: [[1,6],[8,10],[15,18]]
    }
}

```

### NonOverlappingIntervals.java

```java
package InterviewPrep.Intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    // QUESTION: Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number
    // of intervals you need to remove to make the rest of the intervals non-overlapping.
    // Example: Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
    //          Output: 1 (remove [1,3])
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // Overlapping interval, need to remove one
                count++;
            } else {
                // Non-overlapping, update prevEnd
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals1)); // Output: 1

        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        System.out.println(eraseOverlapIntervals(intervals2)); // Output: 2
    }
}

```


---

# Topic: LinkedList

## Notes & Concept Guide

# LinkedList Problems - Interview Prep Guide

## Overview
This folder contains **5 problems** focused on linked list data structures, covering basic operations, advanced manipulations, and algorithmic patterns.

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

### 3. **Advanced Operations** (2 problems)
- `MergeSortedLists.java` - Merge two sorted linked lists
- `CustomLinkedList.java` - Custom linked list implementation

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


## Code Solutions

### CustomLinkedList.java

```java
package InterviewPrep.LinkedList;

// QUESTION: Implement a custom linked list with the following operations:
// - Add a node at the end
// - Remove the first node
// - Remove the last node
// - Remove a node at a specific index
// - Delete all nodes with a specific key value
// - Print the list
public class CustomLinkedList {
    int length;
    private Node head;
    private Node tail;

    public CustomLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public void add(int value) {
        Node node = new Node(value);
        if (length < 1) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public void removeFirst() {
        if (length <= 0)
            return;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
    }

    public void removeLast() {
        if (length <= 0)
            return;
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        length--;
    }

    public void remove(int index) {
        if (length <= 0)
            return;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete.next = null;
        length--;

    }

    public void deleteKey(int key) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.value == key) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }
}


```

### LinkedListDeleteAllChar.java

```java
package InterviewPrep.LinkedList;

public class LinkedListDeleteAllChar {
    // QUESTION: Given a linked list and a key, delete all occurrences of the given key in the linked list.
    // Example: Input: 3 -> 3 -> 6 -> 9 -> 3 -> NULL, key = 3
    //          Output: 6 -> 9 -> NULL

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.printList();
        System.out.println("----------------------------");
        list.deleteKey(10);
        list.printList();
    }
}

```

### LL.java

```java
package InterviewPrep.LinkedList;

public class LL {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    static class SinglyLinkedList {
        Node head, tail;

        public SinglyLinkedList() {
            head = null;
            tail = null;
        }

        public void insertAtHead(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public void insertAtTail(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
                return;
            }
            tail.next = node;
            tail = node;
        }

        public void deleteValue(int value) {
            if (head == null) return;

            if (head.value == value) {
                if (head == tail) tail = null;
                head = head.next;
                return;
            }

            Node p1 = head;
            Node p2 = null;

            while (p1 != null) {
                if (p1.value == value) {
                    if (p1 == tail) tail = p2;
                    p2.next = p1.next;
                    return;
                }
                p2 = p1;
                p1 = p1.next;
            }
        }

        public void print() {
            Node p1 = head;
            while (p1 != null) {
                System.out.print(p1.value + " -> ");
                p1 = p1.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(0);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);

        System.out.println("Initial list:");
        list.print();

        System.out.println("Deleting 2:");
        list.deleteValue(2);
        list.print();

        System.out.println("Deleting 0 (Head):");
        list.deleteValue(0);
        list.print();
    }
}
```

### MergeSortedLists.java

```java
package InterviewPrep.LinkedList;

public class MergeSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode tail = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return mergedList.next;
    }

    public static void main(String[] args) {
        MergeSortedLists solution = new MergeSortedLists();

        // Create sample sorted lists
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge the lists

        // Print the merged list
        ListNode current = solution.mergeTwoSortedLists(list1, list2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Add a newline for better readability.

        //Test case 2: Empty lists
        ListNode empty1 = null;
        ListNode empty2 = null;

        current = solution.mergeTwoSortedLists(empty1, empty2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        //Test case 3: One empty list
        ListNode list3 = new ListNode(5, new ListNode(6, new ListNode(7)));
        current = solution.mergeTwoSortedLists(list3, null);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

```

### OddEvenLinkedList.java

```java
package InterviewPrep.LinkedList;

public class OddEvenLinkedList {
    // QUESTION: Given the head of a singly linked list, group all the nodes with odd indices together followed
    // by the nodes with even indices, and return the reordered list. The first node is considered odd.
    // Example: Input: head = [1,2,3,4,5]
    //          Output: [1,3,5,2,4]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        ListNode result = oddEvenList(head);
        System.out.print("Odd-Even grouped: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println(); // Output: 1 3 5 2 4
    }
}

```

### PalindromeLinkedList.java

```java
package InterviewPrep.LinkedList;

public class PalindromeLinkedList {
    // QUESTION: Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
    // Example: Input: head = [1,2,2,1]
    //          Output: true
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        // Compare first half with reversed second half
        boolean result = true;
        ListNode secondHalfCopy = secondHalf;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the list (optional)
        reverseList(secondHalfCopy);

        return result;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(head1)); // Output: true

        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println(isPalindrome(head2)); // Output: false
    }
}

```

### RemoveNthFromEnd.java

```java
package InterviewPrep.LinkedList;

public class RemoveNthFromEnd {
    // QUESTION: Given the head of a linked list, remove the nth node from the end of the list and return its head.
    // Example: Input: head = [1,2,3,4,5], n = 2
    //          Output: [1,2,3,5]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove nth node from end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        ListNode result = removeNthFromEnd(head, 2);
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println(); // Output: 1 2 3 5
    }
}

```

### ReorderList.java

```java
package InterviewPrep.LinkedList;

public class ReorderList {
    // QUESTION: You are given the head of a singly linked-list. The list can be represented as:
    // L0 → L1 → … → Ln - 1 → Ln. Reorder the list to be on the following form:
    // L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
    // Example: Input: head = [1,2,3,4]
    //          Output: [1,4,2,3]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        // Merge two halves
        while (secondHalf.next != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        
        reorderList(head);
        System.out.print("Reordered: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println(); // Output: 1 4 2 3
    }
}

```

### ReverseLinkedList.java

```java
package InterviewPrep.LinkedList;

public class ReverseLinkedList {
    // QUESTION: Given the head of a singly linked list, reverse the list, and return the reversed list.
    // Example: Input: head = [1,2,3,4,5]
    //          Output: [5,4,3,2,1]
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Iterative solution
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Recursive solution
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversed = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        ListNode reversed = reverseList(head);
        System.out.print("Reversed (iterative): ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        System.out.println();

        // Test recursive
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reversed2 = reverseListRecursive(head2);
        System.out.print("Reversed (recursive): ");
        while (reversed2 != null) {
            System.out.print(reversed2.val + " ");
            reversed2 = reversed2.next;
        }
        System.out.println();
    }
}

```


---

# Topic: Math

## Notes & Concept Guide

# Math Problems - Interview Prep Guide

## Overview
This folder contains **11 problems** focused on mathematical algorithms and number theory problems.

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
- `AddOneToNumberTest.java` - Add 1 to number array

**Techniques**:
- Bit manipulation for binary operations
- Modulo/division for digit operations
- Array manipulation for number representation

### 5. **Advanced Math** (2 problems)
- `SquareRoot.java` - Calculate square root (Newton's method, binary search)
- `MinCoins.java` - Minimum coins for amount (DP/Greedy)

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
- [ ] `AddOneToNumberTest.java` - Array manipulation
- [ ] `ArmstrongNumbers.java` - Digit extraction

### Hard Level
- [ ] `ClimbingStairs.java` - DP optimization
- [ ] `MinCoins.java` - DP/Greedy analysis
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



## Code Solutions

### AddBinary.java

```java
package InterviewPrep.Math;

import org.testng.Assert;

public class AddBinary {
    public static void main(String[] args) {

        Assert.assertEquals(addBinary("11","1"),"100");
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}


```

### AddOneToNumberTest.java

```java
package InterviewPrep.Math;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// QUESTION: Given a non-negative integer represented as an array of digits, add one to the integer.
// The digits are stored such that the most significant digit is at the head of the list, and each
// element in the array contains a single digit. You may assume the integer does not contain any
// leading zero, except the number 0 itself.
// Example: Input: [1,2,3] -> Output: [1,2,4]
//          Input: [9,9,9] -> Output: [1,0,0,0]

public class AddOneToNumberTest {

    public static int[] addOne(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int plusOne = arr[i] + carry;
            if (plusOne > 9) {
                result.add(0);
                carry = plusOne / 10;
            } else {
                result.add(plusOne);
                carry = 0;
            }
        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result.stream().mapToInt(i -> i).toArray();
    }


    @Test
    public void test() {
        Assert.assertEquals(addOne(new int[]{1, 2, 4}), new int[]{1, 2, 5});
        Assert.assertEquals(addOne(new int[]{1, 2, 9}), new int[]{1, 3, 0});
        Assert.assertEquals(addOne(new int[]{9, 9, 9}), new int[]{1, 0, 0, 0});
        Assert.assertEquals(addOne(new int[]{9}), new int[]{1, 0});
        Assert.assertEquals(addOne(new int[]{5}), new int[]{6});
    }
}

```

### ArmstrongNumbers.java

```java

```

### Factorial.java

```java
package InterviewPrep.Math;

public class Factorial {
    // QUESTION: Write a recursive function to calculate the factorial of a given number.
    // Example: Input: 5 -> Output: 120 (5 * 4 * 3 * 2 * 1)
    //S/T:n
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}


```

### FibonacciSeries.java

```java
package InterviewPrep.Math;

public class FibonacciSeries {
    // QUESTION: Generate the first n numbers of the Fibonacci series.
    // The Fibonacci sequence is a series where each number is the sum of the two preceding ones.
    // Example: Input: 10 -> Output: 0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, nextNum, count = 10;
        System.out.print(firstNum + " " + secondNum);
        for (int i = 2; i < count; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}


```

### IntegerReverse.java

```java
package InterviewPrep.Math;

// QUESTION: Given an integer, reverse its digits and return the result.
// Example: Input: 12345 -> Output: 54321
//          Input: 123 -> Output: 321
public class IntegerReverse {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverseInteger(num));

        int num1 = 123;
        System.out.println(reverseInteger(num1));
    }

    static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}


```

### LeapYear.java

```java
package InterviewPrep.Math;

public class LeapYear {
    // QUESTION: Write a function to determine if a given year is a leap year.
    // A leap year is divisible by 4, except for century years which must be divisible by 400.
    // Example: Input: 2000 -> Output: true
    //          Input: 1900 -> Output: false

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}

```

### MinCoins.java

```java
package InterviewPrep.Math;

import org.testng.Assert;

public class MinCoins {
    // QUESTION: Given an array of coin denominations and a target value, find the minimum number of coins
    // required to make up that value. You may assume that you have an infinite supply of each coin type.
    // Example: Input: coins = [1,2,5,10], value = 13 -> Output: 3 (10 + 2 + 1)
    public static void main(String[] args) {
        int[] coinArray={1,2,5,10};
        Assert.assertEquals(minCoins(coinArray,13),3);
        Assert.assertEquals(minCoins(coinArray,20),2);
    }

    private static int minCoins(int[] coinArray, int value) {
        int count=0;
        for(int i=coinArray.length-1;i>=0;i--){
            while(value>=coinArray[i]){
                value-=coinArray[i];
                count++;
            }
        }
        return count;
    }
}

```

### PrimeNumber.java

```java
package InterviewPrep.Math;

public class PrimeNumber {
    // QUESTION: Given an integer, determine if it is a prime number. A prime number is a number greater
    // than 1 that has no positive divisors other than 1 and itself.
    // Example: Input: 23 -> Output: true
    //          Input: 4 -> Output: false

    public static void main(String[] args) {
        int num = 23;

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}


```

### SquareRoot.java

```java
package InterviewPrep.Math;

import org.testng.Assert;

public class SquareRoot {
    public static void main(String[] args) {
        Assert.assertEquals(mySqrt(9), 3);
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x;
        long ans = 1;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
}


```


---

# Topic: Searching

## Code Solutions

### BinarySearch.java

```java
package InterviewPrep.Searching;

import java.util.Arrays;

// QUESTION: Implement binary search to find a target element in a sorted array.
// Return the index if found, otherwise return -1.
// Example: Input: [2, 5, 6, 7, 9], target: 7 -> Output: 3
//          Input: [2, 5, 6, 7, 9], target: 8 -> Output: -1
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9, 2};
        Arrays.sort(arr);

        int num = 7;
        int result = binarySearch(arr, num);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int binarySearch(int[] arr, int num) {
        int len = arr.length;
        int max = len - 1;
        int min = 0;

        while (max >= min) {
            int mid = (max + min) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return -1; // Element not found
    }
}

```

### KthLargest.java

```java
package InterviewPrep.Searching;

import java.util.PriorityQueue;

public class KthLargest {
    // QUESTION: Given an array of integers and a number k, find the kth largest element in the array.
// Example: Input: [3, 2, 1, 5, 6, 4, 7], k = 3 -> Output: 5
    //Time Complexity: O(nlogn)
    //Space Complexity: O(n)
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4, 7};
        System.out.println("Third largest number is: " + kthLargest(arr,3));
    }

    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int val : arr) {
            priorityQueue.add(val);
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}


```


---

# Topic: Sorting

## Code Solutions

### BubbleSort.java

```java
package InterviewPrep.Sorting;

// QUESTION: Implement bubble sort algorithm to sort an array of integers in ascending order.
// Example: Input: [9, 8, 7, 4, 5, 6, 2, 1, 3] -> Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 4, 5, 6, 2, 1, 3};
        int tempValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}


```

### SortCharArray.java

```java
package InterviewPrep.Sorting;

public class SortCharArray {
    // QUESTION: Given a string, sort its characters in ascending order.
    // Example: Input: "saurav" -> Output: "aarsuv"
    public static void main(String[] args) {
        String input = "saurav";
        char[] arr = input.toCharArray();

        // Sorting using bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted string
        for (char c : arr) {
            System.out.print(c);
        }
    }
}



```

### SortHashMapByValue.java

```java
package InterviewPrep.Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValue {
    // QUESTION: Given a HashMap, sort it by its values in both ascending and descending order.
    // Example: Input: {apple=10, banana=5, cherry=15, date=2, elderberry=10}
    //          Output (ascending): {date=2, banana=5, apple=10, elderberry=10, cherry=15}

    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 10);
        unsortedMap.put("banana", 5);
        unsortedMap.put("cherry", 15);
        unsortedMap.put("date", 2);
        unsortedMap.put("elderberry", 10);

        System.out.println("Unsorted HashMap: " + unsortedMap);

        Map<String, Integer> sortedMapAscending = sortByValue(unsortedMap);
        System.out.println("Sorted HashMap by value (ascending): " + sortedMapAscending);

        Map<String, Integer> sortedMapDescending = sortByValueDescending(unsortedMap);
        System.out.println("Sorted HashMap by value (descending): " + sortedMapDescending);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        Map<K, V> sortedMap = new java.util.LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.<K, V>comparingByValue().reversed());
        Map<K, V> sortedMap = new java.util.LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}

```


---

# Topic: Stack

## Notes & Concept Guide

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


## Code Solutions

### DailyTemperatures.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class DailyTemperatures {
    // QUESTION: Given an array of integers temperatures represents the daily temperatures,
    // return an array answer such that answer[i] is the number of days you have to wait
    // after the ith day to get a warmer temperature. If there is no future day for which
    // this is possible, keep answer[i] == 0 instead.
    // Example: Input: temperatures = [73,74,75,71,69,72,76,73]
    //          Output: [1,1,4,2,1,1,0,0]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        
        System.out.print("Result: ");
        for (int day : result) {
            System.out.print(day + " ");
        }
        System.out.println(); // Output: 1 1 4 2 1 1 0 0
    }
}

```

### DecodeString.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class DecodeString {
    // QUESTION: Given an encoded string, return its decoded string.
    // The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
    // is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
    // Example: Input: s = "3[a]2[bc]"
    //          Output: "aaabcbc"
    //          Input: s = "3[a2[c]]"
    //          Output: "accaccacc"
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        System.out.println(decodeString(s1)); // Output: aaabcbc

        String s2 = "3[a2[c]]";
        System.out.println(decodeString(s2)); // Output: accaccacc

        String s3 = "2[abc]3[cd]ef";
        System.out.println(decodeString(s3)); // Output: abcabccdcdcdef
    }
}

```

### EvaluateRPN.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class EvaluateRPN {
    // QUESTION: Evaluate the value of an arithmetic expression in Reverse Polish Notation.
    // Valid operators are: +, -, *, /. Each operand may be an integer or another expression.
    // Note: Division between two integers should truncate toward zero.
    // Example: Input: tokens = ["2","1","+","3","*"]
    //          Output: 9 ((2 + 1) * 3)
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(token, a, b);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens1)); // Output: 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens2)); // Output: 6

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens3)); // Output: 22
    }
}

```

### ImplementStackUsingQueue.java

```java
package InterviewPrep.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    // QUESTION: Implement a last-in-first-out (LIFO) stack using only two queues.
    // The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
    // Time Complexity: O(1) for push, O(n) for pop and top
    // Space Complexity: O(n)

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public ImplementStackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return queue1.poll();
    }

    public int top() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());    // Output: 3
        System.out.println(stack.pop());    // Output: 3
        System.out.println(stack.pop());    // Output: 2
        System.out.println(stack.empty());  // Output: false
        System.out.println(stack.pop());    // Output: 1
        System.out.println(stack.empty());  // Output: true
    }
}

```

### LargestRectangleInHistogram.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    // QUESTION: Given an array of integers heights representing the histogram's bar height
    // where the width of each bar is 1, return the area of the largest rectangle in the histogram.
    // Example: Input: heights = [2,1,5,6,2,3]
    //          Output: 10
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];
            
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            
            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights1)); // Output: 10

        int[] heights2 = {2, 4};
        System.out.println(largestRectangleArea(heights2)); // Output: 4
    }
}

```

### MinStack.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class MinStack {
    // QUESTION: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    // Implement the MinStack class:
    // - MinStack() initializes the stack object.
    // - void push(int val) pushes the element val onto the stack.
    // - void pop() removes the element on the top of the stack.
    // - int top() gets the top element of the stack.
    // - int getMin() retrieves the minimum element in the stack.
    // Time Complexity: O(1) for all operations
    // Space Complexity: O(n)

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println(minStack.top());    // Returns 0
        System.out.println(minStack.getMin()); // Returns -2
    }
}

```

### NextGreaterElement.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class NextGreaterElement {
    // QUESTION: Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
    // return the next greater number for every element in nums.
    // The next greater number of a number x is the first greater number to its traversing-order next in the array.
    // If it doesn't exist, return -1 for this number.
    // Example: Input: nums = [1,2,1]
    //          Output: [2,-1,2]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Traverse the array twice (circular)
        for (int i = 0; i < 2 * n; i++) {
            int actualIndex = i % n;
            while (!stack.isEmpty() && nums[actualIndex] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = nums[actualIndex];
            }
            if (i < n) {
                stack.push(actualIndex);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        int[] result1 = nextGreaterElements(nums1);
        System.out.print("Result 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 2 -1 2

        int[] nums2 = {1, 2, 3, 4, 3};
        int[] result2 = nextGreaterElements(nums2);
        System.out.print("Result 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 2 3 4 -1 4
    }
}

```

### RemoveKDigits.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class RemoveKDigits {
    // QUESTION: Given string num representing a non-negative integer num, and an integer k,
    // return the smallest possible integer after removing k digits from num.
    // Example: Input: num = "1432219", k = 3
    //          Output: "1219"
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static String removeKDigits(String num, int k) {
        if (k == 0) return num;
        if (k >= num.length()) return "0";

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // Remove remaining k digits from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result and remove leading zeros
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        String num1 = "1432219";
        System.out.println(removeKDigits(num1, 3)); // Output: 1219

        String num2 = "10200";
        System.out.println(removeKDigits(num2, 1)); // Output: 200

        String num3 = "10";
        System.out.println(removeKDigits(num3, 2)); // Output: 0
    }
}

```

### ValidBrackets.java

```java
package InterviewPrep.Stack;

import java.util.Stack;

public class ValidBrackets {
    // QUESTION: Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
    // determine if the input string is valid. An input string is valid if open brackets are closed
    // by the same type of brackets and in the correct order.
    // Example: Input: "()[]{}" -> Output: true
    //          Input: "({[]})" -> Output: true
    //Space/Time Complexity: O(n)

    public static void main(String[] args) {
        String input = "()[]{}";
        System.out.println(isValid(input)); // Output: true

        input = "({[]})";
        System.out.println(isValid(input)); // Output: true
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}


```


---

# Topic: String

## Notes & Concept Guide

# String Problems - Interview Prep Guide

## Overview
This folder contains **26 problems** focused on string manipulation and pattern matching.

## Problem Categories

### 1. **Palindrome Problems** (5 problems)
- `isPalindrome_7.java` - Check if string is palindrome
- `StringPalindrome.java` - String palindrome check
- `NumberPalindrome.java` - Check if number is palindrome
- `Palindrome.java` - Basic palindrome logic
- `LongestPalindromicSubstring.java` - Find longest palindromic substring

**Techniques**: Two-pointers, Expand around center, DP
**Time**: O(n) to O(n²)

### 2. **Reversal Problems** (7 problems)
- `ReverseString_12.java` - Reverse string
- `ReverseString.java` - Character-by-character reversal
- `ComplexStringReverseTest.java` - Reverse with special characters
- `ReverseStringWithoutSpecialChars.java` - Reverse only alphanumeric
- `Reverse.java` - Additional reversal approach
- `IntegerReverse.java` - Reverse integer (moved from Math for string context)
- `RomanToInt.java` - Roman numeral to integer conversion

**Techniques**: Two-pointers, Recursion, Stack
**Challenge**: Do it in-place with O(1) space

### 3. **Substring & Matching** (6 problems)
- `LongestUniqueCharSubstring.java` - Longest substring with unique chars
- `LongestCommonPrefix.java` - Common prefix of strings
- `PermutationInString.java` - Check if one string is permutation of another
- `FirstOccurence.java` - Find first occurrence of substring
- `IsomorphicStrings.java` - Check if strings are isomorphic
- `CommonStringTest.java` - Common string operations

**Techniques**: Sliding window, Hashing, Two-pointers
**Best For**: Pattern matching problems

### 4. **Character Operations** (6 problems)
- `CharacterFrequencyTest.java` - Moved to HashMaps but related
- `CharsRepeatedTwice.java` - Characters repeated twice
- `SeperateCaps.java` - Separate capital letters
- `SortStringCharsTest.java` - Sort characters in string
- `NthConsecutiveString.java` - Find Nth consecutive pattern
- `TrianglePattern.java` - Pattern printing with characters

**Techniques**: HashMap, String manipulation

### 5. **String Transformation** (3 problems)
- `StringCompression.java` - Compress string (run-length encoding)
- `StringPermutations.java` - Generate all permutations
- `RomanToInt.java` - Roman numeral to integer conversion

**Algorithm**: Backtracking for permutations
**Challenge**: Generate all permutations efficiently

---

## Key Techniques to Master

### 1. **Two-Pointer Technique**
Used in: `ReverseString_12.java`, `Palindrome.java`
- Check palindrome in O(n) time, O(1) space
- Most efficient approach
- Pattern: left starts at 0, right at length-1

### 2. **Sliding Window**
Used in: `LongestUniqueCharSubstring.java`, `PermutationInString.java`
- Track window of characters
- Time: O(n), Space: O(k) where k = window size
- Common in substring problems

### 3. **Expand Around Center**
Used in: `LongestPalindromicSubstring.java`
- For each potential center, expand outward
- Handles both odd and even length palindromes
- Time: O(n²), Space: O(1)

### 4. **Dynamic Programming**
Used in: `LongestPalindromicSubstring.java`, `LongestUniqueCharSubstring.java`
- Build solution from smaller subproblems
- Space-time tradeoff: O(n²) space vs O(n) time

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `ReverseString_12.java` - Basic string reversal
- [ ] `isPalindrome_7.java` - Palindrome check
- [ ] `LengthOfLastWord.java` - Count last word length
- [ ] `FirstOccurence.java` - Substring search
- [ ] `RomanToInt.java` - Numeric conversion
- [ ] `Reverse.java` - Alternative reversal

### Medium Level
- [ ] `LongestUniqueCharSubstring.java` - Sliding window
- [ ] `LongestCommonPrefix.java` - Array of strings
- [ ] `PermutationInString.java` - Anagram detection
- [ ] `StringCompression.java` - Encoding
- [ ] `IsomorphicStrings.java` - Pattern matching
- [ ] `RemoveStringDuplicates.java` - Duplicate removal
- [ ] `TrianglePattern.java` - Pattern printing

### Hard Level
- [ ] `LongestPalindromicSubstring.java` - DP/Expand approach
- [ ] `StringPermutations.java` - Backtracking
- [ ] `ComplexStringReverseTest.java` - Edge cases

---

## Common Interview Questions

### 1. Reverse a String
**Problem**: Reverse string in-place
**Solution**: See `ReverseString_12.java`
**Follow-up**: Handle special characters, unicode

### 2. Palindrome Check
**Problem**: Check if string is palindrome (ignore case/spaces)
**Solution**: See `isPalindrome_7.java`
**Interview Tip**: Mention two-pointer approach (O(n) time, O(1) space)

### 3. Longest Substring Without Repeating
**Problem**: Find longest substring with all unique characters
**Solution**: See `LongestUniqueCharSubstring.java`
**Key Technique**: Sliding window with HashMap

### 4. Longest Palindromic Substring
**Problem**: Find longest palindromic subsequence
**Solution**: See `LongestPalindromicSubstring.java`
**Approaches**:
- Expand around center: O(n²) time, O(1) space ✓
- Dynamic Programming: O(n²) time, O(n²) space
- Manacher's Algorithm: O(n) time, O(n) space (advanced)

### 5. String Permutation
**Problem**: Check if one string is permutation of another
**Solution**: See `PermutationInString.java`
**Hint**: Anagram detection

---

## Related Files in Other Folders

These files handle string-related work but are categorized differently:

- **HashMaps folder** (String frequency related):
  - `GroupAnagrams_4.java` - Group anagrams
  - `ValidAnagram_3.java` - Check if anagrams
  - `CharacterFrequencyTest.java` - Character frequency

- **Array folder** (String array operations):
  - `SortStringCharsTest.java` - Sort character array

---

## Time Complexity Reference

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Reverse String | O(n) | O(1) | Two pointers |
| Palindrome Check | O(n) | O(1) | Two pointers |
| Longest Unique | O(n) | O(k) | Sliding window |
| Longest Palindrome | O(n²) | O(1) | Expand around |
| Anagram Check | O(n) | O(1) | Sorting/Freq |
| First Occurrence | O(n*m) | O(1) | String search |
| Permutations | O(n!) | O(n!) | Backtracking |

---

## Practice Tips

### Pattern Recognition
1. **Palindrome Problems** → Use two-pointers
2. **Substring Problems** → Use sliding window with HashMap
3. **Permutation/Combination** → Use backtracking
4. **Comparison** → Use character frequency maps

### Optimization Focus
1. **Space**: Can we solve in O(1) extra space?
2. **Time**: Can we reduce from O(n²) to O(n)?
3. **In-place**: Can we modify the input?

### Common Mistakes
- Forgetting to handle edge cases (empty string, single char)
- Not considering unicode/special characters
- Off-by-one errors in two-pointer approach
- Not using HashSet/HashMap for frequency problems

---

Generated: Interview Prep Package - String Folder



## Code Solutions

### CharsRepeatedTwice.java

```java
package InterviewPrep.String;

// QUESTION: Given a string, find all characters that appear at least twice and print their frequency.
// Example: Input: "aabccdad" -> Output: a: 3, c: 2, d: 2
public class CharsRepeatedTwice {
    public static void main(String[] args) {
        String str = "aabccdad";//a,c,d
        int[] counter=new int[26];
        for(char c:str.toCharArray()){
            counter[c-'a']++;
        }
        for(int i=0;i<counter.length;i++){
            if(counter[i]>=2){
                System.out.println((char)(i+'a')+" : "+counter[i]);
            }
        }
    }
}

```

### CommonStringTest.java

```java
package InterviewPrep.String;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

// QUESTION: Given two arrays of strings, find the common elements between them.
// Example: Input: ["apple", "banana", "single", "Laxmi", "Raghu"], ["june", "july", "apple", "april", "Laxmi"]
//          Output: ["apple", "Laxmi"]
public class CommonStringTest {
    //Time Complexity: O(n + m)
    //Space Complexity: O(n + m)

    @Test
    public void test(){
        String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
        Assert.assertEquals(commonString(a1,a2),List.of("apple", "Laxmi"));
    }

    public List<String> commonString(String[] a1,String[] a2){
        Set<String> a2Set = new HashSet<>(Arrays.asList(a2));
        List<String> result = new ArrayList<>();
        for (String ele : a1) {
            if (a2Set.contains(ele)) {
                result.add(ele);
            }
        }
       return result;
    }
}

```

### ComplexStringReverseTest.java

```java
package InterviewPrep.String;

import org.testng.Assert;
import org.testng.annotations.Test;

// QUESTION: Given a string, reverse it while maintaining the original positions of spaces.
// Example: Input: "this is a phone" -> Output: "enoh pa s isiht"
public class ComplexStringReverseTest {

    @Test
    public void test(){
        Assert.assertEquals(reverseString("this is a phone"),"enoh pa s isiht");
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == ' ') {
                left++;
            } else if (arr[right] == ' ') {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}


```

### FirstOccurence.java

```java
package InterviewPrep.String;

public class FirstOccurence {
    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad")==0);
    }

    public static int strStr(String haystack, String needle) {
        int m=haystack.length(),n=needle.length();
        for(int i=0;i<=m-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}


```

### IsomorphicStrings.java

```java
package InterviewPrep.String;

import org.testng.Assert;
import java.util.HashMap;
import java.util.HashSet;

// QUESTION: Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic
// if the characters in s can be replaced to get t. All occurrences of a character must be replaced
// with another character while preserving the order of characters. No two characters may map to
// the same character, but a character may map to itself.
// Example: Input: "aab", "xxy" -> Output: true
//          Input: "bar", "foo" -> Output: false
public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (map.getOrDefault(c1, c2) != c2) {
                return false;
            }
            if (!map.containsKey(c1)) {
                if (mappedValues.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Assert.assertTrue(areIsomorphic("aab", "xxy"));
        Assert.assertFalse(areIsomorphic("bar", "foo"));
        Assert.assertTrue(areIsomorphic("paper", "title"));
        Assert.assertTrue(areIsomorphic("abc", "xyz"));
    }
}

```

### LengthOfLastWord.java

```java
package InterviewPrep.String;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        String[] splitStrings=s.split("\\s+");
        int len=splitStrings.length-1;
        return splitStrings[len].length();
    }
}


```

### LongestCommonPrefix.java

```java
package InterviewPrep.String;

// QUESTION: Given an array of strings, find the longest common prefix string amongst the array.
// If there is no common prefix, return an empty string.
// Example: Input: ["flower", "flow", "flight"] -> Output: "fl"
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] arr) {
        String result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int len = commonPrefixLen(result, arr[i]);
            result = result.substring(0, len);
        }
        return result;
    }
    static int commonPrefixLen(String a, String b) {
        int commonLength=0;
        int minL=Math.min(a.length(),b.length());
        for(int i=0;i<minL;i++){
            if(a.charAt(i)==b.charAt(i)){
                commonLength++;
            }else{
                break;
            }
        }
        return commonLength;
    }
}


```

### LongestPalindromicSubstring.java

```java
package InterviewPrep.String;

public class LongestPalindromicSubstring {
    // QUESTION: Given a string, find the longest palindromic substring within it.
    // A palindrome is a word that reads the same backward as forward.
    // Example: Input: "babad" -> Output: "bab" or "aba"
    //          Input: "cbbd" -> Output: "bb"

    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring(str));
        str = "cbbd";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring(str));
    }

    static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    static String findLongestPalindromeSubstring(String s) {
        int maxLength = 1;
        String longestPalindrome = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((j - i) > maxLength && isPalindrome(s, i, j)) {
                    maxLength = j - i;
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }
        return longestPalindrome;
    }
}

```

### LongestUniqueCharSubstring.java

```java
package InterviewPrep.String;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueCharSubstring {
    // QUESTION: Given a string, find the length of the longest substring without repeating characters.
    // Example: Input: "GEEKSFORGEEKS" -> Output: "EKSFORG" (length 7)
    //Time Complexity: O(n)
    //Space Complexity: O(min(n, m))
    static String longestSubStrWithoutRepetition(String str) {
        Set<Character> hs = new HashSet<>();
        int j = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            while (hs.contains(str.charAt(i))) {
                hs.remove(str.charAt(j));
                j++;
            }
            hs.add(str.charAt(i));

            if (i - j + 1 > maxLength) {
                maxLength = i - j + 1;
                startIndex = j;
            }
        }
        return str.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println(longestSubStrWithoutRepetition(s));
    }
}

```

### NthConsecutiveString.java

```java
package InterviewPrep.String;

public class NthConsecutiveString {
    // QUESTION: Given a string, find the character that appears consecutively the maximum number of times.
    // Example: Input: "Amazon is a great company as it has Atooozzzz" -> Output: 'z'
    public static void main(String[] args) {
        String word = "Amazon is a great company as it has Atooozzzz";
        System.out.println(maxRepeating(word));
    }

    static char maxRepeating(String str) {
        int maxCount = 0;
        char result = str.charAt(0);

        int currentCount = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                currentCount = 1;
                currentChar = str.charAt(i);
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                result = currentChar;
            }
        }

        return result;
    }
}


```

### NumberPalindrome.java

```java
package InterviewPrep.String;

import java.util.Scanner;

public class NumberPalindrome {
    // QUESTION: Given an integer, determine if it is a palindrome. A palindrome number reads the same
    // backward as forward. Negative numbers are not palindromes.
    // Example: Input: 121 -> Output: true
    //          Input: -121 -> Output: false

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int num = 0;
        while (x != 0) {
            int rem = x % 10;
            num = num * 10 + rem;
            x /= 10;
        }
        return num == temp;
    }
}


```

### Palindrome.java

```java
package InterviewPrep.String;

// QUESTION: Given a string, determine if it is a palindrome. A palindrome reads the same backward
// as forward.
public class Palindrome {

    public static void main(String[] args) {
        // Approach 1: Simple case-insensitive check
        String name = "Madam";
        System.out.println("StringBuilder Approach: " + isPalindromeStringBuilder(name));

        // Approach 2: With alphanumeric filtering
        String phrase = "A man, a plan, a canal: Panama";
        System.out.println("Two-Pointer Approach: " + isPalindromeTwoPointer(phrase));
    }

    /**
     * Approach 1: Using StringBuilder
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Use for simple case-insensitive palindrome check
     */
    public static boolean isPalindromeStringBuilder(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return s.equalsIgnoreCase(rev.toString());
    }

    /**
     * Approach 2: Two Pointers with alphanumeric filtering
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Use when string contains special characters and needs alphanumeric-only check
     */
    public static boolean isPalindromeTwoPointer(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}


```

### PermutationInString.java

```java
package InterviewPrep.String;

import java.util.Arrays;

// QUESTION: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// A permutation of a string is any rearrangement of its characters.
// Example: Input: s1 = "ab", s2 = "eidbaooo" -> Output: true (s2 contains "ba" which is a permutation of "ab")
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(containsPermutations(s1, s2));
    }
    static boolean containsPermutations(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            windowFreq[s2.charAt(i) - 'a']++;
            if (i >= s1.length()) {
                windowFreq[s2.charAt(i - s1.length()) - 'a']--;
            }
            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }
        return false;
    }
}


```

### RemoveStringDuplicates.java

```java
package InterviewPrep.String;

// QUESTION: Given a string, remove duplicate characters from it while preserving the order of
// first occurrence.
// Example: Input: "geeksforgeeks" -> Output: "geksfor"
public class RemoveStringDuplicates {
    public static String removeDuplicates(String str) {
        boolean[] visited = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String result = removeDuplicates(str);
        System.out.println(result); // Output: geksfor
    }
}

```

### Reverse.java

```java
package InterviewPrep.String;

// QUESTION: Given a string, reverse the entire string and also reverse the order of words in the string.
// Example: Input: "My Name is Saurav Singh"
//          Reverse words: "Singh Saurav is Name My"
//          Reverse string: "hgniS varuaS si emaN yM"
public class Reverse {
    public static void main(String[] args) {
        String input = "My Name is Saurav Singh";

        // Reversing words
        String reversedWords = reverseWords(input);
        System.out.println("Reversed Words: " + reversedWords);

        // Reversing the entire string
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);
    }

    static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    static String reverseString(String input) {
        char[] characters = input.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }

        return reversed.toString();
    }
}


```

### ReverseString.java

```java
package InterviewPrep.String;

public class ReverseString {
// QUESTION: Given a string, reverse each word in the string while maintaining the original order of words.
// Example: Input: "India is my country" -> Output: "aidnI si ym yrtnuoc"
    public static void main(String[] args) {
        //Space/Time: O(n*m)
        String str="India is my country";
        String[] arr=str.split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            char[] wordArray=arr[i].toCharArray();
            for(int j=wordArray.length-1;j>=0;j--){
                result.append(wordArray[j]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}


```

### ReverseStringWithoutSpecialChars.java

```java
package InterviewPrep.String;

public class ReverseStringWithoutSpecialChars {
    // QUESTION: Given a string containing alphabetic characters and special characters, reverse only
    // the alphabetic characters while keeping the special characters in their original positions.
    // Example: Input: "a!b?c" -> Output: "c?b!a"
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

       return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "a!b?c";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr); // Output: c?b!a
    }
}

```

### ReverseString_12.java

```java
package InterviewPrep.String;

import java.util.Arrays;

public class ReverseString_12 {
    //Write a function that reverses a string. The input string is given as an array of characters s.

    public static void main(String[] args) {
        char[] arr=new char[]{'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}


```

### RomanToInt.java

```java
package InterviewPrep.String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("X"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}


```

### SeperateCaps.java

```java
package InterviewPrep.String;

public class SeperateCaps {
    // QUESTION: Given a string containing lowercase letters, uppercase letters, and digits,
    // print the lowercase characters, uppercase characters, and digits separately.
    // Example: Input: "sumitM28" -> Output: sumit, M, 28

    public static void main(String[] args) {
        String input = "sumitM28";
        input.chars().filter(Character::isLowerCase).forEach(c -> System.out.print((char) c));
        System.out.println();
        input.chars().filter(Character::isUpperCase).forEach(c -> System.out.print((char) c));
        System.out.println();
        input.chars().filter(Character::isDigit).forEach(c -> System.out.print((char) c));
        System.out.println();
    }

}


```

### SortStringCharsTest.java

```java
package InterviewPrep.String;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortStringCharsTest {
    // QUESTION: Given a string, sort its characters based on their frequency in descending order.
    // If characters have the same frequency, maintain their original order.
    // Example: Input: "Aabb" -> Output: "bbAa" (b:2, A:1, a:1)
    public static String sortStrings(String s) {
        int[] freq = new int[256]; // Covers all ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        // Step 2: Create an array of characters for sorting
        Character[] chars = new Character[256];
        for (int i = 0; i < 256; i++) {
            chars[i] = (char) i;
        }
        // Step 3: Sort characters based on frequency in descending order
        Arrays.sort(chars, (a, b) -> freq[b] - freq[a]);

        // Step 4: Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (freq[c] > 0) {
                result.append(String.valueOf(c).repeat(freq[c]));
            }
        }
        return result.toString();
    }

    //t:nlogn,s:n
    public static String sortStringsWithMaps(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (Character c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(frequencyMap.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            sb.append(String.valueOf(c).repeat(freq));
        }

        return sb.toString();
    }

    @Test
    public void test() {
        Assert.assertEquals(sortStrings("Aabb"), "bbAa");
        Assert.assertEquals(sortStringsWithMaps("Aabb"), "bbAa");
    }
}


```

### StringCompression.java

```java
package InterviewPrep.String;

public class StringCompression {
    // QUESTION: Given a string, compress it by replacing consecutive repeating characters with
    // the character followed by its count. If a character appears only once, don't add a count.
    // Example: Input: "aaabbbacfwww" -> Output: "a3b3acfw3"
    //Time Complexity: O(n)
    //Space Complexity: O(n)

    public static void main(String[] args) {
        {
            String str = "aaabbbacfwwwj";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                int count = 1;
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
            }
            System.out.println(sb);
        }
    }
}


```

### StringPermutations.java

```java
package InterviewPrep.String;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    // QUESTION: Given a string, generate all possible permutations of its characters.
    // Example: Input: "geek" -> Output: All permutations of "geek"
    //t:n!,s:n
    public static void main(String[] args) {
        //printPermutn("geek", "");
        System.out.println();
        System.out.print(permute("geek"));
    }

    static void printPermutn(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        boolean[] alpha = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            if (!alpha[ch - 'a']) printPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

    static Set<String> permute(String str) {
        if (str == null) {
            return null;
        } else if (str.isEmpty()) {
            Set<String> set = new HashSet<>();
            set.add("");
            return set;
        }
        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        Set<String> words = permute(remainingStr);
        Set<String> permutations = new HashSet<>();
        for (String word : words) {
            for (int j = 0; j <= word.length(); j++) {
                String s = word.substring(0, j) + firstChar + word.substring(j);
                permutations.add(s);
            }
        }
        return permutations;
    }
}


```

### TrianglePattern.java

```java
package InterviewPrep.String;

public class TrianglePattern {
    // QUESTION: Print a right-angled triangle pattern of stars with the given number of rows.
    // Example: Input: n = 5
    //          Output:
    //              *
    //             * *
    //            * * *
    //           * * * *
    //          * * * * *

//    For Outer loop use Y axis(column)
//    For inner Loop use X Axis(row)
//    https://1drv.ms/b/s!AvMeJEl0kAHtgaMdDCM6W1Oj08R8XQ?e=iKY0rt

    public static void printRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printRightAngledTriangle(n);
    }
}


```


---

# Topic: Trees

## Notes & Concept Guide

# Tree Problems - Interview Prep Guide

## Overview
This folder contains **17 problems** focused on binary tree data structures, covering traversals, BST operations, and advanced tree algorithms.

## Problem Categories

### 1. **Tree Traversals** (3 problems)
- `InorderTraversal.java` - Left-Root-Right traversal
- `PreorderTraversal.java` - Root-Left-Right traversal
- `PostorderTraversal.java` - Left-Right-Root traversal

**Techniques**: Recursive and iterative approaches
**Time Complexity**: O(n), **Space Complexity**: O(h) where h is height

### 2. **Basic Tree Properties** (2 problems)
- `MaxDepth.java` - Find height/depth of binary tree
- `SymmetricTree.java` - Check if tree is mirror of itself

**Interview Frequency**: Very Common

### 3. **Level Order Traversals** (2 problems)
- `LevelOrderTraversal.java` - BFS level by level
- `ZigzagLevelOrder.java` - Alternate left-right, right-left

**Technique**: Queue-based BFS
**Time Complexity**: O(n), **Space Complexity**: O(w) where w is max width

### 4. **Path Problems** (3 problems)
- `PathSum.java` - Check if root-to-leaf path sums to target
- `AllPathsFromRootToLeaf.java` - Get all root-to-leaf paths
- `MaxPathSum.java` - Maximum sum path (any node to any node)

**Techniques**: DFS with running sum, post-order DFS

### 5. **BST Operations** (2 problems)
- `KthSmallestInBST.java` - Find kth smallest element in BST
- `ConstructBSTFromPreorder.java` - Build BST from preorder traversal

**Key Insight**: BST property enables efficient searching

### 6. **Advanced Tree Problems** (5 problems)
- `LowestCommonAncestor.java` - Find LCA of two nodes
- `RightViewOfBinaryTree.java` - Get rightmost node at each level
- `SerializeDeserializeBinaryTree.java` - Convert tree to string and back
- `RecoverBST.java` - Fix BST with two swapped nodes
- `BalancedBinaryTree.java` - Check if tree is height-balanced

**Interview Frequency**: Very Important

---

## Key Techniques to Master

### 1. **Recursive Tree Traversal**
```java
void inorder(TreeNode node) {
    if (node == null) return;
    inorder(node.left);
    visit(node);
    inorder(node.right);
}
```
**Use Case**: All traversal problems
**Time**: O(n), **Space**: O(h) for recursion stack

### 2. **Iterative Traversal with Stack**
```java
Stack<TreeNode> stack = new Stack<>();
TreeNode current = root;
while (current != null || !stack.isEmpty()) {
    while (current != null) {
        stack.push(current);
        current = current.left;
    }
    current = stack.pop();
    visit(current);
    current = current.right;
}
```
**Use Case**: When recursion depth is too large
**Time**: O(n), **Space**: O(h)

### 3. **Level Order (BFS)**
```java
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while (!queue.isEmpty()) {
    int levelSize = queue.size();
    for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```
**Use Case**: Level-based problems, shortest path
**Time**: O(n), **Space**: O(w)

### 4. **Post-order DFS for Path Problems**
```java
int maxGain(TreeNode node) {
    if (node == null) return 0;
    int leftGain = Math.max(maxGain(node.left), 0);
    int rightGain = Math.max(maxGain(node.right), 0);
    // Process current node
    return node.val + Math.max(leftGain, rightGain);
}
```
**Use Case**: Max path sum, tree diameter
**Time**: O(n), **Space**: O(h)

---

## Interview Preparation Checklist

### Easy Level (Start Here)
- [ ] `InorderTraversal.java` - Basic traversal
- [ ] `PreorderTraversal.java` - Root-first traversal
- [ ] `PostorderTraversal.java` - Leaf-first traversal
- [ ] `MaxDepth.java` - Simple DFS
- [ ] `SymmetricTree.java` - Recursive comparison

### Medium Level
- [ ] `LevelOrderTraversal.java` - BFS pattern
- [ ] `ZigzagLevelOrder.java` - Modified BFS
- [ ] `LowestCommonAncestor.java` - **MOST IMPORTANT**
- [ ] `PathSum.java` - Path problems
- [ ] `KthSmallestInBST.java` - BST property
- [ ] `RightViewOfBinaryTree.java` - Level tracking
- [ ] `BalancedBinaryTree.java` - Height checking

### Hard Level
- [ ] `MaxPathSum.java` - Complex post-order DFS
- [ ] `SerializeDeserializeBinaryTree.java` - Tree serialization
- [ ] `RecoverBST.java` - BST recovery
- [ ] `ConstructBSTFromPreorder.java` - Tree construction
- [ ] `BuildFromInorderPostorder.java` - Tree reconstruction

---

## Common Interview Questions

### 1. Tree Traversal Order
**Problem**: Implement different traversal orders
**Solutions**: Recursive (simple), Iterative (with stack)
**See**: `InorderTraversal.java`, `PreorderTraversal.java`, `PostorderTraversal.java`

### 2. Lowest Common Ancestor
**Problem**: Find LCA of two nodes in BST/Binary Tree
**Key Insight**: Post-order DFS or BST property
**See**: `LowestCommonAncestor.java`

### 3. Level Order Traversal
**Problem**: Traverse tree level by level
**Technique**: Queue-based BFS
**See**: `LevelOrderTraversal.java`

### 4. Maximum Path Sum
**Problem**: Find maximum sum path (any node to any node)
**Strategy**: Post-order DFS returning max path through node
**See**: `MaxPathSum.java`

---

## Time Complexity Summary

| Problem | Time | Space | Technique |
|---------|------|-------|-----------|
| Inorder Traversal | O(n) | O(h) | Recursive/Stack |
| Level Order | O(n) | O(w) | BFS Queue |
| Max Depth | O(n) | O(h) | DFS |
| LCA | O(n) | O(h) | Post-order DFS |
| Path Sum | O(n) | O(h) | DFS with sum |
| Max Path Sum | O(n) | O(h) | Post-order DFS |
| Serialize/Deserialize | O(n) | O(n) | Preorder + markers |
| Balanced Check | O(n) | O(h) | Height tracking |
| Kth Smallest BST | O(k+h) | O(h) | Inorder traversal |

*h = tree height, w = max width*

---

## Related Files

**Graphs folder:**
- Similar DFS/BFS patterns
- Tree is a special case of graph

**Stack folder:**
- Iterative tree traversals use stack

---

## Code Patterns to Remember

### Pattern 1: Recursive Traversal
```java
void traverse(TreeNode node) {
    if (node == null) return;
    // Preorder: process here
    traverse(node.left);
    // Inorder: process here
    traverse(node.right);
    // Postorder: process here
}
```

### Pattern 2: Level Order BFS
```java
Queue<TreeNode> queue = new LinkedList<>();
queue.offer(root);
while (!queue.isEmpty()) {
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        // Process node
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```

### Pattern 3: Post-order for Path Problems
```java
int dfs(TreeNode node) {
    if (node == null) return 0;
    int left = dfs(node.left);
    int right = dfs(node.right);
    // Combine results
    return combine(left, right, node.val);
}
```

---

## Practice Tips

### When to use Recursion vs Iteration:
- **Recursion**: Simpler code, natural for tree problems
- **Iteration**: When recursion depth might cause stack overflow
- **Interview**: Know both, explain tradeoffs

### BST vs Binary Tree:
- **BST**: Left < Root < Right property enables efficient search
- **Binary Tree**: No ordering property
- **Strategy**: Use BST property when available for optimization

### Common Mistakes:
- Not handling null nodes properly
- Forgetting to restore state in backtracking
- Incorrect base cases in recursion
- Not considering tree height in space complexity

---

Generated: Interview Prep Package - Trees Folder


## Code Solutions

### AllPathsFromRootToLeaf.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromRootToLeaf {
    // QUESTION: Given the root of a binary tree, return all root-to-leaf paths in any order.
    // Example: Input: root = [1,2,3,null,5]
    //          Output: ["1->2->5","1->3"]
    // Time Complexity: O(n*h) where h is the height of the tree
    // Space Complexity: O(h) where h is the height of the tree

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", result);
        }
        return result;
    }

    private static void findPaths(TreeNode node, String currentPath, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(currentPath + node.val);
            return;
        }

        String newPath = currentPath + node.val + "->";
        if (node.left != null) {
            findPaths(node.left, newPath, result);
        }
        if (node.right != null) {
            findPaths(node.right, newPath, result);
        }
    }

    public static void main(String[] args) {
        // Create tree: [1,2,3,null,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        System.out.println(binaryTreePaths(root)); // ["1->2->5", "1->3"]
    }
}

```

### BalancedBinaryTree.java

```java
package InterviewPrep.Trees;

public class BalancedBinaryTree {
    // QUESTION: Given a binary tree, determine if it is height-balanced.
    // A height-balanced binary tree is defined as a binary tree in which the left and right subtrees
    // of every node differ in height by no more than 1.
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: true
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private static int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Create balanced tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root)); // Output: true

        // Create unbalanced tree: [1,2,2,3,3,null,null,4,4]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);

        System.out.println(isBalanced(root2)); // Output: false
    }
}

```

### BuildFromInorderPostorder.java

```java
package InterviewPrep.Trees;

public class BuildFromInorderPostorder {
    // QUESTION: Given two integer arrays inorder and postorder where inorder is the inorder traversal of a
    // binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
    // Example: Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
    //          Output: [3,9,20,null,null,15,7]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    private int postIndex;
    private int[] inorder;
    private int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        this.postIndex = postorder.length - 1;
        return build(0, inorder.length - 1);
    }

    private TreeNode build(int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode node = new TreeNode(postorder[postIndex]);
        postIndex--;

        // If this node has no children
        if (inStart == inEnd) return node;

        // Find index of this node in inorder traversal
        int inIndex = search(inorder, inStart, inEnd, node.val);

        // Build right subtree first (since postorder processes right before left)
        node.right = build(inIndex + 1, inEnd);
        node.left = build(inStart, inIndex - 1);

        return node;
    }

    private int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        
        BuildFromInorderPostorder solution = new BuildFromInorderPostorder();
        TreeNode root = solution.buildTree(inorder, postorder);
        System.out.println("Tree constructed from inorder and postorder");
        System.out.println("Root value: " + root.val); // Output: 3
    }
}

```

### ConstructBSTFromPreorder.java

```java
package InterviewPrep.Trees;

public class ConstructBSTFromPreorder {
    // QUESTION: Given an array of integers preorder, which represents the preorder traversal of a BST
    // (i.e., binary search tree), construct the tree and return its root.
    // Example: Input: preorder = [8,5,1,7,10,12]
    //          Output: [8,5,10,1,7,null,12]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int min, int max) {
        if (index >= preorder.length) return null;

        int val = preorder[index];
        if (val < min || val > max) return null;

        TreeNode node = new TreeNode(val);
        index++;
        node.left = build(preorder, min, val);
        node.right = build(preorder, val, max);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        ConstructBSTFromPreorder solution = new ConstructBSTFromPreorder();
        TreeNode root = solution.bstFromPreorder(preorder);
        System.out.println("BST constructed from preorder traversal");
        System.out.println("Root value: " + root.val); // Output: 8
    }
}

```

### InorderTraversal.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    // QUESTION: Given the root of a binary tree, return the inorder traversal of its nodes' values.
    // Inorder traversal: Left -> Root -> Right
    // Example: Input: root = [1,null,2,3]
    //          Output: [1,3,2]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive solution
    public static List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private static void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

    // Iterative solution using stack
    public static List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + inorderTraversalRecursive(root)); // [1, 3, 2]
        System.out.println("Iterative: " + inorderTraversalIterative(root)); // [1, 3, 2]
    }
}

```

### KthSmallestInBST.java

```java
package InterviewPrep.Trees;

import java.util.Stack;

public class KthSmallestInBST {
    // QUESTION: Given the root of a binary search tree, and an integer k, return the kth smallest value
    // (1-indexed) in the tree.
    // Example: Input: root = [3,1,4,null,2], k = 1
    //          Output: 1
    // Time Complexity: O(k + h) where h is the height of the tree
    // Space Complexity: O(h) where h is the height of the tree

    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) {
                return current.val;
            }

            current = current.right;
        }

        return -1; // k is out of bounds
    }

    public static void main(String[] args) {
        // Create BST: [3,1,4,null,2]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest(root, 1)); // Output: 1
        System.out.println(kthSmallest(root, 2)); // Output: 2
        System.out.println(kthSmallest(root, 3)); // Output: 3
        System.out.println(kthSmallest(root, 4)); // Output: 4
    }
}

```

### LevelOrderTraversal.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    // QUESTION: Given the root of a binary tree, return the level order traversal of its nodes' values.
    // (i.e., from left to right, level by level).
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: [[3],[9,20],[15,7]]
    // Time Complexity: O(n)
    // Space Complexity: O(w) where w is the maximum width of the tree

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root)); // [[3], [9, 20], [15, 7]]
    }
}

```

### LowestCommonAncestor.java

```java
package InterviewPrep.Trees;

public class LowestCommonAncestor {
    // QUESTION: Given a binary tree, find the lowest common ancestor (LCA) of two given nodes.
    // The LCA is defined between two nodes p and q as the lowest node in T that has both p and q as descendants.
    // Example: Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    //          Output: 3
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    public static void main(String[] args) {
        // Create tree: [3,5,1,6,2,0,8,null,null,7,4]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left; // 5
        TreeNode q = root.right; // 1

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA: " + (lca != null ? lca.val : "null")); // Output: 3
    }
}

```

### MaxDepth.java

```java
package InterviewPrep.Trees;

public class MaxDepth {
    // QUESTION: Given the root of a binary tree, return its maximum depth.
    // Maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: 3
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive DFS solution
    public static int maxDepthRecursive(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right));
    }

    // Iterative BFS solution using queue
    public static int maxDepthIterative(TreeNode root) {
        if (root == null) return 0;

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {
        // Create tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Recursive: " + maxDepthRecursive(root)); // 3
        System.out.println("Iterative: " + maxDepthIterative(root)); // 3
    }
}

```

### MaxPathSum.java

```java
package InterviewPrep.Trees;

public class MaxPathSum {
    // QUESTION: A path in a binary tree is a sequence of nodes where each pair of adjacent nodes
    // in the sequence has an edge connecting them. A node can only appear in the sequence at most once.
    // The path sum of a path is the sum of the node's values in the path. Return the maximum path sum.
    // Example: Input: root = [-10,9,20,null,null,15,7]
    //          Output: 42 (path: 15 -> 20 -> 7)
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    private static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        maxGain(root);
        return maxSum;
    }

    private static int maxGain(TreeNode node) {
        if (node == null) return 0;

        // Max gain from left and right subtrees (ignore negative gains)
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        // Path sum with current node as the root of the path
        int pathSum = node.val + leftGain + rightGain;

        // Update global maximum
        maxSum = Math.max(maxSum, pathSum);

        // Return the max gain if we continue the path
        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {
        // Create tree: [-10,9,20,null,null,15,7]
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root)); // Output: 42
    }
}

```

### PathSum.java

```java
package InterviewPrep.Trees;

public class PathSum {
    // QUESTION: Given the root of a binary tree and an integer targetSum, return true if the tree has a
    // root-to-leaf path such that adding up all the values along the path equals targetSum.
    // Example: Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
    //          Output: true (5 + 4 + 11 + 2 = 22)
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        
        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    public static void main(String[] args) {
        // Create tree: [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        System.out.println(hasPathSum(root, 22)); // Output: true
        System.out.println(hasPathSum(root, 26)); // Output: false
    }
}

```

### PostorderTraversal.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    // QUESTION: Given the root of a binary tree, return the postorder traversal of its nodes' values.
    // Postorder traversal: Left -> Right -> Root
    // Example: Input: root = [1,null,2,3]
    //          Output: [3,2,1]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive solution
    public static List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private static void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.val);
    }

    // Iterative solution using two stacks
    public static List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + postorderTraversalRecursive(root)); // [3, 2, 1]
        System.out.println("Iterative: " + postorderTraversalIterative(root)); // [3, 2, 1]
    }
}

```

### PreorderTraversal.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    // QUESTION: Given the root of a binary tree, return the preorder traversal of its nodes' values.
    // Preorder traversal: Root -> Left -> Right
    // Example: Input: root = [1,null,2,3]
    //          Output: [1,2,3]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    // Recursive solution
    public static List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }

    // Iterative solution using stack
    public static List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + preorderTraversalRecursive(root)); // [1, 2, 3]
        System.out.println("Iterative: " + preorderTraversalIterative(root)); // [1, 2, 3]
    }
}

```

### RecoverBST.java

```java
package InterviewPrep.Trees;

public class RecoverBST {
    // QUESTION: You are given the root of a binary search tree (BST), where the values of exactly two nodes
    // of the tree were swapped by mistake. Recover the tree without changing its structure.
    // Example: Input: root = [1,3,null,null,2]
    //          Output: [3,1,null,null,2]
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        
        // Swap the values
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        // Check for violation
        if (prev != null && prev.val > node.val) {
            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;

        inorder(node.right);
    }

    public static void main(String[] args) {
        // Create BST with swapped nodes: [1,3,null,null,2] (should be [3,1,null,null,2])
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        RecoverBST solution = new RecoverBST();
        solution.recoverTree(root);
        System.out.println("BST recovered");
        System.out.println("Root value: " + root.val); // Output: 3
    }
}

```

### RightViewOfBinaryTree.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTree {
    // QUESTION: Given the root of a binary tree, imagine yourself standing on the right side of it,
    // return the values of the nodes you can see ordered from top to bottom.
    // Example: Input: root = [1,2,3,null,5,null,4]
    //          Output: [1,3,4]
    // Time Complexity: O(n)
    // Space Complexity: O(w) where w is the maximum width of the tree

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // Add the last node of each level
                if (i == levelSize - 1) {
                    result.add(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [1,2,3,null,5,null,4]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(rightSideView(root)); // [1, 3, 4]
    }
}

```

### SerializeDeserializeBinaryTree.java

```java
package InterviewPrep.Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinaryTree {
    // QUESTION: Design an algorithm to serialize and deserialize a binary tree.
    // Serialization is converting a data structure or object into a sequence of bits.
    // Deserialization is converting the sequence back to the original data structure.
    // Example: Input: root = [1,2,3,null,null,4,5]
    //          Serialized: "1,2,null,null,3,4,null,null,5,null,null"
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    // Encodes a tree to a single string
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private static void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree
    public static TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(nodes);
    }

    private static TreeNode deserializeHelper(Queue<String> nodes) {
        String val = nodes.poll();
        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(nodes);
        node.right = deserializeHelper(nodes);
        return node;
    }

    public static void main(String[] args) {
        // Create tree: [1,2,3,null,null,4,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String serialized = serialize(root);
        System.out.println("Serialized: " + serialized);

        TreeNode deserialized = deserialize(serialized);
        System.out.println("Deserialized root value: " + deserialized.val);
    }
}

```

### SymmetricTree.java

```java
package InterviewPrep.Trees;

public class SymmetricTree {
    // QUESTION: Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
    // Example: Input: root = [1,2,2,3,4,4,3]
    //          Output: true
    // Time Complexity: O(n)
    // Space Complexity: O(h) where h is the height of the tree

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    // Iterative solution using queue
    public static boolean isSymmetricIterative(TreeNode root) {
        if (root == null) return true;

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;

            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        // Create symmetric tree: [1,2,2,3,4,4,3]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println("Recursive: " + isSymmetric(root)); // true
        System.out.println("Iterative: " + isSymmetricIterative(root)); // true

        // Create non-symmetric tree: [1,2,2,null,3,null,3]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        System.out.println("Non-symmetric: " + isSymmetric(root2)); // false
    }
}

```

### TreeNode.java

```java
package InterviewPrep.Trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

```

### ZigzagLevelOrder.java

```java
package InterviewPrep.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {
    // QUESTION: Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
    // (i.e., from left to right, then right to left for the next level and alternate between).
    // Example: Input: root = [3,9,20,null,null,15,7]
    //          Output: [[3],[20,9],[15,7]]
    // Time Complexity: O(n)
    // Space Complexity: O(w) where w is the maximum width of the tree

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (leftToRight) {
                    currentLevel.addLast(node.val);
                } else {
                    currentLevel.addFirst(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(currentLevel);
            leftToRight = !leftToRight;
        }

        return result;
    }

    public static void main(String[] args) {
        // Create tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(zigzagLevelOrder(root)); // [[3], [20, 9], [15, 7]]
    }
}

```


---

# Topic: Trie

## Notes & Concept Guide

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


## Code Solutions

### ImplementTrie.java

```java
package InterviewPrep.Trie;

public class ImplementTrie {
    // QUESTION: A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store
    // and retrieve keys in a dataset of strings. Implement the Trie class with insert, search, and startsWith methods.
    // Time Complexity: O(L) where L is the length of the word
    // Space Complexity: O(N * L) where N is number of words and L is average word length

    private static class TrieNode {
        private TrieNode[] children;
        private boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26]; // Assuming lowercase English letters
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }

    public void insert(String word) {
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

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieNode searchPrefix(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

    public static void main(String[] args) {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // Output: true
        System.out.println(trie.search("app"));     // Output: false
        System.out.println(trie.startsWith("app")); // Output: true
        trie.insert("app");
        System.out.println(trie.search("app"));     // Output: true
    }
}

```

### LongestWordInDictionary.java

```java
package InterviewPrep.Trie;

import java.util.Arrays;
import java.util.List;

public class LongestWordInDictionary {
    // QUESTION: Given an array of strings words, return the longest word in words that can be built one character
    // at a time by other words in words. If there is more than one possible answer, return the longest word with
    // the smallest lexicographical order.
    // Example: Input: words = ["w","wo","wor","worl","world"]
    //          Output: "world"
    // Time Complexity: O(N * L) where N is number of words and L is average word length
    // Space Complexity: O(N * L)

    private static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    public LongestWordInDictionary() {
        root = new TrieNode();
    }

    private void insert(String word) {
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

    private boolean canBuild(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            node = node.children[index];
            if (node == null || !node.isEndOfWord) {
                return false;
            }
        }
        return true;
    }

    public String longestWord(String[] words) {
        // Sort words by length (descending) and lexicographical order
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });

        // Insert all words into trie
        for (String word : words) {
            insert(word);
        }

        // Find the longest word that can be built
        for (String word : words) {
            if (canBuild(word)) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        LongestWordInDictionary solution = new LongestWordInDictionary();
        String[] words1 = {"w", "wo", "wor", "worl", "world"};
        System.out.println(solution.longestWord(words1)); // Output: world

        String[] words2 = {"a", "banana", "app", "ap", "apply", "apple"};
        System.out.println(solution.longestWord(words2)); // Output: apple
    }
}

```

### WordBreak.java

```java
package InterviewPrep.Trie;

import java.util.List;

public class WordBreak {
    // QUESTION: Given a string s and a dictionary of strings wordDict, return true if s can be segmented into
    // a space-separated sequence of one or more dictionary words. Note that the same word in the dictionary
    // may be reused multiple times in the segmentation.
    // Example: Input: s = "leetcode", wordDict = ["leet","code"]
    //          Output: true
    // Time Complexity: O(n^2) with DP, O(n * L) with Trie where L is max word length
    // Space Complexity: O(n) for DP array

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty string is always valid

        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                int len = word.length();
                if (i >= len && dp[i - len] && s.substring(i - len, i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        System.out.println(wordBreak(s, wordDict)); // Output: true

        String s2 = "applepenapple";
        List<String> wordDict2 = List.of("apple", "pen");
        System.out.println(wordBreak(s2, wordDict2)); // Output: true
    }
}

```

### WordSearchII.java

```java
package InterviewPrep.Trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {
    // QUESTION: Given an m x n board of characters and a list of strings words, return all words on the board.
    // Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are
    // horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
    // Example: Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
    //          Output: ["eat","oath"]
    // Time Complexity: O(m * n * 4^L) where L is max word length
    // Space Complexity: O(N * L) for Trie where N is number of words

    private static class TrieNode {
        TrieNode[] children;
        String word;

        public TrieNode() {
            children = new TrieNode[26];
            word = null;
        }
    }

    private TrieNode root;

    public WordSearchII() {
        root = new TrieNode();
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.word = word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        // Build trie from words
        for (String word : words) {
            insert(word);
        }

        Set<String> result = new HashSet<>();
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, root, result);
            }
        }

        return new ArrayList<>(result);
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, Set<String> result) {
        char c = board[i][j];
        if (c == '#' || node.children[c - 'a'] == null) {
            return;
        }

        node = node.children[c - 'a'];
        if (node.word != null) {
            result.add(node.word);
        }

        board[i][j] = '#'; // Mark as visited

        int rows = board.length;
        int cols = board[0].length;

        if (i > 0) dfs(board, i - 1, j, node, result);
        if (j > 0) dfs(board, i, j - 1, node, result);
        if (i < rows - 1) dfs(board, i + 1, j, node, result);
        if (j < cols - 1) dfs(board, i, j + 1, node, result);

        board[i][j] = c; // Restore
    }

    public static void main(String[] args) {
        WordSearchII solution = new WordSearchII();
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> result = solution.findWords(board, words);
        System.out.println("Found words: " + result); // Output: [eat, oath]
    }
}

```


---

# Topic: TwoPointers

## Code Solutions

### ContainerwithMaxWaterTest.java

```java
package InterviewPrep.TwoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// QUESTION: You are given an integer array height of length n. There are n vertical lines drawn such
// that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together
// with the x-axis form a container, such that the container contains the most water. Return the
// maximum amount of water a container can store.
// Example: Input: [1,8,6,2,5,4,8,3,7] -> Output: 49
public class ContainerwithMaxWaterTest {
    @Test
    public void testMaxArea() {
        List<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        Assert.assertEquals(calculateMaxArea(height), 49);
    }

    public int calculateMaxArea(List<Integer> height) {
        int i = 0, j = height.size() - 1;
        int maxArea = Integer.MIN_VALUE;
        while (i <= j) {
            int width = j - i;
            int length = Math.min(height.get(i), height.get(j));
            maxArea = Math.max(maxArea, width * length);

            if (height.get(i) < height.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}

```

### MoveNegativesTest.java

```java
package InterviewPrep.TwoPointers;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

// QUESTION: Given an array of integers, move all negative numbers to the beginning of the array
// while maintaining the relative order among the positive numbers is not required.
// Example: Input: [1, 3, -1, -2, -3, 5, 6, -7] -> Output: [-1, -2, -3, -7, 1, 3, 5, 6]
public class MoveNegativesTest {

    @Test
    public void testMoveNegatives() {
        int[] nums1 = {1, 3, -1, -2, -3, 5, 6, -7};
        moveNegatives(nums1);
        assertEquals(nums1, new int[]{-1, -2, -3, -7, 1, 3, 5, 6}, "Test Case 1 Failed");

        int[] nums2 = {-5, -3, -1, -2, -4};
        moveNegatives(nums2);
        assertEquals(nums2, new int[]{-5, -3, -1, -2, -4}, "Test Case 2 Failed");

        int[] nums3 = {1, 2, 3, 4, 5};
        moveNegatives(nums3);
        assertEquals(nums3, new int[]{1, 2, 3, 4, 5}, "Test Case 3 Failed");

        int[] nums4 = {-1};
        moveNegatives(nums4);
        assertEquals(nums4, new int[]{-1}, "Test Case 4 Failed");

        int[] nums5 = {};
        moveNegatives(nums5);
        assertEquals(nums5, new int[]{}, "Test Case 5 Failed");

        int[] nums6 = {1};
        moveNegatives(nums6);
        assertEquals(nums6, new int[]{1}, "Test Case 6 Failed");

        int[] nums7 = {-1, 1, -2, 2, -3, 3};
        moveNegatives(nums7);
        assertEquals(nums7, new int[]{-1, -2, -3, 1, 2, 3}, "Test Case 7 Failed");
    }

    private void moveNegatives(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

```

### MoveNegativesWithOrderMaintain.java

```java
package InterviewPrep.TwoPointers;

import java.util.Arrays;

public class MoveNegativesWithOrderMaintain {
    // QUESTION: Given an array of integers, move all negative numbers to the beginning of the array
    // while maintaining the relative order of both negative and positive numbers.
    // Example: Input: [-12, 11, -13, -5, 6, -7, 5, -3, -6]
    //          Output: [-12, -13, -5, -7, -3, -6, 11, 6, 5]

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};//-12 -13 -5 -7 -3 -6 11 6 5
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegatives(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (i != j) {
                    int temp = nums[i];
                    for (int k = i; k > j; k--) {
                        nums[k] = nums[k - 1];
                    }
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}


```

### SwapWith.java

```java
package InterviewPrep.TwoPointers;

import java.util.Scanner;

public class SwapWith {
    // QUESTION: Swap two numbers using a temporary variable and also without using a temporary variable.
    // Example: Input: x=10, y=5 -> Output: x=5, y=10
    public static void main(String[] args) {
        int x, y, t; // x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swapping numbers: " + x + "  " + y);
        /* swapping */
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: " + x + "   " + y);
        System.out.println();

        int x1 = 10;
        int y1 = 5;
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println("After swapping: x = " + x1 + ", y = " + y1);
    }
}


```


---

