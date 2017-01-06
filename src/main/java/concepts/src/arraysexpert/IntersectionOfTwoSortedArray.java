/**
 * 
 */
package concepts.src.arraysexpert;

/**
 * @author mukesh
 *
 */
public class IntersectionOfTwoSortedArray {

	/**
Algorithm Intersection(arr1[], arr2[]):
For Intersection of two arrays, print the element only if the element is present in both arrays.
1) Use two index variables i and j, initial values i = 0, j = 0
2) If arr1[i] is smaller than arr2[j] then increment i.
3) If arr1[i] is greater than arr2[j] then increment j.
4) If both are same then print any of them and increment both i and j.	
	 */
	public static void printIntersection(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;
		while (i < m && j < n)
		{
			if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr1[i])
				j++;
			else  /* if arr1[i] == arr2[j] */
			{
				System.out.println(arr2[j++]);  //print value and increment j by 1
				i++;
			}
		}

	}
	public static void main(String[] args) {

		int arr1[] = {1, 2, 4, 5, 6};
		int arr2[] = {2, 3, 5, 7};
		printIntersection(arr1, arr2, arr1.length, arr2.length);
	}


}
