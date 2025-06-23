package ex_22_Super_Abstraction;

public class Lab_186_Abstraction_Example2 {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.startvehicle();
    }
}

class WagonR extends Engine implements tyres,mirror{

    void startvehicle(){
        System.out.println("Insert Key");
        startengine();
        tyreone();
        tyretwo();
        tyrethree();
        tyrefour();
        mirrors();
        stopengine();
    }
    @Override
    void startengine() {
        System.out.println("Start Engine");
    }

    @Override
    public void tyreone() {
        System.out.println("Tyre1");
    }

    @Override
    public void tyretwo() {
        System.out.println("Tyre2");
    }

    @Override
    public void tyrethree() {
        System.out.println("Tyre3");
    }

    @Override
    public void tyrefour() {
        System.out.println("Tyre4");
    }
}

abstract class Engine{

   abstract void startengine();

    void stopengine(){
        System.out.println("Stop Engine");
    }
}


interface  tyres{

    void tyreone();
    void tyretwo();
    void tyrethree();
    void tyrefour();
}

interface mirror{
    default void mirrors() {
        System.out.println("WagonR has 2 mirrors");
    }
}