package concepts.src.sortingalgorithm;

import java.util.Arrays;

public class SelectionSortInJava {
	/**
	 *The selection sort works as follows: you look through the entire array for the smallest element, once you find it you swap it (the smallest element) with the first element of the array.
	 * Then you look for the smallest element in the remaining array (an array without the first element) and swap it with the second element. 
	 * Then you look for the smallest element in the remaining array (an array without first and second elements) and swap it with the third element, and so on.
	 */
	public static int[] selectionSort(int[] ar){
		for (int i = 0; i < ar.length-1; i++)
		{
			int min = i;
			for (int j = i+1; j < ar.length; j++)
				if (ar[j] < ar[min]) {
					min = j;
				}
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
		return ar;



	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(selectionSort(new int[] {45, 44, 101, 62, 12})));  ;

		/*selectionSort(new int[] {62, -45, 14, 8, -52, 45});

		selectionSort(new int[] {21, 12, 56, -48, 15, 45});*/
	}
}
