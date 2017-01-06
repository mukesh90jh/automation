package concepts.src.recursionguru;

public class FibonacciUsingRecursion {
	public static void main(String [] mukesh){
		FibonacciUsingRecursion rec=new FibonacciUsingRecursion();
		/*int dd = rec.fibonacci(5);
		System.out.println(dd);*/
		int dd = rec.fibo(8);
		System.out.println(dd);
	}

	//Recursion
	public int fibonacci(int n)
	{
		if(n<=1) return 1;
		int fibo=fibonacci(n-1)+fibonacci(n-2);
		return fibo;
	}

	//Iterative
	public int fibo(int n)
	{ 
		int a=1,b=0;
		int c = 0;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		return c;
	}
}
