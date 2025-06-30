package ex_23_Static;



public class Lab_190_Static_Example1 {
    public static void main(String[] args) {
        ATB batch = new ATB("Saurav",25);
        ATB batch1 = new ATB("Bhandare",35);

        System.out.println(batch.name);
        System.out.println(batch1.age);
        System.out.println(ATB.course_name);

        System.out.println(batch.course_name);
        System.out.println(batch1.course_name);
        ATB.m1();




    }


}

class ATB {
    String name ; // non static , instance variable , Attribute
    int age ; // non static , instance variable , Attribute

    static String course_name= "ATB12x" ;

    public ATB(String name, int age) {
        this.name = name;
        this.age = age;
    }

     static void m1(){
        System.out.println("I am a Static Function");
    }
}
