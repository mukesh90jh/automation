package  concepts.src.collectionmaster;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ConvertArraytoSet {

	
	public static void main(String[] args) 
	{
		
		//we can directly convert string array to set
		String[] strArray = {"foo", "foo", "bar"};  
		Set<String> mySet = new HashSet<String>(Arrays.asList(strArray));
		System.out.println(mySet);
        
		//to convert integer array to set first we need to convert into list and then set
		
		Integer[]arr={1,2,3,4,5,2,3,};
		List<Integer> list=Arrays.asList(arr);
		Iterator<Integer> itr=list.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
		Set set=new HashSet(list);
		System.out.println("Set value::"+set);
	}

}
