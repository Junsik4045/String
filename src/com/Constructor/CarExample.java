package com.Constructor;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Car1.company: " + car1.company);
        System.out.println("Car1.model: " + car1.model);
        System.out.println("Car1.color: " + car1.color);
        System.out.println("Car1.speed: " + car1.maxSpeed);

        Car car2 = new Car("자가용");
        System.out.println("Car2.company: " + car2.company);
        System.out.println("Car2.model: " + car2.model);
        System.out.println("Car2.color: " + car2.color);
        System.out.println("Car2.speed: " + car2.maxSpeed);


        Car car3 = new Car("자가용", "빨강");
        System.out.println("Car3.company: " + car3.company);
        System.out.println("Car3.model: " + car3.model);
        System.out.println("Car3.color: " + car3.color);
        System.out.println("Car3.speed: " + car3.maxSpeed);




        Car car4 = new Car("자가용", "빵강", 200);
        System.out.println("Car4.company: " + car4.company);
        System.out.println("Car4.model: " + car4.model);
        System.out.println("Car4.color: " + car4.color);
        System.out.println("Car4.speed: " + car4.maxSpeed);

    }
}