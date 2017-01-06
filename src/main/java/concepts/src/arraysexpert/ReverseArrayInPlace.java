package concepts.src.arraysexpert;

import java.util.Arrays;

/**
 * @author mukesh
 *
 */
public class ReverseArrayInPlace {

	/**
	 * Swap 1st and last element,2nd and second to last,3rd to third to last so on..
	 * To reverse an int array, you swap items up until you reach the midpoint, like this:
	 * ArrayUtils.reverse(int[] array)
	 *
	 */
	public static void main(String args[]){ 
		String[] names = {"John", "Jammy", "Luke"};
		System.out.println("original array: " + Arrays.toString(names) );
		reverse(names);
		System.out.println("reversed array: " + Arrays.toString(names) ); 
	}


	public static void reverse(String[] array) 
	{ 
		System.out.println( array.length / 2);
		if (array == null || array.length < 2) 
		{ 
			return; 
		} 
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i]; 
			array[i] = array[array.length - 1 - i]; 
			array[array.length - 1 - i] = temp;
		} 
	}

}
