import java.util.Scanner;

public class Caliculator {

    // Addition method
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication method
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division method
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) to indicate an error
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);

        // Division
        double quotient = divide(num1, num2);
        if (!Double.isNaN(quotient)) {
            System.out.println("Result of division: " + quotient);
        }

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Close Scanner
        scanner.close();
    }
}
