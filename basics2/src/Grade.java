import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        double totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid mark.");
                System.out.print("Mark: ");
                scanner.next(); // Consume invalid input
            }
            totalMarks += scanner.nextDouble();
        }

        double totalPercentage = (totalMarks / 500) * 100;

        String grade = determineGrade(totalPercentage);

        System.out.println("Total Percentage: " + totalPercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String determineGrade(double totalPercentage) {
        if (totalPercentage >= 90) return "Grade A";
        else if (totalPercentage >= 70) return "Grade B";
        else if (totalPercentage >= 50) return "Grade C";
        else if (totalPercentage >= 30) return "Grade D";
        else return "Grade F";
    }
}
