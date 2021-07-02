package com.advancedFor;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 123, 12, 12, 21};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        System.out.println(sum);

        double avg = (double) sum / scores.length;
        System.out.println(avg);
    }
}
