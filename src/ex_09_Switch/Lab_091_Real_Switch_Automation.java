package ex_09_Switch;

import java.util.Scanner;

public class Lab_091_Real_Switch_Automation {

    public static void main(String[] args) {

        // Ask the user to enter from which browser he wants to run the test
        // I will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // Chrome,CHROME,CHrome --> chrome

        switch(browser)
        {
            case "chrome":
            System.out.println("Open the chrome browser");
            break;
            case "firefox":
                System.out.println("Open the firefox browser");
                break;
                case "edge":
            System.out.println("Open the edge browser");
                break;
            default:
                System.out.println("Enter valid browser name");

        }

    }
}





