package concepts.src.miscellaneous;

import java.util.ArrayList;

public class ArrayListDiffDataValue {

	
	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		 
        al.add("Java4s");
        al.add(12);
        al.add(12.54f);
 
        for(int i=0;i<al.size();i++)
        {
            Object o = al.get(i);
 
            if(o instanceof String || o instanceof Float || o instanceof Integer)
            System.out.println("Value is "+o.toString());    
        }
	}

}
