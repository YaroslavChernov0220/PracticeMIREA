package ru.mirea.Practice21_22;

import java.util.Scanner;

public class Frame {
    private IDocument Document;
    private IDocumentCreate DocumentCreate;
    public void New(){
        Scanner in = new Scanner(System.in);
        System.out.println("Text, Image, Music");
        String nameDocument = in.nextLine();
        if (nameDocument.equals("Text")){
            DocumentCreate = new CreateTextDocument();
            Document = DocumentCreate.CreateNew();
            Document.New();
        }
        if (nameDocument.equals("Image")){
            DocumentCreate = new CreateImageDocument();
            Document = DocumentCreate.CreateNew();
            Document.New();
        }
        if (nameDocument.equals("Music")){
            DocumentCreate = new CreateMusicDocument();
            Document = DocumentCreate.CreateNew();
            Document.New();
        }
    }
    public void Open(){
        Document.Open();
    }
    public void Save(){
        Document.Save();
    }
    public void Exit(){
        Document.Exit();
    }
}