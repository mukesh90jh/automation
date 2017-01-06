package concepts.src.miscellaneous;
/**
 * 
 */

/**
 * @author mukesh
 *
 */
public class CopyingArray {
	public static void main(String[] args) {
		
		/*Copying Arrays

		The System class has an arraycopy method that you can use to efficiently copy data from one array into another:

		public static void arraycopy(Object src, int srcPos,
		                             Object dest, int destPos, int length)
		The two Object arguments specify the array to copy from and the array to copy to. The three int arguments specify the starting position in the source array, the starting position in the destination array, and the number of array elements to copy.

		The following program, ArrayCopyDemo, declares an array of char elements, spelling the word "decaffeinated." It uses the System.arraycopy method to copy a subsequence of array components into a second array:


		class ArrayCopyDemo {
		    public static void main(String[] args) {
		        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
					    'i', 'n', 'a', 't', 'e', 'd' };
		        char[] copyTo = new char[7];

		        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		        System.out.println(new String(copyTo));
		    }
		}
		The output from this program is:

		caffein
		Array Manipulations

		Arrays are a powerful and useful concept used in programming. Java SE provides methods to perform some of the most common manipulations related to arrays. For instance, the ArrayCopyDemo example uses the arraycopy method of the System class instead of manually iterating through the elements of the source array and placing each one into the destination array. This is performed behind the scenes, enabling the developer to use just one line of code to call the method.

		For your convenience, Java SE provides several methods for performing array manipulations (common tasks, such as copying, sorting and searching arrays) in the java.util.Arrays class. For instance, the previous example can be modified to use the copyOfRange method of the java.util.Arrays class, as you can see in the ArrayCopyOfDemo example. The difference is that using the copyOfRange method does not require you to create the destination array before calling the method, because the destination array is returned by the method:


		class ArrayCopyOfDemo {
		    public static void main(String[] args) {
		        
		        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
		            'i', 'n', 'a', 't', 'e', 'd'};
		            
		        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		        
		        System.out.println(new String(copyTo));
		    }
		}
		As you can see, the output from this program is the same (caffein), although it requires fewer lines of code. Note that the second parameter of the copyOfRange method is the initial index of the range to be copied, inclusively, while the third parameter is the final index of the range to be copied, exclusively. In this example, the range to be copied does not include the array element at index 9 (which contains the character a).

		Some other useful operations provided by methods in the java.util.Arrays class, are:

		Searching an array for a specific value to get the index at which it is placed (the binarySearch method).
		Comparing two arrays to determine if they are equal or not (the equals method).
		Filling an array to place a specific value at each index (the fill method).
		Sorting an array into ascending order. This can be done either sequentially, using the sort method, or concurrently, using the parallelSort method introduced in Java SE 8. Parallel sorting of large arrays on multiprocessor systems is faster than sequential array sorting.
		
	
		
		*/
		
		
		
		
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

}
