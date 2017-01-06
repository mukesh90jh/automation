/**
 * 
 */
package concepts.src.arraysexpert;

/**
 * @author mukesh
 *
 */
public class PrintUniqueOrRemoveDuplicateFromArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]arr={5,2,7,2,4,7,8,2,3};
		printDistinctElements(arr);
		/*String []arr1={"m","m","a","b","c","a"};
		printDistinctStringElements(arr1);*/
	}
	
	public static void printDistinctElements(int[] arr){

		for(int i=0;i<arr.length;i++){
			boolean isDistinct = false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					isDistinct = true;
					break;
				}
			}
			if(isDistinct==false){
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
	public static void printDistinctStringElements(String[] arr){

		for(int i=0;i<arr.length;i++){
			boolean isDistinct = false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct){
				System.out.print(arr[i]+" ");
			}
		}		
	}
	/*
	 * Print unique string
	 */        
	//String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};

	/*HashSet<String> set1 = new HashSet<String>();

	for (int arrayElement : strArray)
	{
		if(set1.add(arrayElement))
		{
			System.out.println("Unique Element is : "+arrayElement);
		}
	}*/

}
