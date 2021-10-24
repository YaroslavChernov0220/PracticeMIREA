package ru.mirea.Practice10.Task1;

import java.util.Scanner;
public class ConcreteFactory implements ComplexAbstactFactory{

    @Override
    public Complex createComplex() {
        Scanner in = new Scanner(System.in);
        int real = in.nextInt();
        int imaginary = in.nextInt();
        Complex Comp = new Complex(real,imaginary);
        return Comp;
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        Complex Comp = new Complex(real,imaginary);
        return Comp;
    }
}
