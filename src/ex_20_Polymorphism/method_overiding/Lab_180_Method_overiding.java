package ex_20_Polymorphism.method_overiding;

public class Lab_180_Method_overiding {
    public static void main(String[] args) {

 // It will call whose object is available
        Son s1 = new Son();  // new Son is object
        s1.house();
        s1.car();
        s1.bike();

// It will call whose object is available
        Father f1= new Father();  //new Father is Object
        f1.house();
        f1.bike();

        // Dynamic Driven (Father is Parent class / datatype of f2 object reference)
        // It will call whose object is available
        Father f2 = new Son(); // new Son is object
        f2.house();
        f2.bike();
    }
}