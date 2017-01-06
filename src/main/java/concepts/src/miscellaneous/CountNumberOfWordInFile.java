package concepts.src.miscellaneous;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumberOfWordInFile {
	public static void main(String[] args) throws IOException {
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //read from keyboard
		int n=Integer.parseInt(br.readLine());*/
		BufferedReader br=new BufferedReader(new FileReader("/home/mukesh/input.txt"));
		String line=null;
		int count=0;
		while((line=br.readLine())!=null){
			count=count+line.split(" ").length;
		}
		System.out.println(count);
	}

}
