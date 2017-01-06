package concepts.src.arraysexpert;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args)
	{
		int[] a = new int[10];

		int[] b = new int[100];

		a = b;      //Compiler checks only type, not the size
		
		//String dd = Arrays.toString(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		String str = "aver     que pasa womtw ";
		String res ="";
		for (int i = 0; i < str.length(); i++)
		if(!Character.isWhitespace(str.charAt(i)))
		res+=str.charAt(i);
		System.out.println("["+res+"]");
		
		int c=3^2;
		System.out.println(c);

	}
}

