package concepts.src.miscellaneous;

public class ConsecutiveChars {

	public static void main(String[] args) {
		String input = "aaabbccaaaad";
		System.out.println("input = " + input);
		countConsecutiveChars(input);
		System.out.println("**********************");
		usingToCharArray();
		}
		public static void countConsecutiveChars(String input) {
		int count = 1;
		String inputUpper = input.toUpperCase();
		System.out.println("inputUpper = " + inputUpper);

		String output = "";
		int size = inputUpper.length();
		for(int index=0; index < size; index++) {
		if ((index != (size-1)) && (inputUpper.charAt(index) == inputUpper.charAt(index+1))) {
		count++;
		output = output+input.charAt(index);
		} else {
		output = output+input.charAt(index)+(count);
		count = 1;
		}
		}
		System.out.println("output = " + output);
		} 
		
		
		//second Approach
		public static void usingToCharArray()
		{
			 String str = "bbSBSS";
			    str=str.toUpperCase();
			    StringBuilder outputstr = new StringBuilder("");
			    str=str.toUpperCase();
			    System.out.println(str);
			    char [] strB= str.toCharArray();		    
				int count = 1;
				for(int i = 0;i<strB.length;i++) {
					char c=strB[i];
					System.out.println("value of i"+ i);
					if (i < strB.length-1 && strB[i]== strB[i+1])   // if i= strB.length-1  means last digit reached. terminate and enter else
					{
						count++;
						System.out.println("consecutive");
					}
					else {
						outputstr=outputstr.append(c).append(count);
						count = 1;					
					}
				}
				System.out.println(outputstr.toString());
			}
		}
	


