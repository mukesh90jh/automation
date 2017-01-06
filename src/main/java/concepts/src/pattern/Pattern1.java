package concepts.src.pattern;

public class Pattern1 {

	
	public static void main(String[] args) 
	{
		
		 for (int i = 1; i<10; i+=2)
		 {
		        for(int k = 0; k<9-i; k++)
		        {
		            System.out.print(" ");
		        }
		        for(int j = 2; j<=i+1; j+=2)
		        {
		            System.out.print(" "+j);
		          
		        }
		        System.out.println();
		    }
	 }

}
