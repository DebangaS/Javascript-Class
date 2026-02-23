package com.debs;

abstract class Vehicle {

    abstract void move(); // must be implemented by child

    void fuel() {         // common method
        System.out.println("Refueling vehicle...");
    }
}

class Car extends Vehicle {

    void move() {
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();   // calls implemented abstract method
        myCar.fuel();   // calls normal method from abstract class
    }
}