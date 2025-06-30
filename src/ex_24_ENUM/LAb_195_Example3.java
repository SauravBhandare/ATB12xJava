package ex_24_ENUM;

public class LAb_195_Example3 {
    public static void main(String[] args) {
        System.out.println(names.name1.getIdentifier());
        System.out.println(names.name2.getIdentifier());
    }
}

enum names{
    name1("Saurav"),
    name2("Test"),
    name3("ABC");

    private String identifier;

    names(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
