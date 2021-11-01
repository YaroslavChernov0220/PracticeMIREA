package ru.mirea.Practice11.Task12;


public class ArrayQueue extends AbstractQueue {
    final int sizeQ = 5;
    private int front = -1;
    private int rear = -1;
    private Object[] elements = new Object[sizeQ];

    protected boolean doEnqueue(Object element) {
        if (size() == elements.length) {
            System.out.println("Full queue");
            return false;
        }
        else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % sizeQ;
            elements[rear] = element;
            return true;
        }
    }

    protected Object doDequeue() {
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
        return element;
    }

    protected void doPush(Object element) {
        if (front == 0)
            front = 4;
        else
            front = front -1;
        elements[front] = element;
    }
}