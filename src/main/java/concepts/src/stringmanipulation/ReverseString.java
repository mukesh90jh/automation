package concepts.src.stringmanipulation;

public class ReverseString{
	public static void main(String[]args){
		reverseString();
		reverserWordFromString();

	}
	
	
	public static void reverseString()
	{
		//This method will reverse string
		String st="Abcxyz";
		String reversedSt="";
		for(int i=st.length()-1;i>=0;i--){
			System.out.print(st.charAt(i));
			reversedSt=reversedSt+st.charAt(i);
		}
		System.out.println("Reversed String is: "+reversedSt);
	}
	
	public static void reverserWordFromString()
	{
		
		 String str[] = "He is the one".split(" ");
		    String finalStr="";
		        for(int i = str.length-1; i>= 0 ;i--){
		            finalStr =finalStr+ str[i]+" ";
		        }
		        System.out.println(finalStr);
		
	}
	
	static void reverse(String string) {

		char[] charArray = string.toCharArray();
		int start = 0 ;
		int end = charArray.length-1 ;

		while(end > start ){

		char ch = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = ch ;

		start++;
		end--;

		}

		System.out.println(new String(charArray).intern());

		}
	

}
