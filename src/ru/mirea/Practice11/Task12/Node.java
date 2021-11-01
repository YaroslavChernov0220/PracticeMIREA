package ru.mirea.Practice11.Task12;

public class Node {
    Object key;
    Node next;
    Node prev;

    public Node(Object key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}