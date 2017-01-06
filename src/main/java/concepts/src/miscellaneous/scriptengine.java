package concepts.src.miscellaneous;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class scriptengine {

	
	public static void main(String[] args) throws ScriptException 
	{
		   ScriptEngineManager factory = new ScriptEngineManager();
		    ScriptEngine engine = factory.getEngineByName("JavaScript");
		   // engine.put("n", n);
		    
		     String script ="50000.3.(Math.pow(12,(1+3)))/((Math.pow(12,(1+3)))-1)";
		     //Number result = (Number) engine.eval(script);
		     System.out.println(engine.eval(script));
		   

	}

}
