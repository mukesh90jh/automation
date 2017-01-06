package concepts.src.arraysexpert;

import java.util.Arrays;

public class RemoveDuplicateSecondVersion {

	public static void main(String[] args) {
		//int [] array={-1,3,-2,4,2,5,-5,-1,5,6,5};
		int [] array={1,2,2,3,3,4,5,4,4};

		System.out.println(Arrays.toString(removeDuplicate(array)));
	}
	
	public static int[] removeDuplicate(int[] arr)
	{
	    int temp[] = new int[arr.length];
	    boolean[] check = new boolean[arr.length];
	    int index = 0;
	    for(int i = 0; i < arr.length; i++)
	    {
	        if(check[i] != true)
	            temp[index++] = arr[i];
	        else
	            continue;

	        int var = arr[i];
	        for(int j = i+1; j < arr.length; j++)
	        {
	            if(var == arr[j])
	                check[j] = true;
	        }
	    }
	    int returnArray[] = new int[index];

	    for(int i = 0; i < returnArray.length; i++)
	        returnArray[i] = temp[i];

	    return returnArray;
	}

}
