package ru.mirea.Practice10.Task2;

import ru.mirea.Practice10.Task2.Chair.Chair;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("sit");
    }

    public Client() {
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
