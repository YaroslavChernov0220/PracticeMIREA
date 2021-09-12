package ru.mirea.practice1.book;

public class Book {
    private String name;
    private String nameAuthor;
    private int pages;
    private double weight;

    public Book(String n, String nA, int p, double w){

        pages = p;
        name = n;
        weight = w;
        nameAuthor = nA;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPages(){
        return pages;
    }

    public String getName(){
        return name;
    }

    public String getNameAuthor(){
        return nameAuthor;
    }

    public double getWeight(){
        return weight;
    }

    public String toString(){
        return this.name+", автор: "+ this.nameAuthor;
    }

    public void getInfoBook() {
        System.out.println("Книга " + name + ", автор: " + nameAuthor);
        System.out.println("В ней " + pages + " страниц, и она весит " + weight);
    }
}
