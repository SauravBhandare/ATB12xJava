package Tasks;

public class Task_4_Switch {

    // COunt the number of words in a String

    public static void main(String[] args) {

        String data = "My name is Saurav Bhandare and I am a QA";
         String[] word = data.trim().split("\\s+");

         int wordcount = word.length;

        System.out.println("Number of words in a String are :" + wordcount);
        

    }
}
