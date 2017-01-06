package concepts.src.pattern;

public class Pattern3 {

	
	public static void main(String[] args) 
	{
		int j,k=2,c;
		 for ( j = 1 ; j <= 5 ; j+=2 )
		    {
		        for ( c = 1 ; c <= 2*5-k ; c++)
		        {
		           System.out.print(" ");
		            k = k + 2;
		        }
		        for ( c = 1 ; c <= j ; c+=2)
		        {
		           System.out.print(c+"   ");
		        }
		        System.out.print("\n");
		    } 

	}

}
