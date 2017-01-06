package concepts.src.arraysexpert;


public class RemoveDuplicate {

	public static void main(String[] args) {
		//int[] arr={-1,3,-2,4,2,5,-5,-1,5,6,5};
		int[] arr={1,2,3,3,4,4,5,3};

		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[size-1];
					size--;
				}
			}
		}

		for(int a=0;a<size;a++)
		{
			System.out.print(arr[a]+" ");
		}


	}

}
