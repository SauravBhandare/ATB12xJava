package Example4_Hierarchichal_Inheritance;

public class Lab_176_Hirarchichal_Inheritance {
    public static void main(String[] args) {

        Son1 s1 = new Son1();
        System.out.println(s1.property);
        System.out.println(s1.money);
        s1.house();
        s1.Car();
        s1.age();

        System.out.println("-------------------");

        Son2 s2 = new Son2();
        System.out.println(s2.property);
        System.out.println(s2.money);
        s2.house();
        s2.Car();
        s2.age();

        System.out.println("-------------------");

        Son3 s3 = new Son3();
        System.out.println(s3.property);
        System.out.println(s3.money);
        s3.house();
        s3.Car();
        s3.age();

        System.out.println("--------------------");

        Father f1 = new Father();
        System.out.println(f1.property);
        System.out.println(f1.money);
        f1.house();
        f1.Car();



    }
}
