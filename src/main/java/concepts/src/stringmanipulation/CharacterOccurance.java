package concepts.src.stringmanipulation;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "aaabbccaaaad";
        String result = "";
        int count = 1;
        for (int i = 0; i<str.length(); i++) {
                if (i<str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    result = result + str.charAt(i)+ count;
                    count = 1;
                }
        }
        System.out.println(result);
	
	}

}
