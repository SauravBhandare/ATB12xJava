package ex_17_OOPS;

import org.w3c.dom.ls.LSOutput;

public class LAb_168_OOps {
    public static void main(String[] args) {
        Cat c1 = new Cat();  // Object 1
        Cat c2= null; // no object
        new Cat();  // Object 2 but no Object reference

        c1.run();
        c1.speak();
        c2.run();  //java.lang.NullPointerException



    }

    static class Cat{
        String name ="Blacky";
        String color = "Black";
        int age = 5;
        String size= "Large";

        void run(){
            System.out.println("Cat can run");
        }
        void speak(){
            System.out.println("Meow");
        }
    }
}
