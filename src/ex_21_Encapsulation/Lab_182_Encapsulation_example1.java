package ex_21_Encapsulation;

public class Lab_182_Encapsulation_example1 {
    public static void main(String[] args) {

        VWOLogin Loginpage= new VWOLogin("Saurav","Pass@1234");


        System.out.println(Loginpage.getUsername());
        System.out.println(Loginpage.getPassword());

        Loginpage.setUsername("Bhandare");
        System.out.println(Loginpage.getUsername());

        Loginpage.setPassword("Test@1234",true);
        System.out.println(Loginpage.getPassword());


    }
}

class VWOLogin{
  private   String username ;
   private String password ;

    // Parameterized constructor (Right click __> Generate --> Constructor --> select username and password)
    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Right click --> Generate --> Getter and Setter
    // In Getter and Setter we can get the value and Set he value
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean Admin) {
        if(Admin){
            this.password = password;
        }
        else{
            System.out.println("Only Admin USer can change the password");
        }
    }
}
