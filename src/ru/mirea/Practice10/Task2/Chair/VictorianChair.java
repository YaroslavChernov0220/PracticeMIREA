package ru.mirea.Practice10.Task2.Chair;

import ru.mirea.Practice10.Task2.Chair.Chair;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    public VictorianChair() {
    }

    public void setAge(int age) {
        this.age = age;
    }
}