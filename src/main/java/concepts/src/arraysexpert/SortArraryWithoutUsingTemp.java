package concepts.src.arraysexpert;

public class SortArraryWithoutUsingTemp {
	
	public static void main(String args[])
	{
		int array[]={9,5,8,2,3};
		int n=array.length;
		for (int c = 0; c < ( n - 1 ); c++) {
			for (int d = 0; d < n - 1; d++) {
				if (array[d] > array[d+1]) 
				{
					array[d]= array[d] +array[d+1];
					array[d+1]=array[d]-array[d+1];
					array[d]=array[d]-array[d+1];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);

		}
	}

}
