package concepts.src.stringmanipulation;

public class StringMatches 
{
    
	public static void main(String[] args) 
	{
	  String str="Niagara. O7roar again!";
	  int ch=str.indexOf("o");  //char
	  System.out.println(ch);
       
	  int string=str.indexOf("g",4);
	  System.out.println(string);
	 String lower= str.toLowerCase();
	 System.out.println(lower);
	 boolean match = str.matches("Niagara. O7roar again!");
	 if(match)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("Fails");
		}
	 boolean contain = str.contains("again");
	if(contain)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("Fails");
	}
	}

}
