/**
 * 
 */
package concepts.src.stringmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mukesh
 *
 */
public class RemoveDuplicateCharInString {

	public static void main(String[] args) throws IOException {

		String str="mmmukesshsh";
		String res="";

		for(int i=0;i<str.length();i++)
		{
			boolean present=false;
			for(int j=i+1;j<str.length();j++)   
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
					present=true;
					break;
				}
			}

			if (present==false)
			{
				res=res+str.charAt(i);
			}
		}
		System.out.println("Output string is :"+res);

	}

}
