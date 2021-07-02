package com.company;

public class Main {

    public static void main(String[] args) {
       int[] scores;
        scores = new int[]{83, 90, 83};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println(sum1);

        int total = add(new int[]{11, 12, 13});
        System.out.println(total);
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        return sum;
    }


}
