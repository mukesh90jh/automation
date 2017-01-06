package concepts.src.arraysexpert;

import java.util.HashSet;

public class CommonElementsInTwoArray {

	public static void main(String a[]){
		int[] arr1 = {4,7,3,9,2};
		int[] arr2 = {3,2,12,9,40,32,4};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void intersection()
	{
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		HashSet<String> set = new HashSet<String>();
	

		for (int i = 0; i < s1.length; i++)
		{
			for (int j = 0; j < s2.length; j++)
			{
				if(s1[i].equals(s2[j]))
				{
					set.add(s1[i]);
				}
			}
		}

		System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
	}

}
