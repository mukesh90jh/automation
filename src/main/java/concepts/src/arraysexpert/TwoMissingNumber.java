/**
 * 
 */
package concepts.src.arraysexpert;

import java.util.Arrays;

/**
 * @author mukesh
 *
 */
public class TwoMissingNumber {

	public static void main(String[] args) {
		int [] array={1,2,5,6};
		 System.out.println("Missing Value:"+Arrays.toString(twoMissing(array)));
	}
	
	public static int[] twoMissing(int []arr){
		int size=arr.length+2;
		long totalSum=size*(size+1)/2;
		long arrSum=0;
		for(int i:arr) arrSum+=i;
		
		int pivot=(int) ((totalSum-arrSum)/2);
		int totalLeftXor=0;
		int totalRightXor=0;
		int arrLeftXor=0;
		int arrRightXor=0;
		
		for(int i=1;i<=pivot;i++){
			totalLeftXor^=i;
		}
		for(int i=pivot+1;i<=size;i++){
			totalRightXor^=i;
		}
		
		for(int i:arr){
			if(i<=pivot) arrLeftXor^=i;
			else
				arrRightXor^=i;
		}
		return new int[]{totalLeftXor ^ arrLeftXor,totalRightXor^arrRightXor};
	}

}
