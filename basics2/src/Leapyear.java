import java.security.PublicKey;
import java.util.Scanner;

import static javax.management.Query.or;

public class Leapyear {

    public  static  void main(String[]args){

        Scanner Year = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int i = Year.nextInt();

        if (i % 4 == 0 & i % 100 != 0) {
            System.out.println(i +  " is a leap year");
        }
        else if (i % 400 == 0){
            System.out.println( i +  " is a leap year");
        }
        else{
            System.out.println(i + "is not a leap year");
        }



    }
}