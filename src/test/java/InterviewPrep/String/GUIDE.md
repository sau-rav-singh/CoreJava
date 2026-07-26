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

