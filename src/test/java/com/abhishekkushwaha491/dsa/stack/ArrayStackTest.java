package com.abhishekkushwaha491.dsa.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void shouldPushAndPopValues() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.peek());
    }

    @Test
    void shouldReportEmptyState() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }
}
