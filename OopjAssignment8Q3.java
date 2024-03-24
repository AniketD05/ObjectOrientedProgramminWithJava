
import java.util.Scanner;

public class OopjAssignment8Q3 {

    private static final int MAX_FLIGHTS = 5;
    private static final int MAX_USERS = 10;

    private String[] flightNumbers = { "F1001", "F1002", "F1003", "F1004", "F1005" };
    private String[] origins = { "New York", "Los Angeles", "Chicago", "Houston", "San Francisco" };
    private String[] destinations = { "Los Angeles", "Chicago", "Houston", "San Francisco", "New York" };
    private int[] totalSeats = { 100, 120, 80, 90, 110 };
    private int[] availableSeats = { 100, 120, 80, 90, 110 };

    private String[] userNames = new String[MAX_USERS];
    private String[] emails = new String[MAX_USERS];
    private String[] contactNumbers = new String[MAX_USERS];

    private int flightCount = MAX_FLIGHTS;
    private int userCount = 0;

    private Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        if (userCount < MAX_USERS) {
            System.out.print("Enter your name: ");
            userNames[userCount] = scanner.nextLine();
            System.out.print("Enter your email: ");
            emails[userCount] = scanner.nextLine();
            System.out.print("Enter your contact number: ");
            contactNumbers[userCount] = scanner.nextLine();
            System.out.println("--------------------------------------------------");
            System.out.println("User registered successfully!");
            userCount++;
        } else {
            System.out.println("Maximum number of users reached. Cannot register more users.");
        }
    }

    public void displayFlights() {
        System.out.println("\nAvailable Flights:");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < flightCount; i++) {
            System.out.println((i + 1) + ". " + flightNumbers[i] + " - " + origins[i] + " to " + destinations[i] + " ("
                    + availableSeats[i] + "/" + totalSeats[i] + " seats available)");
        }
        System.out.println("--------------------------------------------------");
    }

    public void reserveSeat() {
        displayFlights();
        System.out.print("\nEnter the index of the flight to reserve a seat: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("--------------------------------------------------");
        if (index >= 0 && index < flightCount) {
            if (availableSeats[index] > 0) {
                System.out.println("Seat reserved successfully on flight " + flightNumbers[index]);
                availableSeats[index]--;
            } else {
                System.out.println("Sorry, no seats available on this flight.");
            }
        } else {
            System.out.println("Invalid flight index.");
        }
    }

    public void viewReservations() {
        System.out.print("\nEnter your email to view reservations: ");
        String email = scanner.nextLine();
        System.out.println("--------------------------------------------------");
        boolean found = false;
        for (int i = 0; i < userCount; i++) {
            if (emails[i].equals(email)) {
                System.out.println("Reservations for " + userNames[i] + ":");
                for (int j = 0; j < flightCount; j++) {
                    if (totalSeats[j] - availableSeats[j] > 0) {
                        System.out.println("- " + flightNumbers[j] + " (" + (totalSeats[j] - availableSeats[j])
                                + " seats reserved)");
                    }
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found.");
        }
        System.out.println("--------------------------------------------------");
    }

    public void cancelReservation() {
        System.out.print("\nEnter your email to cancel reservations: ");
        String email = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < userCount; i++) {
            if (emails[i].equals(email)) {
                System.out.println("Reservations for " + userNames[i] + ":");
                for (int j = 0; j < flightCount; j++) {
                    if (totalSeats[j] - availableSeats[j] > 0) {
                        System.out.println((j + 1) + ". " + flightNumbers[j] + " ("
                                + (totalSeats[j] - availableSeats[j]) + " seats reserved)");
                    }
                }
                System.out.print("\nEnter the index of the flight to cancel reservation: ");
                int index = scanner.nextInt() - 1;
                scanner.nextLine();
                if (index >= 0 && index < flightCount && totalSeats[index] - availableSeats[index] > 0) {
                    System.out.println("\nReservation cancelled successfully on flight " + flightNumbers[index]);
                    availableSeats[index]++;
                } else {
                    System.out.println("Invalid flight index or no reservations to cancel.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found.");
        }
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nAirline Reservation System");
            System.out.println("--------------------------------------------------");
            System.out.println("1. Register User");
            System.out.println("2. View Flights");
            System.out.println("3. Reserve Seat");
            System.out.println("4. View Reservations");
            System.out.println("5. Cancel Reservation");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    displayFlights();
                    break;
                case 3:
                    reserveSeat();
                    break;
                case 4:
                    viewReservations();
                    break;
                case 5:
                    cancelReservation();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Thank you for using the Airline Reservation System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        OopjAssignment8Q3 system = new OopjAssignment8Q3();
        system.run();
    }
}
