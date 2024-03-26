
/*4. Code for arithmetic exception using one try block & multiple catch block & check which catch block handle that exception: */

public class OopjAssignment9Q4 {

    public static void main(String[] args) {
        try {
            int result = 1 / 0; 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
}
