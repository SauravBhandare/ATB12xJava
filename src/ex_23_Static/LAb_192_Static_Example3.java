package ex_23_Static;

public class LAb_192_Static_Example3 {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.getName();
        t1.getPassword();
        t1.setName("Bhandare");
        t1.setPassword(67890);



    }


}

class Test{
    static {
        System.out.println("Enter the url");
        System.out.println("Enter the login credentials");
    }

private String name;
private int password;

    public String getName() {
        System.out.println("ENter name" +  " ");
        return name;
    }

    public void setName(String name) {
        System.out.println("Bhandare");
        this.name = name;
    }

    public int getPassword() {
        System.out.println("Enter PAssword" + " ");
        return password;
    }

    public void setPassword(int password) {
        System.out.println("67890");
        this.password = password;
    }


}



