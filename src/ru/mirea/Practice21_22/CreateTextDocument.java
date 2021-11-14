package ru.mirea.Practice21_22;

public class CreateTextDocument implements IDocumentCreate {
    private TextDocument text;
    public IDocument CreateNew() {
        text = new TextDocument();
        return text;
    }
    public IDocument CreateOpen() {
        return text;
    }
}