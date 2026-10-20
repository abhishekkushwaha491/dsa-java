package com.abhishekkushwaha491.dsa.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void shouldAddAndContainValue() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        assertTrue(list.contains(20));
        assertEquals(3, list.size());
    }

    @Test
    void shouldRemoveFirstElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);

        assertEquals(1, list.removeFirst());
        assertEquals(1, list.size());
    }

    @Test
    void shouldReverseList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.reverse();
        assertEquals(java.util.List.of(3, 2, 1), list.toList());
    }
}
