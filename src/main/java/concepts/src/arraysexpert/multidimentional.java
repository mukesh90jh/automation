package concepts.src.arraysexpert;

public class multidimentional {

	
	public static void main(String[] args) {
		int[][] matrix = {
				  { 1, 2, 3 },
				  { 4, 5, 6 }
				  
				};

				for (int i = 0; i <2; i++) 
				{
				    for (int j = 0; j <3; j++) 
				    {
				        System.out.print(matrix[i][j] + "\t");
				    }
				    System.out.print("\n");
				}
		}
	}


