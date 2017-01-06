/**
 * 
 */
package concepts.src.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mukesh
 *
 */
public class LongestPalindrome {
	public static String LPS(String s) {
        int n = s.length();
        int palindromeBeginsAt = 0; //index where the longest palindrome begins
        int max_len = 1;//length of the longest palindrome
        boolean [][] palindrome= new boolean[n][n]; //boolean table to store palindrome truth
         
        //Trivial case: single letter palindromes
        for (int i = 0; i < n; i++) {
            palindrome[i][i] = true;
        }
         
        //Finding palindromes of two characters.
        for (int i = 0; i < n-1; i++) {
          if (s.charAt(i) == s.charAt(i+1)) {
            palindrome[i][i+1] = true;
            palindromeBeginsAt = i;
            max_len = 2;
          }
        }
         
        //Finding palindromes of length 3 to n and saving the longest
        for (int curr_len = 3; curr_len <= n; curr_len++) {
          for (int i = 0; i < n-curr_len+1; i++) {
            int j = i+curr_len-1;
            if (s.charAt(i) == s.charAt(j) && palindrome[i+1][j-1]) //2. Rest of the substring should be a palindrome
            {
              palindrome[i][j] = true; 
              palindromeBeginsAt = i;
              max_len = curr_len;
            }
          }
        }
        return s.substring(palindromeBeginsAt, max_len + palindromeBeginsAt);
      }

  public static void main(String args[])
  {
      System.out.println(LPS("banana"));
  }
  
  
  public void testPalindrome() {
		String givenString = "12321abcdcba";
		List<String> list = new ArrayList<>();
		for(int i = 0; i<givenString.length(); i++) {
			for (int j = i+3; j<=givenString.length();j++) {
				String str = givenString.substring(i,j);
				if(isPalindrome(str)) {
					list.add(str);
				}
			}
		}

		int longestString = 0;
		String result = "";
		for(String str : list) {
			if(str.length() >=longestString) {
				longestString = str.length();
				result = str;
			}
		}
		System.out.println(result);
	}

	public boolean isPalindrome(String str) {
		StringBuffer s = new StringBuffer(str);
		if(str.equals(s.reverse().toString())) {
			return true;
		}
		return false;
	}
	
	public boolean isPalindromes(String str) {
		String revstring="";
		for(int i=str.length()-1;i>=0;--i){
			revstring +=str.charAt(i);
			}		 
			if(revstring.equalsIgnoreCase(str)){
				return true;
			}
			return false;

	}
}
