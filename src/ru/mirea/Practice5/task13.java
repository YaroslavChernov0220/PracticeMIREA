package ru.mirea.Practice5;
import java.util.Scanner;

public class task13 {
    public static void Func2()
    {
        Scanner in = new Scanner(System.in);
        int evenNumber = in.nextInt();
        if (evenNumber == 0)
            return;

        int oddNumber = in.nextInt();
        if (oddNumber == 0)
            return;

        System.out.println(oddNumber);
        Func2();
    }
}
