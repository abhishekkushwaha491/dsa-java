package com.abhishekkushwaha491.dsa.examples;

import com.abhishekkushwaha491.dsa.array.ArrayUtils;
import com.abhishekkushwaha491.dsa.linkedlist.SinglyLinkedList;
import com.abhishekkushwaha491.dsa.stack.ArrayStack;
import com.abhishekkushwaha491.dsa.tree.BinaryTree;

public class DsaExamples {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 2, 9};
        System.out.println("Max: " + ArrayUtils.findMax(numbers));
        System.out.println("Linear search index: " + ArrayUtils.linearSearch(numbers, 7));

        ArrayUtils.selectionSort(numbers);
        System.out.println("Sorted numbers: " + java.util.Arrays.toString(numbers));

        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println("Linked list contains 2: " + list.contains(2));
        list.reverse();
        System.out.println("Reversed list: " + list.toList());

        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        System.out.println("Tree contains 40: " + tree.contains(40));
        System.out.println("Tree in-order: " + tree.inorderTraversal());
        System.out.println("Tree height: " + tree.height());
    }
}
