package ru.mirea.Practice11.Task12;

public class ArrayQueueModule {
    private static final int sizeQ = 5;
    private static int front = -1;
    private static int rear = -1;
    private static int size = 0;
    private static Object[] elements = new Object[sizeQ];

    public static void enqueue(Object element) {
        if (size == elements.length)
            System.out.println("Queue full");
        else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % sizeQ;
            elements[rear] = element;
            size++;
        }
    }

    public static Object element() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return null;
        }
        else {
            return elements[front];
        }

    }

    public static Object dequeue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue empty");
            return null;
        }
        else{
            element = elements[front];
            if (front == rear){
                front = -1;
                rear = -1;
            }
            else
                front = (front + 1) % sizeQ;
        }
        size--;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        while (size > 0) {
            dequeue();
        }
    }
}