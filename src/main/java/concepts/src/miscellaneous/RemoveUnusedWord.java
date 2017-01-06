package concepts.src.miscellaneous;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveUnusedWord {
	public static void main(String[] args) {
		String s= "To be or not to be - that is the question: Whether it is nobler in the mind to suffer, the slings and arrows of outrageous fortune. Or to take up arms against a sea of troubles, and by opposing end them";
		String []st=s.split(" ");
		List<String> ls = new ArrayList<String>();

		HashSet<String >  hst =  new HashSet<String >(); 
		hst.add("a" );
		hst.add("be");
		hst.add("that" );
		hst.add("the" );
		hst.add("this" );
		hst.add( "or" );
		hst.add( "to" );

		for(int i=0;i<st.length;i++){
			if(!hst.contains(st[i]))
				ls.add(st[i].toLowerCase());
		}

		for(String srt:ls){
			System.out.println(srt.toString());


		}

	}


}
