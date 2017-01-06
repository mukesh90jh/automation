package concepts.src.miscellaneous;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class fibo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
      /* int a,b,c,n;
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter a No.");
		n=Integer.parseInt(br.readLine());
       a=0;
       b=1;
       System.out.println(a);
       System.out.println(b);
       for(int i=0;i<=n;i++)
       {
    	   c=a+b;
    	   System.out.println(c);
    	   a=b;
    	   b=c;
       }*/
       fibonacci(8);
       
	}
	 public static void fibonacci(int n)
	 {
	   int a=0,b=1;
	   for(int i=0;i<n;i++)
	   {
	     System.out.print(a+", ");
	     a=a+b;
	     b=a-b;
	   }
	 }

}
