package concepts.src.stringmanipulation;

public class StringReplace {

	
	public static void main(String[] args) {
		String sampleString="Bob love lucky, not";
		System.out.println("Before:"+sampleString);
		sampleString=sampleString.replaceAll("not", "").replaceAll(",", ".");
		System.out.println("After:"+sampleString);
		
		sampleString="x12y34z0hjhj";
		
		//sampleString=sampleString.replaceAll("[^a-zA-Z]", "");
		sampleString=sampleString.replaceAll("[^0-9]", "");

		System.out.println("Number:"+sampleString);
		
		/*String ch="mmmuukeeshh";
		System.out.println(ch.replace("m", ""));*/

		
		
	   
		
		

	}

}
