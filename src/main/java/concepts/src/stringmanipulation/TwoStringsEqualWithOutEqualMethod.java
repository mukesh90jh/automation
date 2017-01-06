package concepts.src.stringmanipulation;

public class TwoStringsEqualWithOutEqualMethod {
	
	public static int isTwoStringsEqual(String s1,String s2) 
	{ 
		int count = 0; 
		for( int i = 0 ; i < s1.length() ;i++ ) 
		{ 
			count = count+s1.charAt(i)^s2.charAt(i); 
		} 
		return count; 
	} 
	public static void main(String[] args) 
	{ 
		String s1 = "abcd"; 
		String s2 = "abcd"; 
		boolean flag = isTwoStringsEqual(s1, s2) == 0 ? true : false; 
		System.out.println(flag); 
	} 
}
