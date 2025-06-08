package ex_16_Arrays;

public class Lab_158_Arrays_Additionofnumbers {

    public static void main(String[] args) {

        int[] numbers = {42,13,53,2,42,45,2};
        int sum = 0;

        for (int i = 0 ; i< numbers.length ; i++){
            sum = sum + numbers[i];
        }

        System.out.println(sum);
    }
}
