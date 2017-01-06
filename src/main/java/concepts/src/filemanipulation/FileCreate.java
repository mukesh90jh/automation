package concepts.src.filemanipulation;

import java.io.File;

public class FileCreate {

	
	public static void main(String[] args) 
	{
		
        File file=new File("D:/FileIO/f1.txt");
        System.out.println("File Name:="+file.getName());
        System.out.println("Path="+file.getPath());
        System.out.println("Parent="+file.getParent());
        System.out.println("Abs Path="+file.getAbsolutePath());
        System.out.println("Read="+file.canRead());
        System.out.println("Write="+file.canWrite());
        System.out.println("File Size="+file.length());
        System.out.println("Last Modified="+file.lastModified());
        System.out.println("IsDirectory="+file.isDirectory());
        
     
        
        
        
        
	}

}
