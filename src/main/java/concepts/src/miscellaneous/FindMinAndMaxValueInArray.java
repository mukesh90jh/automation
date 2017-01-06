/**
 * 
 */
package concepts.src.miscellaneous;

/**
 * @author mukesh
 *
 */
public class FindMinAndMaxValueInArray {

	public static void main(String[] args) {
		int arr[] = { 69, 23, 47, 81, 92, 88, 52, 48, 56, 66, 65, 76, 71, 85,
				49, 53, 56, 61, 65, 84 };
		findMaxValue(arr);
		findMinValue(arr);
	}

	public static void findMinValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("minimum value of the array is:" + min);
	}

	public static void findMaxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("maximum value of array is:" + max);

	}
}
