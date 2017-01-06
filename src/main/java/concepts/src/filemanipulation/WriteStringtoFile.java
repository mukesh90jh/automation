package concepts.src.filemanipulation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WriteStringtoFile {

	
	public static void main(String[] args) 
	{
		
		try
	    {
	      
	      File file = new File("D:\\FileIO\\sample.txt");
	      String data = "Hi Mukesh How R u!!!!!!!!!!";
	
	      FileUtils.writeStringToFile(file, data);
	    } 
		catch (IOException e)
	    {
	      e.printStackTrace();
	    }	

	}

}
