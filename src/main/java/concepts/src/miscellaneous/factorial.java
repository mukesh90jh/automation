package concepts.src.miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class factorial
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{		
		int n, i, prod=1;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter a No.");
		n=Integer.parseInt(br.readLine());
		for(i=n;i>=1;i--)
		{
			prod*=i;	//prod=prod*i;
		}
		System.out.println("Factorial of " + n + " is  " + prod);
	}
}
