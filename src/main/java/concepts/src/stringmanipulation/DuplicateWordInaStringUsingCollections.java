package concepts.src.stringmanipulation;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateWordInaStringUsingCollections {


	public static void main(String[] args) 
	{

		String s="a b f e a sd g t y uf s a b d x e c ";
		List<String> list = Arrays.asList(s.split(" "));
		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords)
		{
			System.out.println(word + ": " + Collections.frequency(list, word));
		}

	}
}
