package concepts.src.stringmanipulation;

import java.util.Arrays;

public class CountCharacters {

	public static void main(String[] args) {
		/*int charCount=countCharacters('u');
		System.out.println("count of Given character  :" + charCount);

		int charCounts=countCharactersSecondApproach('m');
		System.out.println("count of Given character using second Approach  :" + charCounts);

		removeGivenChracterFromString();
		removeCharAt();*/
		
		removeRecursive("mukum", 'u');
		/*Arrays.sort(arr);
		System.out.println("After sorting:"+Arrays.toString(arr));
*/
		

	}

	/*public static int countCharacters(char c)
	{
		String input ="mukesh";
		int charCounts=0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==c){
				charCounts++;
				System.out.println("found at position :"+i);
			}
		}
		return charCounts;

	}
	public static int countCharactersSecondApproach(char c)
	{
		String input ="mmukessh";
		int charCount = 0; //resetting character count
		for(char ch: input.toCharArray()){
			if(ch == c){
				charCount++;
			}	
		}
		return charCount;
	}
	
	Write a program to remove a given characters from String
	
	public static void removeGivenChracterFromString()
	{
		String string="mukesh";
		char c1='u';
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=c1){
				sb.append(string.charAt(i));
			}
		}
		
		System.out.println("Removed Character:"+sb.toString());
		
	}
	
	//second Approach
	 public static String remove(String word, char unwanted){
	        StringBuilder sb = new StringBuilder();
	        char[] letters = word.toCharArray();
	     
	        for(char c : letters){
	            if(c != unwanted ){
	                sb.append(c);
	            }
	        }
	     
	        return sb.toString();
	    }*/

	 public static String removeRecursive(String word, char ch){
	        int index = word.indexOf(ch);
	        if(index == -1){
	            return word;
	        }
	        return removeRecursive(word.substring(0, index) + word.substring(index +1, word.length()), ch);
	    }
	 
	/* public static void removeCharAt() {
		 String s = "this is Java";
	      String str2= s.substring(0, 3)+ s.substring(3 + 1);
	      System.out.println("str2::"+str2);
	   }


*/


}


