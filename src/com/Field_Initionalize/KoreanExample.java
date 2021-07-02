package com.Field_Initionalize;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "1232-12312");

        System.out.println("k1.nation: " + k1.nation);
        System.out.println("k1.name: " + k1.name);
        System.out.println("k1.ssn: " + k1.ssn);

        Korean k2 = new Korean("오자바", "123232- 2312");

        System.out.println("k1.nation: " + k2.nation);
        System.out.println("k1.name: " + k2.name);
        System.out.println("k1.ssn: " + k2.ssn);
    }
}
