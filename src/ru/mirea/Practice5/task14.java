package ru.mirea.Practice5;
import java.util.Scanner;

public class task14 {
    public static void GoToNumber(int digit)
    {
        if (digit <= 0)
            return;

        int number = digit % 10;
        digit = digit / 10;
        GoToNumber(digit);
        System.out.print(number + " ");
    }
}
