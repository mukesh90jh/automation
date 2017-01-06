/**
 * 
 */
package concepts.src.sortingalgorithm;

import java.util.Arrays;

/**
 * @author mukesh
 *
 */
public class BubbleSort {

	/**
	 *The algorithm works by comparing (adjacent element in the list)each item in the list with the item next to it, and swapping them if required.
	 */
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble(input);
		System.out.println(Arrays.toString(bubble(input)));
	}

	public static int[] bubble(int[] ar) {

		for (int i = 1;i<ar.length-1;i++)
		{
			for (int j = 0; j <= ar.length-i-1; j++)
			{
				if (ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				} 
			} 
		}
		return ar;
	}
}
