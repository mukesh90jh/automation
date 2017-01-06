package concepts.src.miscellaneous;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Instanceofoperator {

	
	/*The instanceof operator allows you determine the type of an object. 
	It takes an object on the left side of the operator and a type on the right side of the operator 
	and returns a boolean value indicating whether the object belongs to that type or not. */
	
	
	
	
	public static void main(String[] args) {
		Map m = new HashMap();
		System.out.println("m instanceof Map: " + (m instanceof Map));
		System.out.println("m instanceof HashMap: " + (m instanceof HashMap));
		System.out.println("m instanceof Object: " + (m instanceof Object));
		System.out.println("m instanceof Date: " + (m instanceof Date));
		m = null;
		System.out.println("m = null, m instanceof HashMap: " + (m instanceof HashMap));

	}

}
