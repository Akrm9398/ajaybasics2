import java.util.Scanner;
public class Month
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter month number 1 to 12:");
            int monthNumber = scanner.nextInt();
            if(monthNumber >0 && monthNumber <13)
            {
            String monthName = getMonthName(monthNumber);

            System.out.println("Month name: " + monthName);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month number";
        }
    }
}
