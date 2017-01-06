package concepts.src.miscellaneous;

public class NonRepeatedChar {

	
	public static void main(String[] args) 
	{
		
		 String str = "javapasjion";
		  int[] count = new int[128];
		  char[] charArr = str.toCharArray();
		  for (char c : charArr)
		  {
		     System.out.println(count[c]++);
		  }
		  for (char c : charArr) 
		  {
		   if (count[c] == 1) 
		   {      
		    System.out.println("First Non repeated character is : " + c);
		    break;
		   }
		  }
	}

}
