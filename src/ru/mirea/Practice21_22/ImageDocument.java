package ru.mirea.Practice21_22;

public class ImageDocument implements IDocument {
    public void New() {
        System.out.println("Файл создан (Image)");
    }
    public void Open() {
        System.out.println("Файл открыт (Image)");
    }
    public void Save() {
        System.out.println("Файл сохранен (Image)");
    }
    public void Exit() {
        System.out.println("Файл закрыт (Image)");
    }
}
