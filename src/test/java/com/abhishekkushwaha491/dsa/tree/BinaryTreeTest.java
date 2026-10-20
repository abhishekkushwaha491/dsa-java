package com.abhishekkushwaha491.dsa.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void shouldInsertAndFindValue() {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);

        assertTrue(tree.contains(30));
        assertFalse(tree.contains(99));
    }

    @Test
    void shouldReturnInorderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        assertEquals(java.util.List.of(20, 30, 40, 50, 70), tree.inorderTraversal());
    }

    @Test
    void shouldReturnTreeHeight() {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);

        assertEquals(3, tree.height());
    }
}
