package concepts.src.miscellaneous;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ArraysortUsingArraysSort {

	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	  int [] arr={4,5,10,30,2,1};
	  System.out.println("Before Sorting::"+Arrays.toString(arr));
	  Arrays.sort(arr);
	  System.out.println("After Sorting::"+Arrays.toString(arr));
	  System.out.println("Enter the Element::");
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int n=Integer.parseInt(br.readLine());
	  int pos = Arrays.binarySearch(arr, n);
	  System.out.println("Element found at postition::"+pos);
	  int[] arr2 = Arrays.copyOf(arr, arr.length);
	  System.out.println("Copied Array::"+Arrays.toString(arr2));

	}

}
