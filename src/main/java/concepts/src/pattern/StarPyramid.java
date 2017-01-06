package concepts.src.pattern;

public class StarPyramid {

	public static void main(String[] args) {
		
          int rowCount = 1;
          
		  for (int i = 3; i > 0; i--)
	        {
	            //Printing i spaces at the beginning of each row
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            //Printing * at the end of each row
	 
	            for (int j = 1; j <= rowCount; j++)
	            {
	                //System.out.print(rowCount);
	                 //System.out.print("* ");
	                // System.out.print("*");

	                System.out.print(j+" ");

	            }
	 
	            System.out.println();
	 
	            //Incrementing the rowCount
	 
	            rowCount++;
	        }
	    
	}

}
