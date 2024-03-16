/* Practice question on menu-driven program */

import java.util.Scanner;

class Account {

    private String name;
    private int accountNo;
    private float balance;

    public static Scanner sc = new Scanner(System.in);

    public void acceptRecord() {
        System.out.print("Enter Name          : ");
        this.name = sc.nextLine();
        System.out.print("Enter Account NO    : ");
        this.accountNo = sc.nextInt();
        System.out.print("Enter Balance       : ");
        this.balance = sc.nextFloat();

    }

    public void displayrecord() {
        System.out.println("Name       : " + name);
        System.out.println("Account No : " + accountNo);
        System.out.println("Balance    : " + balance);
    }

    private static Scanner sc1 = new Scanner(System.in);

    public int menuList() {

        System.out.println("Enter Choice : ");
        System.out.println("0. Exit");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");

        return sc1.nextInt();

    }
}

public class OopjAssignment4PQ {

    public static void main(String[] args) {

        Account account = new Account();
        int choice;
        while ((choice = account.menuList()) != 0) {
            switch (choice) {

                case 1:
                    account.acceptRecord();
                    break;
                case 2:
                    account.displayrecord();
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
}
