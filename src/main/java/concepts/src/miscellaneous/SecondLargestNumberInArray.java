/**
 * 
 */
package concepts.src.miscellaneous;

/**
 * @author mukesh
 *
 */
public class SecondLargestNumberInArray {
	 public static void main(String[] args) {
         int arr[] = { 1,2,3};
         secondLargeNumber(arr);
  }

  public static void secondLargeNumber(int[] arr) {
         int largest = arr[0];
         int secondLargest = arr[0];
         for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= largest) {
                      secondLargest = largest;
                      largest = arr[i];
                     
                } 
                else if (arr[i] >=secondLargest) {
                      secondLargest = arr[i];
                    
                }
         }
         System.out.println("second largest in array is:" + secondLargest);

  }
}

