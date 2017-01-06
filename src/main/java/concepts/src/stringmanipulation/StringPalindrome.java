package concepts.src.stringmanipulation;

public class StringPalindrome {

	
	public static void main(String[] args) 
	{
		
       String st="mam";
       
      /* StringBuffer br=new StringBuffer(str).reverse();
       
       String strrev=br.toString();*/
       String str[]=st.split("");
       String reversedSt="";
       for(int i=str.length-1;i>=0;i--){
           reversedSt+=str[i];
       }
       
      if(st.equalsIgnoreCase(reversedSt))
       {
    	   System.out.println("Palindrome");
       }
      else
      {
       System.out.println("Not a Palindrome");
      }
	}

}
