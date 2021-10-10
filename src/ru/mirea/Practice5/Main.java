package ru.mirea.Practice5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("Select a task: ");
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();

        switch (digit)
        {
            case 1:
                task12.Func1();
                break;
            case 2:
                task13.Func2();
                break;
            case 3:
                digit = in.nextInt();
                task14.GoToNumber(digit);
                break;
        }
    }
}