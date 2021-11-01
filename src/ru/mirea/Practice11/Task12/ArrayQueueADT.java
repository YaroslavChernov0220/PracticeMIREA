package ru.mirea.Practice11.Task12;

public class ArrayQueueADT {
    private  final int sizeQ = 5;
    private  int front = -1;
    private  int rear = -1;
    private  int size = 0;
    private  Object[] elements = new Object[sizeQ];

    public  static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue.size == queue.elements.length)
            System.out.println("Queue full");
        else {
            if (queue.front == -1)
                queue.front = 0;
            queue.rear = (queue.rear + 1) % queue.sizeQ;
            queue.elements[queue.rear] = element;
            queue.size++;
        }
    }

    public static Object element(ArrayQueueADT queue) {
        if ( isEmpty(queue)) {
            System.out.println("Queue empty");
            return null;
        }
        else {
            return queue.elements[queue.front];
        }
    }

    public static Object dequeue(ArrayQueueADT queue) {
        Object element;
        if (isEmpty(queue)) {
            System.out.println("Queue empty");
            return null;
        }
        else{
            element = queue.elements[queue.front];
            if (queue.front == queue.rear){
                queue.front = -1;
                queue.rear = -1;
            }
            else
                queue.front = (queue.front + 1) % queue.sizeQ;
        }
        queue.size--;
        return element;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        while (queue.size > 0) {
            dequeue(queue);
        }
    }
}