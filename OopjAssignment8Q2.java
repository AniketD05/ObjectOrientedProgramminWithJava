
import java.util.Scanner;

public class OopjAssignment8Q2 {

    private static final int maxMenuSize = 10;
    private static String[] menu = new String[maxMenuSize];
    private static double[] prices = new double[maxMenuSize];
    private static int menuSize = 0;
    private static Scanner scanner = new Scanner(System.in);

    private static void viewMenu() {
        System.out.println("\n         Menu         ");
        System.out.println("-------------------------");
        System.out.println("   Name       Price ");
        System.out.println("-------------------------");
        for (int i = 0; i < menuSize; i++) {
            System.out.println((i + 1) + ". " + menu[i] + "       " + prices[i]);
        }
        System.out.println("-------------------------");
    }

    private static void addDish() {
        if (menuSize < maxMenuSize) {

            scanner.nextLine();
            System.out.println("Enter details to add new dish!");
            System.out.print("Enter Name: ");
            String dishName = scanner.nextLine();
           
        
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
        
            menu[menuSize] = dishName;
            prices[menuSize] = price;
            menuSize++;
            System.out.println("Dish added successfully.");
            viewMenu();
        } else {
            System.out.println("Cannot add more dishes. Menu is full.");
        }
    }

    private static void removeDish() {
        if (menuSize > 0) {
            viewMenu();
            System.out.print("Enter the index of the dish to remove: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < menuSize) {
                for (int i = index; i < menuSize - 1; i++) {
                    menu[i] = menu[i + 1];
                    prices[i] = prices[i + 1];
                }
                menuSize--;
                System.out.println("Dish removed successfully.");
                viewMenu();
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            System.out.println("Menu is empty. Nothing to remove.");
        }
    }

    private static void modifyPrice() {
        if (menuSize > 0) {
            viewMenu();
            System.out.print("Enter the index of the dish to modify: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < menuSize) {
                System.out.print("Enter the new price for the dish: ");
                double newPrice = scanner.nextDouble();
                prices[index] = newPrice;
                System.out.println("Price modified successfully.");
                viewMenu();
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            System.out.println("Menu is empty. Nothing to modify.");
        }
    }

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
        
            System.out.println("\nRestaurant Menu Managment");
            System.out.println("-------------------------");
            System.out.println("1. View Menu");
            System.out.println("2. Add Dish");
            System.out.println("3. Remove Dish");
            System.out.println("4. Modify Price");
            System.out.println("5. Exit");
            System.out.println("-------------------------");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
           
           
          
            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    addDish();
                    break;
                case 3:
                    removeDish();
                    break;
                case 4:
                    modifyPrice();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the menu manager!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}


