package ru.mirea.Practice21_22;

public class TextDocument implements IDocument {
    public void New() {
        System.out.println("Файл создан (Text)");
    }
    public void Open() {
        System.out.println("Файл открыт (Text)");
    }
    public void Save() {
        System.out.println("Файл сохранен (Text)");
    }
    public void Exit() {
        System.out.println("Файл закрыт (Text)");
    }
}
