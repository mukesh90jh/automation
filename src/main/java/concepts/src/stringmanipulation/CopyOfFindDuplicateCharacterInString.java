/**
 * 
 */
package concepts.src.stringmanipulation;

/**
 * @author mukesh
 *
 */
public class CopyOfFindDuplicateCharacterInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ch="mukeshmuh";
		
		for (int i = 0; i < ch.length(); i++) {
			for (int j = i+1; j < ch.length(); j++) {
				if(ch.charAt(i)==ch.charAt(j)){
					System.out.println("Duplicate element:"+ch.charAt(i));
				}
			}
		}
		
	}
		

}

