package ex_22_Super_Abstraction;

public class Lab_184_Super_Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}

class Vehicle {
    public int speed = 200;

    Vehicle() {
        System.out.println("Default Constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameterized Constructor");
    }

    void message() {
        System.out.println("No return no Argument");
    }

    void message(int a) {
        System.out.println("PC Argument");
    }

    void display() {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle {
    private int speed = 250;

    Car() {
        super(); // calls Vehicle's constructor
    }

    Car(int a) {
        System.out.println("PC Car");
    }

        void display(){
            System.out.println("Vehicle Car");
            System.out.println(super.speed);
            System.out.println(this.speed);
            super.display();


        }
    }






