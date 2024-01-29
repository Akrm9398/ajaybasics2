import java.util.Scanner;


public class Value {

    public static void main(String[]args){
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number");
        int value = number.nextInt();


        int absoulte_value =  Math.abs(value);
        System.out.println("The number is  " + absoulte_value);

    }
}
