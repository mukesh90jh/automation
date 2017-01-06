/**
 * 
 */
package concepts.src.miscellaneous;

/**
 * @author mukesh
 *
 */
public class FindKthHighestNumberInUnsortedArrays {

	public static int highestNo(int postion){
		int []a={7,3,4,5,6,2};
		int l=a.length;
		for (int i = 0; i < l; i++) 
		{
			for (int j =i+1; j < l; j++) 
			{
				if (a[j] < a[i])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}

			}
		}
		int highest = a[postion-1];
		return highest;
	}

   public static void main(String [] mukesh){
	  int ss=highestNo(4);
	  System.out.println(ss);
	   
   }
}
