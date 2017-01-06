package concepts.src.arraysexpert;

import java.util.HashSet;

public class FindDuplictesInArray {

	/**
	 * @param mukesh
	 */
	public static void main(String[] args) {
		String[] strArr = new String[] { "a", "b", "c", "s", "d", "e", "a",
				"b", "s" };
		detectDuplicates(strArr);
	}

	public static void detectDuplicates(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if( (arr[i].equals(arr[j])) && (i != j) ) {
					System.out.println("Duplicate Element is : "+arr[j]);
				}
			}
		}

	}

	public static void duplicateUsingHashset() 
	{
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
	}    

}
