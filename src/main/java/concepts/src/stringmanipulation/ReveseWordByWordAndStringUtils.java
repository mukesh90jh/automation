package concepts.src.stringmanipulation;

import org.apache.commons.lang3.StringUtils;

public class ReveseWordByWordAndStringUtils {

	public static void main(String[] args) {
		
		String string="Hello World";
		/*String str="mukesh kumar mandal";
		String revString=reverseWordByWord(str);
		System.out.println(revString);
		System.out.println(reverseWords());
		*/
		String[] words = string.split(" ");
		System.out.println(words.length);
        String reverse = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
            System.out.print(reverse + " ");
            reverse = "";

        }
	
	}
	public static String reverseWordByWord(String str){
        int strLeng = str.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }
        return reverse;
    }
	
	public static String reverseWords() {
		String sentence="hi ram";
	    String rev = StringUtils.reverseDelimited(StringUtils.reverse(sentence), ' ');
		return rev;
	}
}
