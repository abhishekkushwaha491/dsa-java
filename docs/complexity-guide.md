# Complexity Guide

This guide summarizes the common time and space complexity of the implementations in this repository.

## Arrays

| Operation | Time Complexity | Space Complexity | Notes |
|---|---:|---:|---|
| Linear search | O(n) | O(1) | Best for unsorted arrays |
| Selection sort | O(n^2) | O(1) | In-place sort |
| Reverse array | O(n) | O(n) | Extra output array |
| Remove duplicates | O(n) | O(n) | Depends on chosen approach |

## Linked list

| Operation | Time Complexity | Space Complexity | Notes |
|---|---:|---:|---|
| Insert at head | O(1) | O(1) | Constant-time insertion |
| Insert at tail | O(n) | O(1) | Requires traversal |
| Search | O(n) | O(1) | Linear traversal |
| Reverse | O(n) | O(1) | In-place reversal |

## Stack

| Operation | Time Complexity | Space Complexity | Notes |
|---|---:|---:|---|
| Push | O(1) amortized | O(1) | Usually constant-time |
| Pop | O(1) amortized | O(1) | Constant-time |
| Peek | O(1) | O(1) | Constant-time |
| Search | O(n) | O(1) | Requires scanning |

## Tree

| Operation | Time Complexity | Space Complexity | Notes |
|---|---:|---:|---|
| Insert | O(log n) average | O(1) recursive stack | Balanced BST |
| Search | O(log n) average | O(1) | If the tree is balanced |
| In-order traversal | O(n) | O(h) | h = tree height |
| Height | O(n) | O(h) | Worst case when skewed |

## Binary search

| Operation | Time Complexity | Space Complexity | Notes |
|---|---:|---:|---|
| Binary search | O(log n) | O(1) | Works only on sorted arrays |

## Bit manipulation

| Operation | Time Complexity | Space Complexity | Notes |
|---|---:|---:|---|
| Bit count | O(k) | O(1) | k = number of bits |
| Check set bit | O(1) | O(1) | Uses bit masking |

## Summary

A good DSA repo should not only show the implementation but also explain:
- when to use the structure
- how it behaves on large inputs
- what edge cases matter most
