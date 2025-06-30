package ex_24_ENUM;

public class LAb_194_Enum_Example2 {
    public static void main(String[] args) {
       System.out.println(browsers.Chrome.getTab());
    }
}

enum browsers {
    Chrome("First Tab"),
     Mozilla("2nd Tab"),
     Firefox("3rd Tab");

    private String tab;

    browsers(String tab) {
        this.tab = tab;
    }

    public String getTab() {
        return tab;
    }
}
