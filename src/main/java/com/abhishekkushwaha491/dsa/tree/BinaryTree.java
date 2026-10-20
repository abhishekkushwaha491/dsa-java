package com.abhishekkushwaha491.dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    /**
     * Inserts a value into the binary search tree.
     * Time Complexity: O(log n) average, O(n) worst-case for skewed tree
     * Space Complexity: O(h), where h = tree height
     * Edge cases: empty tree, duplicate value insertion, skewed tree.
     */
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRec(current.left, value);
        } else if (value > current.value) {
            current.right = insertRec(current.right, value);
        }

        return current;
    }

    /**
     * Checks whether a value exists in the tree.
     * Time Complexity: O(log n) average, O(n) worst-case
     * Space Complexity: O(h)
     * Edge cases: empty tree, missing value, duplicate values.
     */
    public boolean contains(int value) {
        return containsRec(root, value);
    }

    private boolean containsRec(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
        return value < current.value ? containsRec(current.left, value) : containsRec(current.right, value);
    }

    /**
     * Returns in-order traversal.
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     * Edge cases: empty tree, single node, skewed tree.
     */
    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderRec(root, result);
        return result;
    }

    private void inorderRec(Node current, List<Integer> result) {
        if (current == null) {
            return;
        }

        inorderRec(current.left, result);
        result.add(current.value);
        inorderRec(current.right, result);
    }

    /**
     * Returns the height of the tree.
     * Time Complexity: O(n)
     * Space Complexity: O(h)
     * Edge cases: empty tree, single node.
     */
    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + Math.max(heightRec(current.left), heightRec(current.right));
    }

    public static class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
