package concepts.src.recursionguru;

public class DecimalToBinaryUsingRecursion {
	public static void main(String[] args) throws Exception {
	
		int num = 35;
		decToBin(num);
	}

	public static void decToBin(int n) {
		if (n > 0) {
			decToBin(n / 2);
			int binary=n % 2;
			System.out.println(binary);
		}
	}
}
