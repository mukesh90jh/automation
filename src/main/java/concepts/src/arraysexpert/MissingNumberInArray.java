package concepts.src.arraysexpert;

import java.util.Arrays;

public class MissingNumberInArray {
	//Method to calculate sum of 'n' numbers

	static int sumOfNnumbers(int n)
	{
		int sum = (n * (n+1))/ 2;

		return sum;
	}

	//Method to calculate sum of all elements of array

	static int sumOfElements(int[] array)
	{
		int sum = 0;

		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}

		return sum;
	}
	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2); 
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i; 
		} 
		System.out.println("expectedSum:"+expectedSum);
		System.out.println("actualSum:"+actualSum);

		return expectedSum - actualSum; 
		}


	public static void main(String[] args)
	{
		int n = 8; //maximum number

		int[] a = {1, 4, 5, 3, 7, 8, 6};

		//Step 1

		int sumOfNnumbers = sumOfNnumbers(n);

		//Step 2

		int sumOfElements = sumOfElements(a);

		//Step 3

		int missingNumber = sumOfNnumbers - sumOfElements;

		System.out.println("Missing Number is = "+missingNumber);
		 int[] iArray = new int[]{1, 2, 3, 5};
	        int missing = getMissingNumber(iArray, 5);
	        System.out.printf("Missing number in array %s is %d %n", 
	                           Arrays.toString(iArray), missing);


	}
}
