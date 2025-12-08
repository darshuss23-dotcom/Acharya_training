package Programinstatement;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;   // extract last digit
            sum += digit;            // add to sum
            temp = temp / 10;        // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}

