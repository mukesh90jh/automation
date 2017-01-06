package concepts.src.miscellaneous;
import java.util.Arrays;


public class RemoveDuplicateWithoutSet {

	
	public static void main(String[] args) 
	{
		  
		   //int []a={7,2,3,4,5,6,2,3,4};
		   int []a={-1,7,2,3,2,3,6,5,4,-5};

		   int l=a.length;
	        // sorting elements in the array logic
	        for (int i = 0; i < l; i++) 
	        {
	            for (int j =i+1; j < l; j++) 
	            {
	                if (a[j] >a[i])
	                {
	                    int temp = a[j];
	                    a[j] = a[i];
	                    a[i] = temp;

	                }

	            }
	           
	            System.out.println(a[i]);
        }
	        // remove duplicate elements logic
	        int b = 0;
	        a[b] = a[0];
	        for (int i = 1; i < l; i++)
	        {
	            if (a[b] != a[i])
	            {
	                b++;
	                a[b]=a[i];
	            }

	        }
	        for(int i=0;i<=b;i++)
	        {
	            System.out.print(a[i]);
	        }
	

	}

}
