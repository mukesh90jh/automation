package concepts.src.filemanipulation;

import java.io.File;

public class RenameFile {

	
	public static void main(String[] args) 
	{
		 File oldName = new File("D:/file1.txt.txt");
	      File newName = new File("D:/java.txt");
	      try {
			if(oldName.renameTo(newName)) 
			  {
			     System.out.println("renamed");
			  }
			  else 
			  {
			     System.out.println("Error");
			  }
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}

