package ex_23_Static;

public class Lab_191_Static_Example2 {
    public static void main(String[] args) {
        ATB12x course = new ATB12x("Saurav",703889098);
        ATB12x course1 = new ATB12x("Bhandare", 890987680);

        course.display();
        course1.display();

        course.lecture_time();
        course1.lecture_time();

        ATB12x.lecture_time();
        System.out.println(ATB12x.batch);
    }




}

class ATB12x{
    String name;
    int phone_number;

    static String batch="ATB12x";

    public ATB12x(String name, int phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    void display(){
        System.out.println(this.name + this.phone_number);
    }

   static void lecture_time(){
       System.out.println("Lecture is scheduled at 9 am to 12 pm");
   }
}

