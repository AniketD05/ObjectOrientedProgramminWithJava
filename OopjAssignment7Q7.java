
/*7)Write a program to merge two arrays of integers by reading one number at a time 
    from each array until  one of the array is exhausted, and then concatenating the 
    remaining numbers.

 Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102] */

public class OopjAssignment7Q7 {
    public static void main(String[] args) {
        int[] arr1 = {23, 60, 94, 3, 102};
        int[] arr2 = {42, 16, 74};
        
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            mergedArray[k++] = arr1[i++];
            mergedArray[k++] = arr2[j++];
        }
        
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        
        System.out.println("\n-------------Merged Array-------------\n");
        for (int num : mergedArray) {
            System.out.print( num + " ");
        }
        System.out.println("\n");
    }
}

