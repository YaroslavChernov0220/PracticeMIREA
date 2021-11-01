package ru.mirea.Practice11.Task12;

public interface Queue {
    void enqueue(Object ad);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
    void push(Object element);
}
