package ex_22_Super_Abstraction;

public class Lab_187_Abstraction_Example3 {
    public static void main(String[] args) {
        Home h2 = new Home();
        h2.Family_Gettogether();
    }


}

 class Home implements Family,Family2{

    void Family_Gettogether(){
        System.out.println("Family_Gettogether");
        Father();
        Mother();
        Daughter();
        Uncle();
        Aunty();
        Sister();

     }

     @Override
     public void Father() {
         System.out.println("I am a Father");
     }

     @Override
     public void Mother() {
         System.out.println("I am a Mother");
     }

     @Override
     public void Uncle() {
         System.out.println("I am a Uncle");
     }

     @Override
     public void Aunty() {
         System.out.println("I am a Aunty");
     }
 }
interface  Family{
    void Father();
    void Mother();

    default void Daughter(){
        System.out.println("I am a Daughter");
    }
        }

interface Family2{
    void Uncle();
    void Aunty();

    default void Sister(){
        System.out.println("I am a Sister");
    }
}
