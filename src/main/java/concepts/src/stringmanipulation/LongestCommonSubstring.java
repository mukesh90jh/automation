package concepts.src.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubstring {
	
	public static List<String> commonSubstring(String S1, String S2)
	{
		int match[][] = new int[S1.length()][S2.length()];

		int len1 = S1.length(); 
		int len2 = S2.length();
		int max =0; //Maximum length of the string
		ArrayList<String> result = null; //Result list

		for(int i=0; i<len1; i++)
		{
			for(int j=0; j<len2; j++)
			{
				if(S1.charAt(i) ==  S2.charAt(j))
				{
					if ( i == 0 || j==0)
					{
						match[i][j] = 1;

					}             
					else
					{
						match[i][j] = match[i-1][j-1] + 1;
					
					}

					if(match[i][j] > max) //If you find a longer common substring re-initialize the max count and update the result list.
					{
						max =  match[i][j];
						result = new ArrayList<String>();
						result.add(S1.substring(i-max+1, i+1)); //substring starts at i-max+1 and ends at i
					}
					else if(match[i][j] == max) // else if you find a common substring with the max length, store it in the list.
					{
						result.add(S1.substring(i-max+1, i+1));
					}
					
				}
				else  match[i][j] = 0;

			}
		}
		return result;
	}


	public static void main(String args[])
	{
		List<String> result = commonSubstring("LCLC","CLCL");
		for(String str: result)
		{
			System.out.println(str);
		}
	}
}
