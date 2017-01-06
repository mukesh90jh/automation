package concepts.src.filemanipulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromNotepad {

	
	public static void main(String[] args) throws IOException 
	{
	  	
      BufferedReader br=new BufferedReader(new FileReader(new File("D:\\FileIO\\f4.txt")));
      String str;  
	  while((str=br.readLine())!=null) 
	  { 
	    System.out.println(str);  
	  }
	}

}
