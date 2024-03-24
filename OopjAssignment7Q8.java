
/*
8).Write a program which takes an array of integers and prints the running average of 3 consecutive integers. 
In case the array has fewer than 3 integers, there should be no output.
 Input: [5,14,35,89,140]
Output: [18, 46, 88] 
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...) */

public class OopjAssignment7Q8 {

    public static void main(String[] args) {
        int[] nums = { 5, 14, 35, 89, 140 };

        if (nums.length < 3) {
            System.out.println("There should be at least 3 integers in the array for computing running averages.");
            return;
        }

        System.out.println("\n-------------Running Average-------------\n");
        for (int i = 0; i <= nums.length - 3; i++) {
            int average = (nums[i] + nums[i + 1] + nums[i + 2]) / 3;
            System.out.print(average);
            if (i < nums.length - 3) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }
}
