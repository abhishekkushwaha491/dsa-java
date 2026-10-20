package com.abhishekkushwaha491.dsa.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Inserts a value at the front of the list.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Edge cases: empty list, single-node list.
     */
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Inserts a value at the end of the list.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Edge cases: empty list, null value handling.
     */
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
    }

    /**
     * Removes the first element.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Edge cases: empty list.
     */
    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        T value = head.value;
        head = head.next;
        size--;
        return value;
    }

    /**
     * Checks whether the list contains a value.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Edge cases: duplicate values, empty list, value not found.
     */
    public boolean contains(T value) {
        Node<T> current = head;
        while (current != null) {
            if ((value == null && current.value == null) || (value != null && value.equals(current.value))) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Reverses the list in place.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Edge cases: empty list, single node, multiple nodes.
     */
    public void reverse() {
        Node<T> previous = null;
        Node<T> current = head;

        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    /**
     * Returns the size of the list.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int size() {
        return size;
    }

    /**
     * Returns whether the list is empty.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Converts the list into a Java list.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public List<T> toList() {
        List<T> values = new ArrayList<>();
        Node<T> current = head;

        while (current != null) {
            values.add(current.value);
            current = current.next;
        }

        return values;
    }

    private static final class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }
}
