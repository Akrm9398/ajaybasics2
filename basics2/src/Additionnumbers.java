import java.util.Scanner;

public class Additionnumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a two digit or three digit number: ");
        int a = number.nextInt();

        if (a >= 10 & a <= 999) {
            int sum = 0;
            int tempNumber = a;

            while (tempNumber > 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }

            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Invalid input. Please enter a two digit or three digit number.");
        }


    }
}
