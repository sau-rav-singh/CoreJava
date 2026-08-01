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

### 4. **advanced Interval Problems** (1 problem)
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
- [ ] `EmployeeFreeTime.java` - advanced merging

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
