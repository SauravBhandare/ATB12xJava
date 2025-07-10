package ex_28_Generics;

import java.util.ArrayList;
import java.util.List;

public class LAb_215_Generic_List2 {
    public static void main(String[] args) {
        // Login PAge
        // USername , Password , Login Icon

       // List<Integer> login_page = new ArrayList<Integer>();  If we pass integer then only Integer will be accepted

        List login_page = new ArrayList<>();
        login_page.add("Saurav");
        login_page.add("Pass@1234");
        login_page.add(true);


    }
}
