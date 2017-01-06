package concepts.src.arraysexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KnuthMorrisPratt {

	/** Failure array **/
    private int[] failure;
    /** Constructor **/
    public KnuthMorrisPratt(String text, String pat)
    {
        /** pre construct failure array for a pattern **/
        failure = new int[pat.length()];
        /** find match **/
        int pos = posMatch(text, pat);
        if (pos == -1)
            System.out.println("\nNo match found");
        else
            System.out.println("\nMatch found at index "+ pos);
    }
 
    /** Function to find match for a pattern **/
    private int posMatch(String text, String pat)
    {
        int i = 0, j = 0;
        int lent = text.length();
        int lenp = pat.length();
        while (i < lent && j < lenp)
        {
            if (text.charAt(i) == pat.charAt(j))
            {
                i++;
                j++;
            }
            
            else if (j == 0){
                i++;
            }
            else
            {
                j = failure[j - 1] + 1;
            }
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
    /** Main Function **/
    public static void main(String[] args) throws IOException
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        String text = "AAABCCCAA";
        String pattern ="CCA";
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);        
    }
}
