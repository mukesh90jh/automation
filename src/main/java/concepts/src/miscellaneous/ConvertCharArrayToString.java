package concepts.src.miscellaneous;

public class ConvertCharArrayToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		char[] charArr = { 'w', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 't', 'o',
                ' ', 'j', 'a', 'v', 'a', '1', '1', 's' };

               String str = new String(charArr);
               System.out.println("converted String is:" + str);

               /*String str1 = String.valueOf(charArr);
               System.out.println("covnverted String is:" + str1);*/ 

	}

}
