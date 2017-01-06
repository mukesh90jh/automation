/**
 * 
 */
package concepts.src.miscellaneous;

import java.util.HashSet;

/**
 * @author mukesh
 *
 */
public class DuplicatesInArrayUsingHashSet {
	public static void main(String[] args)
	{
		//String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
		int [] strArray={1,2,3,2,4,3,5,6};
		
		/*Integer[] newArray = new Integer[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			newArray[i] = Integer.valueOf(strArray[i]);
		}*/

		//1. Using Brute Force Method

		/* for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[i]);
                }
            }
        }*/

		//2. Using HashSet

		HashSet<Integer> set = new HashSet<Integer>();

		for (int arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}

		/*
		 * Print unique string
		 */        
		/*HashSet<String> set1 = new HashSet<String>();

		for (int arrayElement : strArray)
		{
			if(set1.add(arrayElement))
			{
				System.out.println("Unique Element is : "+arrayElement);
			}
		}*/
	}

}
