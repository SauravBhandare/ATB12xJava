package ex_21_Encapsulation.Team2;

public class Jr_Team_India {
    public static void main(String[] args) {

        Team_India Ind = new Team_India();
        // Jr_Team_India can use Team_India bat as it is protected means it can be used if it is inside the same package
        System.out.println(Ind.bat);
        // Jr_Team_India can use Umpires as it is public function
        System.out.println(Ind.umpires);
       //  Jr_Team_India cannot use Guard as it is a private
        //System.out.println(Ind.guard);


        // Jr_Team_India can use Team_India dugout as it is protected means it can be used if it is inside the same package
        Ind.dugout();
        // Jr_Team_India can use ground method as it is public
        Ind.Ground();
        // Jr_Team_India can use Jersey method as it is private
       // Ind.jersey();


    }



}
