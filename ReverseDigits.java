package reversedigits;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:\t");
        int num = input.nextInt();

        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
        System.out.println("\n");

    }

}
