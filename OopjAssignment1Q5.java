/*
5)Write a program that takes a character as input and 
determines whether it’s a vowel or a consonant using if-else. 
*/
import java.util.Scanner;
public class OopjAssignment1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character you wish to check if it is vowel or a consonant: ");
        String inp = sc.nextLine();
        char ch = inp.toLowerCase().charAt(0);

        System.out.println("Entered input is: " + inp);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("\nIt is a vowel");
        }else{
            System.out.println("\nIt is a consonant");
        }
        sc.close();
    }
}
