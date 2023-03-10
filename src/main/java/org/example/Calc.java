package org.example;

public class Calc {
    public static int run(String s) {
        String[] str = s.split(" \\+ ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        return a + b;
    }

    public static int min(String s) {
        String[] str = s.split(" \\- ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        return a - b;
    }
}