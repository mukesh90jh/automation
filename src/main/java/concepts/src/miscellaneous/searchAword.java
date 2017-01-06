package concepts.src.miscellaneous;
import java.io.*;
public class searchAword 
{
  public static void main(String []args) throws Exception
  {
	  String[] names = new String[]{"mahendra", "anu", "girish", "komal"};
	  String ss;
	  BufferedReader br= new BufferedReader(new InputStreamReader(System.in) );
	  System.out.print("Enter the String:\n");
	  ss=br.readLine();
	  for(int i=0;i<names.length;i++)
	  {
	   if((ss.equals(names[i])))
	    {

		  System.out.print("Present\n");
		
	    }
	 
	 }
  }
}
