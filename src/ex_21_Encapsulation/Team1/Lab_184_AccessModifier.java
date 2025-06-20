package ex_21_Encapsulation.Team1;

import ex_21_Encapsulation.Team2.Team_India;

public class Lab_184_AccessModifier {
    public static void main(String[] args) {
        Team_India Ind = new Team_India();
        Ind.Ground();  // We can call Ground  method as it is a public
        System.out.println(Ind.umpires);  // We can call umpire function as it is a public


      //  Ind.guard(); // We cannot call bat as it is a private
       // Ind.bat(); // We cannot call dugout as it is protected , we can only call when used in same package



    }



}
