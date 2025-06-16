package ex_18_Constructors;

public class Lab_171_Car {
    public static void main(String[] args) {

        Lab_Car c1 = new Lab_Car();
        c1.name="Tesla";
        System.out.println(c1.name);
        c1.model="XYZ";
        System.out.println(c1.model);
        c1.year=2020;
        System.out.println(c1.year);
        System.out.println(c1.color);


        Lab_Car c2 = new Lab_Car();
        c2.name="Honda";
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);
        System.out.println(c2.color);

    }
}
