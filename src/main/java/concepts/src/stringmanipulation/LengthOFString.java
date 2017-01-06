package concepts.src.stringmanipulation;

public class LengthOFString {

	public static void main(String[] args) {
		LengthOFString ls=new LengthOFString();
		System.out.println(ls.length("Mukesh"));

	}
	
	public int length(String s) {
		int i = 0;
		try {
			for (;;i++)
				s.charAt(i);
		} catch (Exception e) {
			
		}
		return i;
	}
}
