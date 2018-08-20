package reverse;

import java.util.Scanner;

// برعکس چاپ کردن اعداد

public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number !!!");

        reverse(input.nextInt());

    }

    public static void reverse(int number) {

        int separator = 0, reverse = 0;

        for (int i = number; i > 0; i /= 10) {

            separator = i % 10;

            reverse *= 10;
            reverse+=separator;
        }

        System.out.println(String.format("The reversed number ------>  %d", reverse));

    }
}
