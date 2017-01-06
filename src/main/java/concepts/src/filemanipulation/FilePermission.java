package concepts.src.filemanipulation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.LineNumberReader;

public class FilePermission {

	public static void main(String[] args)
	{
	 	
		try {
			 
		      File file = new File("D:\\FileIO\\newfile.txt");
		      
		      //LineNumberReader is used to read the no of line in file
		      System.out.println("Is Execute allow : " + file.canExecute());
			  System.out.println("Is Write allow : " + file.canWrite());
			  System.out.println("Is Read allow : " + file.canRead());
		      
	 
		      file.setExecutable(true);
		      file.setReadable(false);  //assign permission to file
		      file.setWritable(false);
	 
		      System.out.println("Is Execute allow : " + file.canExecute());
		      System.out.println("Is Write allow : " + file.canWrite());
		      System.out.println("Is Read allow : " + file.canRead());
		      
		      String str="hi mukesh";
		      byte[] by=str.getBytes();
		      FileOutputStream fs=new FileOutputStream(file);
		      fs.write(by);
	 
	 
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
	 
	    	} catch (IOException e) {
		      e.printStackTrace();
		}
	}

}
