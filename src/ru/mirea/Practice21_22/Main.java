package ru.mirea.Practice21_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Scanner in = new Scanner(System.in);
        String choice;
        do {
            frame.New();
            frame.Open();
            frame.Save();
            frame.Exit();
            System.out.println("Создать новый документ? (Да/Нет)");
            choice = in.nextLine();
        } while(choice.equals("Да"));
    }
}
