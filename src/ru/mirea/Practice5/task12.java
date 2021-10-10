package ru.mirea.Practice5;
import java.util.Scanner;
public class task12 {
    public static void Func1()
    {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        if (digit == 0)
            return;

        if (digit % 2 != 0)
            System.out.println((digit));

        Func1();
    }
}
