package concepts.src.recursionguru;

public class WithoutUsingLoopPrint1to500 {
	int a =1;
    void func()
    { 
        if(a<=500) {
            System.out.println(a++);
        	func();
        }
    }
    
    public static void main( String[] args )
    {
    	WithoutUsingLoopPrint1to500 app=new WithoutUsingLoopPrint1to500();
        app.func();
    }
}
