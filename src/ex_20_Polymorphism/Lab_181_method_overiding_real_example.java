package ex_20_Polymorphism;

public class Lab_181_method_overiding_real_example {
    public static void main(String[] args) {
        Firefoxbrowser f1 = new Firefoxbrowser();
        f1.Openbrowser();

        Chromebrowser c1 = new Chromebrowser();
        c1.Openbrowser();

        CommonTestCase c2= new CommonTestCase();
        c2.Openbrowser();
    }

}

class CommonTestCase {

    void Openbrowser() {
        System.out.println("Open the browser");
    }
}

class Chromebrowser extends CommonTestCase{
    @Override
    void Openbrowser(){
        System.out.println("Open Chrome browser");
}
}

class Firefoxbrowser extends CommonTestCase{
    @Override
    void Openbrowser(){
        System.out.println("Open Firefox browser");
    }
}

