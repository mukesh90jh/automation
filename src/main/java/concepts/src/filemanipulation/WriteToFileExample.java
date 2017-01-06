package concepts.src.filemanipulation;
import java.io.*;

public class WriteToFileExample {

	
	public static void main(String[] args) throws IOException 
	{
		String content = "This is the content to write into file";
		 
		File file = new File("D:\\FileIO\\f4.txt");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();

		System.out.println("Done");

	  } 
	}

	


