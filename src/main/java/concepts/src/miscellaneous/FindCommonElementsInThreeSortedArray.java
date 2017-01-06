/**
 * 
 */
package concepts.src.miscellaneous;

/**
 * @author mukesh
 *
 */
public class FindCommonElementsInThreeSortedArray {


	public static void main(String[] args) {
		 int[] arr1 =  {1, 5, 10, 20, 40, 80};
	        int[] arr2 = {6, 7, 20, 80, 100};
	        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2.length;j++){
	                if(arr1[i]==arr2[j]){
	                   // System.out.println(arr1[i]);
	                }
	            }
	        }
	        
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr3.length;j++){
	                if(arr1[i]==arr3[j]){
	                    System.out.println(arr1[i]);
	                }
	            }
	        }

	}

}
