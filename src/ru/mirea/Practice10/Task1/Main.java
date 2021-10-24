package ru.mirea.Practice10.Task1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory a = new ConcreteFactory();
        Complex Comp1 = a.createComplex();
        Complex Comp2 = a.createComplex(5,6);
        System.out.println(Comp1.toString());
        System.out.println(Comp2.toString());
    }
}
