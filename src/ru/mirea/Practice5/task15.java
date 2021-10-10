package ru.mirea.Practice5;

public class task15 {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.print(recursion(12345));
    }
}