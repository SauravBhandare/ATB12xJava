package ex_21_Encapsulation.Team2;

public class Team_India {


    String player_id = "Saurav";
    private String guard = "Yellow";
    protected String bat= "JR";
    public String umpires= "Madan";


    public void Ground() {
        System.out.println("This is a Public Ground");
    }

    private void jersey() {
        System.out.println("This is a Private Jersey");
    }

  protected void dugout(){
        System.out.println("This is a Protected dugout");
   }

}
