/**
 * 
 */
package concepts.src.miscellaneous;


/**
 * @author mukesh
 *
 */
public class FirstRepeatingElementInArrayInteger {
	static void method(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			int count=0;
			int number = array[i];
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					count++;
				}

				/*if(count>1)
				{
					break;
				}*/
			}

			if(count == 1)
			{
				System.out.println(number);
				break;
			}

			/*if(count>1 && i==array.length-1)
	{
	System.out.println("No non repeated elements");
	}*/
		}
	}

	public static void main(String[] args)
	{
		int array[] = {2,4,5,9,9,2,9,8,4,10,11,11,12,12};
		method(array);
	}

}

