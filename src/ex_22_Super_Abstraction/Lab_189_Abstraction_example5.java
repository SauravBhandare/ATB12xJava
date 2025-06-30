package ex_22_Super_Abstraction;

public class Lab_189_Abstraction_example5 {
    public static void main(String[] args) {

        numbers n = new A(); // Dynamic dispatch
        A a = new A(); //

        n.display();
    }

    static class A implements numbers {
        @Override
        public void display() {
            System.out.println("display");
        }
    }

    interface numbers {
        int a = 10;

        void display();
    }
}