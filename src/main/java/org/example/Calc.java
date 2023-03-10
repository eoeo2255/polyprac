package org.example;

public class Calc {
    public static int run(String s) {
        boolean plus = s.contains("+");
        boolean minus = s.contains("-");

        String[] str = null;

        if (plus){
            str = s.split(" \\+ ");
        } else {
            str = s.split(" \\- ");
        }

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        if (plus){
            return a+b;
        } else {
            return a-b;
        }

    }
}