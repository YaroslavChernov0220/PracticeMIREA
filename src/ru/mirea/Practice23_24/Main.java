package ru.mirea.Practice23_24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        ParserHTML ex1 = new ParserHTML();


        String csvFilename = "src/ru/mirea/java/practice23/practice24/movementList.csv";
        List<String> list = Files.readAllLines(Paths.get(csvFilename));
        DateCompany dateCompany = new DateCompany();
        for(int i=1;i<list.size();i++){
            dateCompany.newDateCompany(list.get(i));
        }
        dateCompany.outResult();
    }
}