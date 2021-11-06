package ru.mirea.Practice17_18.Task3;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void Check(String s) {
        Pattern p = Pattern.compile("(\\d+)([.]?)(\\d*)(\\s)(USD|RUR|EU)");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("Цены: " + m.group());
        }
    }
    public static void main(String[] args) {
        String s1 = "23.78 USD\n22 UDD\n0.002 USD";
        Check(s1);

        String s2 = "10 RUB\n11.11 RUR\n10 RUR\n11.11 RUB\n1.0001 RUR\n137 EU\n144 BC";
        Check(s2);
    }
}
