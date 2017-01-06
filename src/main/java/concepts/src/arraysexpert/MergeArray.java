package concepts.src.arraysexpert;

import java.util.Arrays;

public class MergeArray {
	
	/*Steps to  merge two sorted arrays

	1. If the first array is empty (i.e a1.length <=0 ), then copy the elements of the array arr2 to the result array. return the result

	2. If the second array is empty ( i.e arr2.length <=0), then copy all the elements of the array arr1 to the result array. return the result

	3. Compare the element in the arr1 with element in the arr2 and copy the small element to result ie. if the arr1[i]<arr2[j], copy arr1[i] to result, and increase i , otherwise copy arr2[j] to result, and increase j
*/


	public static void main(String[] args) {
		int []a={2,3,5,7,8};
		int []b={4,6,8};
		System.out.println(Arrays.toString(merge(a,b)));
	}

	static int[] merge(int[] arr1, int[] arr2)
	{
		int arr1_Length=arr1.length;
		int arr2_Length=arr2.length;
		int[] result = new int[arr1_Length + arr2_Length];
		int i=0, j = 0;

		for(int k = 0 ; k< result.length;k++)
		{
			//If arr1 is empty, copy the elements of the array arr2 to the result array .
			//When i equals the length of array arr1 , copy the remaining elements in the array arr2 to result
			if ( i >= arr1_Length ) //for step1 & 4
			{
				result[k] = arr2[j];
				j ++;
			}
			//If arr2 is empty, copy the elements of the array arr1 to the result array .
			//When j equals the length of array arr2 , copy the remaining elements in the array arr1 to result
			else if ( j >= arr2_Length) // For step 2 &amp; 4
			{
				result[k] = arr1[i];
				i ++;
			}
			else
			{

				if ( arr1[i] < arr2[j]) // step 3
				{
					result[k] = arr1[i];
					i ++;
				}
				else
				{
					result[k] = arr2[j];
					j ++;
				}
			}
		}
		return result;
	}
}
