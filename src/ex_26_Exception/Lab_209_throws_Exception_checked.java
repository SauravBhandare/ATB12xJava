package ex_26_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_209_throws_Exception_checked {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fs = new FileInputStream("C://opt.txt");
    }


}
