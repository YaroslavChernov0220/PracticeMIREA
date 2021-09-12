package ru.mirea.practice1.book;

public class MainBook {
    public static void main(String[] args) {

        Book b1 = new Book("Собачье сердце", "М.А. Булгаков", 54, 500.9);
        System.out.println(b1);
        b1.getInfoBook();
    }
}
