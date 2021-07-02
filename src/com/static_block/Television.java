package com.static_block;

public class Television {
    static String company = "samsung";
    static String model= "LCD";
    static String info;
    static int From1TO10Sum;

    static {
        info = company + "-" + model;

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        From1TO10Sum = sum;
    }
}
