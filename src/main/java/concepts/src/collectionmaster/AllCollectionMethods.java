package concepts.src.collectionmaster;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class AllCollectionMethods {

	
	public static void main(String[] args) 
	{
	 List<Integer> list=new LinkedList<>();
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 list.add(8);
	 list.add(1);
	 list.add(2);
	 
	 Collections.sort(list);
	 System.out.println("Sorted List::"+list);
	 System.out.println("*****************************************");
	 Collections.swap(list, 5, 4);
	 
	 System.out.println("*****************************************");
	 int search = Collections.binarySearch(list, 8);
	 System.out.println("Element present at::"+search);
	 
	 System.out.println("*************ADD ALL****************************");
	 System.out.println("After Adding:"+Collections.addAll(list, 6));
	 System.out.println("Sorted List::"+list);
	 System.out.println("*****************************************");
	 
	 Collections.reverse(list);
	 System.out.println("After Reverse");
	 System.out.println(list);
	 System.out.println("*****************************************");
	 Collections.reverseOrder();
	 System.out.println(list);
	 
	 System.out.println("*****************************************");
	 Collections.replaceAll(list, 2, 7);
	 System.out.println("After Replacing the values::"+list);
	 System.out.println("*****************************************");
	 
	 System.out.println("Occurance of 7 is::"+Collections.frequency(list, 7));
	 
	 System.out.println("*****************************************");
	  Collection<Integer> notposible = Collections.unmodifiableCollection(list);
	 System.out.println("****************UnModifibale*************************");
	 //Collections.addAll(notposible, 20);
	 System.out.println("After Modifyign:"+notposible);
	 System.out.println("********************Shuffle*********************");
	 Collections.shuffle(list,new Random(10));
	 System.out.println(list);
	 
	
	 
	 
	 
	}

}
