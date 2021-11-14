package ru.mirea.Practice21_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Base basis = new Base();
        Scanner in = new Scanner(System.in);
        String choice;
        do {
            basis.New();
            basis.Open();
            basis.Save();
            basis.Exit();
            System.out.println("==================");
            System.out.println("Новый файл(yes/no)");
            choice = in.nextLine();
            System.out.println("==================");
        } while(choice.equals("yes"));
    }
}
