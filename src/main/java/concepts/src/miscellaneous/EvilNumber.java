/**
 * 
 */
package concepts.src.miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mukesh
 *
 */
public class EvilNumber {

	String toBinary(int number) // Function to convert a number to Binary
	{
		int binary[] = new int[8];
		while(number > 0){
			for(int i=0;i<binary.length;i++)
			{
				binary[i] = number%2;
				number = number/2;
			}
		}
		return Arrays.toString(binary); //convert integer array to string
	}

	int countOne(String s) // Function to count no of 1's in binary number
	{
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='1')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String args[])
	{
		EvilNumber ob = new EvilNumber();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a positive number : ");
		int n = sc.nextInt();

		String bin = ob.toBinary(n);
		System.out.println("Binary Equivalent = "+bin);

		int x = ob.countOne(bin);
		System.out.println("Number of Ones = "+x);

		if(x%2==0)
			System.out.println(n+" is an Evil Number.");
		else
			System.out.println(n+" is Not an Evil Number.");
	}
}
