package ru.mirea.Practice10.Task2;

import ru.mirea.Practice10.Task2.Chair.FunctionalChair;
import ru.mirea.Practice10.Task2.Chair.MagicChair;
import ru.mirea.Practice10.Task2.Chair.VictorianChair;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        ChairFactory factory = new ChairFactory();
        c.setChair(factory.createMagicanChair());
        ((MagicChair) c.chair).doMagic();
        c.setChair(factory.createFunctionalChair());
        int sum = ((FunctionalChair) c.chair).sum(15, 3);
        System.out.println("Сумма:  " + sum);
        c.setChair(factory.createVictorianChair());
        ((VictorianChair) c.chair).setAge(67);
        int age = ((VictorianChair) c.chair).getAge();
        System.out.println("Возраст: " + age);
    }
}
