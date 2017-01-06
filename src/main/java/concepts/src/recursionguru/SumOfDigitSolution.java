package concepts.src.recursionguru;

public class SumOfDigitSolution {
	public static void main(String args[]) 
	{ 
		System.out.printf("Sum of digit of number % d using recursion is : %d %n", 343, sumOfDigit(343)); 
		System.out.printf("Sum of digit of using recursion for number %d is : %d %n", 287, sumOfDigit(287));

	}
	public static int sumOfDigit(int input)
	{ 
		return sumOfDigitUsingRecursion(input, 0); 
	} 
	private static int sumOfDigitUsingRecursion(int number, int sum) 
	{ 
		if (number == 0) 
		{ 
			return sum;
		} 

		sum += number % 10; 
		return sumOfDigitUsingRecursion(number / 10, sum); 
	} 
	//second approach
	public static int sum(int n){
		return n==0 ? 0 : n%10+sum(n/10);
	}
} 


