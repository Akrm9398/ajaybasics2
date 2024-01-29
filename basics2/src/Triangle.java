import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner triangle = new Scanner(System.in);
        System.out.println("Please enter the first angle");
        int x = triangle.nextInt();
        System.out.println("Please enter the second angle");
        int y = triangle.nextInt();
        System.out.println("Please enter the third angle");
        int z = triangle.nextInt();

        int Total = x + y + z;

        if (Total == 180) {
            System.out.println("It is a triangle");
            if (x == y & y == z) {
                System.out.println("It is a Equilateral triangle");
            } else if (x == y || y == z || x == z) {
                System.out.println("It is a Isosceles triangle");
            } else {
                System.out.println("It is a Scalene triangle");
            }
        }else {
            System.out.println("It is not a triangle");
        }


    }
}
