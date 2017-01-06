package concepts.src.stringmanipulation;

public class Anagram {
	public static void main(String[] input)
	{
		int len1, len2,found=0, not_found=0;
		String str1="creative";
		String str2="reactive";
		len1 = str1.length();
		len2 = str2.length();

		if(len1 == len2)
		{
			for(int i=0; i<len1; i++)
			{ 
				found = 0;
				for(int j=0; j<len2; j++)
				{
					if(str1.charAt(i) == str2.charAt(j))
					{
						found = 1;
						break;
					}
				}
				
				if(found == 0)
				{
					not_found = 1;
					break;
				}
			}
			
			if(not_found == 1)
			{
				System.out.print("Strings are not Anagram to Each Other..!!");
			}
			else
			{
				System.out.print("Strings are Anagram!!");
			}
		}
		else
		{
			System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		}
	}
}
