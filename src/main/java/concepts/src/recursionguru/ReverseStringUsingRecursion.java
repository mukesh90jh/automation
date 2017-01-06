package concepts.src.recursionguru;

public class ReverseStringUsingRecursion {
	public static void main(String[] args) {
		//EMC2
		reverse("ORACLE", "");

	}
	public static void reverse(String str, String revStr){ 

		if(str.length()!=revStr.length()){
			revStr =revStr+ str.charAt((str.length()-1)-revStr.length()); 
			reverse(str, revStr);
		}
		else{
			System.out.println(revStr);
		}

	}
	
	static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
