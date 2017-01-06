package concepts.src.filemanipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {


	public static void main(String[] args) throws IOException 
	{
      
		File f1= new File("D:\\FileIO\\f1.txt");
		//String str="HI MUKESH HOW ARE YOU,HOPE YOU WILL BE FINE";
		FileInputStream fis=new FileInputStream(f1);//always file name only
		FileOutputStream fos=new FileOutputStream("D:\\f2.txt");
		int c;
	
		while((c=fis.read())!=-1)
		{
			System.out.println((char)c);
			fos.write((char)c);
		}
		
		
      
	}

}
