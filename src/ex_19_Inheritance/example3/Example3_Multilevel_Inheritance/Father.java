package ex_19_Inheritance.example3.Example3_Multilevel_Inheritance;

public class Father extends GrandFather{
     String Father_property= "5 Acres";
     int Father_money= 2000;

     void Father_house(){
         System.out.println("I have a 2 BHK house in Mumbai");
     }
     void Father_Car(){
         System.out.println("I have a BMW Car");
     }
}
