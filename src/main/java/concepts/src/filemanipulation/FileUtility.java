package concepts.src.filemanipulation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtility {

	
	public static void main(String[] args) throws IOException 
	{
		// I have used Commons.io-1.4 jar(API)
		 File file = new File("D:\\FileIO\\f4.txt");
		 List lines = FileUtils.readLines(file);
		 for(Object li:lines)
		 {
			 System.out.println(li);
		 }
	}

}
