package concepts.src.arraysexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class AddTwoArraysAndRemoveDuplicateusingArrayUtils {


	public static void main(String[] args) {

		int[] queue1={1,2,3,4,5,6};
		int [] queue2={8,9,10,2,3,7};
		int[]mergeQ =new int[queue1.length+queue2.length];

		/*
		int[]combined =ArrayUtils.addAll(first, second);

		 System.out.println("Combined array::"+Arrays.toString(combined));

		 Integer []newArray=new Integer[combined.length];
		 for(int i= 0; i < combined.length; i++) 
		 {
			    newArray[i] = Integer.valueOf(combined[i]);

		 }

		 System.out.println("New Array::"+Arrays.toString(newArray));

		 List<Integer> list=Arrays.asList(newArray);

		 Set<Integer> set=new HashSet<>(list);

		 System.out.println("Unique Arrays::"+set);*/
		int p = 0;
		for (int i = 0 ; i < queue1.length || i < queue2.length ; i++) {
			if (i < queue1.length) {
				mergeQ[p++] = queue1[i];
			}
			if (i < queue2.length) {
				mergeQ[p++] = queue2[i];
			}
		}

		System.out.println("mergeQueue:"+Arrays.toString(mergeQ));

		String []s1={"1","2","3","4"};
		String [] s2={"4","2","6","7"};

		String [] s3=ArrayUtils.addAll(s1, s2);

		System.out.println("String:"+Arrays.toString(s3));

		Set<String> set1=new HashSet<>(Arrays.asList(s3));

		System.out.println("unique set"+set1);


		List<String> list2=new ArrayList<>(set1); //converting set to List
		System.out.println("List Value:"+list2);

		Collections.sort(list2);

		System.out.println("After Sorting:"+list2);

	}
}

