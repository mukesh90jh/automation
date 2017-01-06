package concepts.src.arraysexpert;

import java.util.Arrays;

public class TwoArrayAddition {
	public static void main(String []args){
		int[] number1 = {2,4,6};
		int[] number2 = {1,2,5};

		int[] res = adda(number1,number2);
		System.out.println(Arrays.toString(res));
	}

	public static int[] add(int[] first, int[] second) 
	{ 
		int[] result = new int[first.length];
		for (int i = 0; i < first.length; i++) 
		{ 
			result[i] = first[i] + second[i];
		} 
		return result; 
	}

	public static int[] adda(int[] number1, int[] number2) 
	{ 
		int carry = 0, sum = 0;

		int[] result = new int[number1.length];
		for (int i = number1.length - 1; i >= 0 ; i--) {
			sum = number1[i] + number2[i] + carry;
			result[i] = sum%10;
			carry = sum/10;
		}
		System.out.println(Arrays.toString(result));
		return result;  
	}
}



