package concepts.src.arraysexpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicatesFromArray {

	
	public static void main(String[] args) 
	{
		String[] strArr = { "sunday", "monday", "tuesday", "wednesday",
                "thursday", "friday", "saturday", "wednesday", "sunday",
                "tuesday" };
    System.out.println("original array:" + Arrays.toString(strArr));

   // Convert it to list as we need the list object to create a
   // set object. A set is a collection object that cannot have
   // a duplicate values, so by converting the array to a set
   // the duplicate value will be removed.

   List<String> strList = Arrays.asList(strArr);
   System.out.println("list objects are:" + strList);

   Set<String> strSet = new HashSet<String>(strList);
   System.out.println("set objects   are:"
                + strSet);
   //converting set back string array
   String[] resultArray=strSet.toArray(new String[strSet.size()]);
   System.out.println("results array:"+Arrays.toString(resultArray));	

	}

}
