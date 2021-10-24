package ru.mirea.Practice11.Task2;

public interface Queue {
    Object dequeue();
    Object element();
    void enqueue(Object o);
    boolean isEmpty();
    boolean clear();
}
