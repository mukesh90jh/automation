package concepts.src.pattern;

public class Arr {

	public static void main(String[] args) {

		try{
			System.out.println("Hello"+""+1/0);
		}
		catch(ArithmeticException e){
			System.out.println("World");

		}
	}

}
