package concepts.src.arraysexpert;

public class ReplaceSpaceWith20 {

	public static void main(String[] args) {
		String str="Java is Great"; 
		String result="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				result=result+"%20";
			}
			else
             result=result+str.charAt(i);
		}
		 System.out.println(result);

	}

}
