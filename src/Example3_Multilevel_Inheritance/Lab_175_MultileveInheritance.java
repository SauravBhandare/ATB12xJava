package Example3_Multilevel_Inheritance;

public class Lab_175_MultileveInheritance {
    public static void main(String[] args) {

        Son s1 = new Son();
        System.out.println("Son have access to below");
        System.out.println(s1.Grandfather_property);
        System.out.println(s1.Grandfather_money);
        s1.Grandfather_house();

        System.out.println(s1.Father_property);
        System.out.println(s1.Father_money);
        s1.Father_Car();

        s1.Son_House();

        System.out.println("--------------------------");

        Father f1 = new Father();
        System.out.println("Father have access to below");
        System.out.println(f1.Grandfather_property);
        System.out.println(f1.Grandfather_money);
        f1.Grandfather_house();

        System.out.println(f1.Father_property);
        System.out.println(f1.Father_money);
        f1.Father_Car();

        System.out.println("--------------------------");


        GrandFather g1= new GrandFather();
        System.out.println("GrandFather have access to below");
        System.out.println(g1.Grandfather_property);
        System.out.println(g1.Grandfather_money);
        g1.Grandfather_house();


    }
}
