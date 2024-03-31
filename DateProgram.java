import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String userInput = scanner.nextLine();

        LocalDate date = null;
        try {
            date = LocalDate.parse(userInput);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter date in format YYYY-MM-DD.");
            System.exit(1);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Entered date: " + formattedDate);

        scanner.close();
    }
}
