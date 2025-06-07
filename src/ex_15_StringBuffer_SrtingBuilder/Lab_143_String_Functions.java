package ex_15_StringBuffer_SrtingBuilder;

public class Lab_143_String_Functions {

    public static void main(String[] args) {

    //    String name = "Saurav";
     //   System.out.println(name.charAt(2));  // char starts from 0
     //   System.out.println(name.length());  // length starts from 1



                String actual = " Welcome to Selenium Automation ";
                String expected = "selenium";

                // 1. length()
                System.out.println("Length: " + actual.length()); // 32

                // 2. trim()
                String trimmed = actual.trim();
                System.out.println("Trimmed: " + trimmed); // "Welcome to Selenium Automation"

                // 3. toLowerCase() / toUpperCase()
                System.out.println("Lowercase: " + trimmed.toLowerCase()); // welcome to selenium automation
                System.out.println("Uppercase: " + trimmed.toUpperCase()); // WELCOME TO SELENIUM AUTOMATION

                // 4. contains()
                System.out.println("Contains 'Selenium': " + trimmed.contains("Selenium")); // true

                // 5. equals()
                System.out.println("Equals: " + expected.equals("selenium")); // true

                // 6. equalsIgnoreCase()
                System.out.println("EqualsIgnoreCase: " + expected.equalsIgnoreCase("Selenium")); // true

                // 7. startsWith() / endsWith()
                System.out.println("Starts with 'Welcome': " + trimmed.startsWith("Welcome")); // true
                System.out.println("Ends with 'Automation': " + trimmed.endsWith("Automation")); // true

                // 8. substring()
                System.out.println("Substring: " + trimmed.substring(11, 19)); // Selenium

                // 9. charAt()
                System.out.println("Character at index 0: " + trimmed.charAt(0)); // W

                // 10. indexOf()
                System.out.println("Index of 'S': " + trimmed.indexOf('S')); // 11

                // 11. lastIndexOf()
                System.out.println("Last index of 'o': " + trimmed.lastIndexOf('o')); // 20

                // 12. replace()
                System.out.println("Replace 'Selenium' with 'Java': " + trimmed.replace("Selenium", "Java")); // Welcome to Java Automation

                // 13. isEmpty()
                String emptyStr = "";
                System.out.println("Is Empty: " + emptyStr.isEmpty()); // true

                // 14. isBlank() [Java 11+]

            }
}
