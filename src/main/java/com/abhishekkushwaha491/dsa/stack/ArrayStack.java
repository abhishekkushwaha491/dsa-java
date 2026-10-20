package com.abhishekkushwaha491.dsa.stack;

import java.util.NoSuchElementException;

public class ArrayStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.data = new Object[Math.max(1, capacity)];
        this.top = -1;
    }

    /**
     * Pushes an element to the top of the stack.
     * Time Complexity: O(1) amortized
     * Space Complexity: O(1) amortized
     * Edge cases: full stack, null value insertion.
     */
    public void push(T value) {
        if (top == data.length - 1) {
            resize();
        }
        data[++top] = value;
    }

    /**
     * Removes and returns the top element.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Edge cases: empty stack.
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        T value = (T) data[top];
        data[top] = null;
        top--;
        return value;
    }

    /**
     * Returns the top element without removing it.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Edge cases: empty stack.
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return (T) data[top];
    }

    /**
     * Returns whether the stack is empty.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the number of items in the stack.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int size() {
        return top + 1;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
