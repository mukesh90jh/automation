package concepts.src.stringmanipulation;

public class AddTwoStringOfDifferentLength {
	
	public static void main(String[] args) {
		String s1="abc";
		String s2="defg";
		String s3="";
		for (int i = 0 ; i < s1.length() || i < s2.length() ; i++) {
			if (i < s1.length()) {
				s3+= s1.charAt(i);
			}
			if (i < s2.length()) {
				s3+= s2.charAt(i);
			}
		}
		System.out.println(s3);

	}
}

