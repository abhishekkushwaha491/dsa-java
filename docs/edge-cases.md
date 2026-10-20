# Edge Cases Guide

This guide explains common edge cases to test in DSA implementations.

## Arrays

- empty array
- single-element array
- duplicate values
- already sorted array
- reverse-sorted array
- array containing negative numbers
- null array reference

### Example checks

- searching for a missing element
- searching for the first or last element
- duplicate values in a sorted array
- large arrays with repeated values

## Linked list

- empty list
- single node list
- list with duplicate values
- cyclic list (should be detected if relevant)
- removing first element
- removing last element
- reversing a list of size 1

## Stack

- pushing to an empty stack
- popping from an empty stack
- stack with one item
- loading many items to trigger growth
- peeking an empty stack

## Tree

- empty tree
- single-node tree
- skewed tree
- balanced tree
- duplicate insertion values
- searching for a value not present

## Binary search

- empty array
- single element array
- target before first index
- target after last index
- duplicate values in sorted array

## General rule

Every implementation should be tested for:
- empty input
- smallest valid input
- largest valid input
- invalid input
- duplicates and repeated values
- ordered and unordered data
