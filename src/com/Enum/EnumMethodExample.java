package com.Enum;

public class EnumMethodExample {

    public static void main(String[] args) {
        Week today = Week.SUNDAY;
        String name = today.name();


        System.out.println(name);

        int ordinal = today.ordinal();
        System.out.println(ordinal);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result = day1.compareTo(day2);

        System.out.println(result);

    }

}
