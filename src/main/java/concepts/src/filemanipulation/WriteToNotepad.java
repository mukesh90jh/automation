package concepts.src.filemanipulation;
import java.io.*;

public class WriteToNotepad {

	
	public static void main(String[] args) throws IOException 
	{
		String content = "Hi Mukesh How R u!!!!!!!!!!";
		 
		File file = new File("D:\\FileIO\\f4.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		System.out.println("Successfuly Written");

	  } 
	}

	


