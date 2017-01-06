package concepts.src.filemanipulation;

import java.io.*;

public class FileReader {
	
	public static void main(String[] args) throws IOException
	{
		
	 
		File f1= new File("D:\\FileIO\\f1.txt");
		BufferedReader br=new BufferedReader(new java.io.FileReader(f1)); 
		String str;  
		  while((str=br.readLine())!=null) { 
		  System.out.println(str);  
		  
		  }

	}

}
