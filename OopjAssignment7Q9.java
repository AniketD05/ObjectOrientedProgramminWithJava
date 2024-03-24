
/*9) Write a program which generates the series 1,4,27,16,125,36 */

public class OopjAssignment7Q9 {
    public static void main(String[] args) {
        int[] powers = { 1, 3, 5, 2, 3, 2 };
        int length = powers.length;

        for (int i = 0; i < length; i++) {
            int number = i + 1;
            int power = powers[i];
            int result = (int) Math.pow(number, power);
            System.out.print(result);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
    }
}
