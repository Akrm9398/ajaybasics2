import java.util.Scanner;

public class Converter {
    public static void main(String[]args) {
        Scanner heat = new Scanner(System.in);
        System.out.println("Please enter the number in fahrenheit");
        int  number = heat.nextInt();

        float Celius = (float) ((5.0 /9.0) *(number - 32));

        System.out.println("It is " + Celius) ;


    }
}
