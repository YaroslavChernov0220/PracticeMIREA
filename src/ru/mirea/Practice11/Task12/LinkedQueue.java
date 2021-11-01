package ru.mirea.Practice11.Task12;

public class LinkedQueue extends AbstractQueue {
    private Node head = null;
    private Node tail = null;

    @Override
    protected boolean doEnqueue(Object element) {
        Node kn = new Node(element);
        if (size() == 0){
            head = kn;
            tail = kn;
        }
        else {
            tail.next = kn;
            kn.prev = tail;
            tail = kn;
        }
        return true;
    }

    @Override
    protected Object doDequeue() {
        Object ret = head.key;
        if (size() != 1){
            head = head.next;
            head.prev = null;
        } else {
            head = null;
            tail = null;
        }
        return ret;
    }

    @Override
    protected void doPush(Object element) {
        Node kn = new Node(element);
        if (size() == 0){
            head = kn;
            tail = kn;
        }
        else {
            kn.next = head;
            head.prev = kn;
            head = kn;
        }
    }
}
