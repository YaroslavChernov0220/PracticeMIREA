package ru.mirea.Practice21_22;

public class MusicDocument implements IDocument {
    public void New() {
        System.out.println("Файл создан (Music)");
    }
    public void Open() {
        System.out.println("Файл открыт (Music)");
    }
    public void Save() {
        System.out.println("Файл сохранен (Music)");
    }
    public void Exit() {
        System.out.println("Файл закрыт (Music)");
    }
}
