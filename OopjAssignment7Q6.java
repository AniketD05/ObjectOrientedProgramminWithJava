
/*6) Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest) */

public class OopjAssignment7Q6 {

	public static void thirdLargest(int arr[], int arr_size) {

		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr_size; i++) {

			if (arr[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (arr[i] > thirdLargest) {
				thirdLargest = arr[i];
			}
		}

		System.out.printf("\nThe third Largest element is %d%n", thirdLargest);
	}

	public static void main(String[] args) {
		int arr[] = { 24,54,31,16,82,45,67 };
		int n = arr.length;
		thirdLargest(arr, n);
	}
}
