# HashMaps & Frequency Problems - Interview Prep Guide

## Overview
This folder contains **9 problems** focused on hash-based data structures, frequency counting, and grouping patterns.

## Problem Categories

### 1. **Anagram Problems** (2 problems)
- `GroupAnagrams.java` - Group all anagrams together (multiple approaches)
- `ValidAnagram.java` - Check if two strings are anagrams (multiple approaches)

**Techniques**:
- Sorting characters: Time O(n log n), Space O(n)
- HashMap: Time O(n), Space O(n)
- Character array (26 letters): Time O(n), Space O(1)

**Interview Focus**: Compare approaches, discuss tradeoffs

### 2. **Character Frequency** (3 problems)
- `CharacterFrequency.java` - Count character occurrences
- `FirstNonRepeatingCharacter.java` - First non-repeating character
- `SecondMostFrequentChar.java` - Second most frequent
- `MaxMinCharacterFrequency.java` - Max and min frequency

**Techniques**: HashMap, LinkedHashMap (for order), Array counting

### 3. **Integer/Element Frequency** (3 problems)
- `IntegerFrequency.java` - Count integer occurrences
- `ArrayElementFrequency.java` - Frequency of array elements

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
- [ ] `CharacterFrequency.java` - Simple frequency counting
- [ ] `IntegerFrequency.java` - Count occurrences
- [ ] `ValidAnagram.java` - String comparison method

### Medium Level
- [ ] `GroupAnagrams.java` - **MOST IMPORTANT** - Multiple approaches
- [ ] `FirstNonRepeatingCharacter.java` - First non-repeating
- [ ] `SecondMostFrequentChar.java` - Min heap approach
- [ ] `ArrayElementFrequency.java` - Map all elements

### Hard Level
- [ ] `MaxMinCharacterFrequency.java` - Complex frequency queries
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
**See**: `ValidAnagram.java`

### 2. Group Anagrams
**Problem**: Given array of strings, group anagrams together
**Key Insight**: Anagrams have same sorted characters
**Solution Strategy**:
1. Sort each word's characters
2. Use as HashMap key
3. Group words by key
**See**: `GroupAnagrams.java` (has multiple approaches!)

### 3. Find First Non-Repeating Character
**Problem**: Return first character that appears only once
**Solution**:
1. Count all frequencies (HashMap)
2. Iterate through string to maintain order
3. Return first char with count = 1
**See**: `FirstNonRepeatingCharacter.java`

### 4. Character Frequency Analysis
**Problem**: Analyze character distribution
**Applications**:
- Frequency analysis in cryptography
- Data compression analysis
- Natural language processing
**See**: `CharacterFrequency.java`

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

