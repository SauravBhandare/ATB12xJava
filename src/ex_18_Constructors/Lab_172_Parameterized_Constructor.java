package ex_18_Constructors;

public class Lab_172_Parameterized_Constructor {
    public static void main(String[] args) {

        //Default Constructor
        Lab_Car2_Parameterized_constructor honda= new Lab_Car2_Parameterized_constructor();
        System.out.println(honda.name);
        System.out.println(honda.color);
        System.out.println(honda.model);

        //Parameterized Constructor
        Lab_Car2_Parameterized_constructor hyundai=new Lab_Car2_Parameterized_constructor("Hyundai Ritz","Grey",2015);
        System.out.println(hyundai.name);
        System.out.println(hyundai.color);
        System.out.println(hyundai.model);

        Lab_Car2_Parameterized_constructor bmw=new Lab_Car2_Parameterized_constructor("BMWA1");
        System.out.println(bmw.name);
        System.out.println(bmw.color);

    }
}