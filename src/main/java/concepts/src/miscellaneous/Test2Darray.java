package concepts.src.miscellaneous;

public class Test2Darray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[][] multiD = {{ 1, 2, 3,},{ 5, 6, 7 }};
		for(int i=0;i<=multiD.length;i++)
		{
			for(int j=0;j<=multiD.length;j++)
			{
			    System.out.println("The element at [0][2] is " + multiD[i][j]);	
			}
		}
		

	}

}
