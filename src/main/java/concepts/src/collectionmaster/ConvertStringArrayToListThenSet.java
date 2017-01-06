package concepts.src.collectionmaster;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class ConvertStringArrayToListThenSet {

	
	public static void main(String[] args) {
		 String[] words = {"ace", "boom", "crew", "dog", "eon", "eon", "boom"};  

	      List<String> wordList = Arrays.asList(words);  
	     /* for (String e : wordList)  
	      {  
	         System.out.println(e);  
	      }  */
	      
	      Set<String> str=new HashSet<String>(wordList);//Removing Duplicate from array
	      Iterator<String> itr=str.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }

	}

}
