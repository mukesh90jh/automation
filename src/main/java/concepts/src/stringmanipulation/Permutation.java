/**
 * 
 */
package concepts.src.stringmanipulation;

import java.util.ArrayList;

/**
 * @author mukesh
 *
 */
public class Permutation {

	
	public static void main(String[] args) {
		/*prefix="";
		suffix="abc";
		permutions("a","bc");
		permutions("b","ac");*/
		ArrayList<String> results=new ArrayList<String>();
		permutations("", "abc", results);
		System.out.println(results.toString());
	}
	
	private static void permutations(String prefix,String suffix,ArrayList<String> result){
		if(suffix.length()==0){
			result.add(prefix);
		}
		else{
			for(int i=0;i<suffix.length();i++){
				permutations(prefix+suffix.charAt(i), suffix.substring(0, i)+suffix.substring(i+1, suffix.length()), result);
			}
		}
	}

}
