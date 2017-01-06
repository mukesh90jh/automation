package concepts.src.searchingalgorithm;

public class BinarySearch {
	/** * Java method to perform binary search. It accept an integer array and a 
	 * 
	 * number and return the index of number in the array. If number doesn't *
	 *  exists in array then it return -1 *
	 *   * @param input * 
	 *   @param number * @return index of given number in array or -1 if not found */

	public static int performBinarySearch(int[] input, int number)
	{
		int low = 0; 
		int high = input.length - 1; 
		while (high >= low) 
		{
			int middle = (low + high) / 2; 
			if (input[middle] == number) 
			{ 
				return middle; 
			} 
			else if (input[middle] < number) 
			{ 
				low = middle + 1; 
			} 

			else if (input[middle] > number) 
			{ 
				high = middle - 1; 
			}

		} 
		return -1; 
	}

}
