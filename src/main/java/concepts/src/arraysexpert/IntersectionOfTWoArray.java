/**
 * 
 */
package concepts.src.arraysexpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mukesh
 *
 */
public class IntersectionOfTWoArray {

	public static void main(String[] args) {
		int [] array1={1,2,4,5};
		int [] array2={3,4,5};
		System.out.println("Common value:"+Arrays.toString(commonElement(array1,array2)));
	}

	public static Object[] commonElement(int []a,int []b){

		if(a==null || b==null){
			return null;
		}
		Arrays.sort(a);
		Arrays.sort(b);

		Set<Integer> result=new HashSet<Integer>();
		int i = 0,j=0;
		while(i<a.length &&j<b.length){
			if(a[i]==b[j]){
				result.add(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j]){
				i++;
			}
			else{
				j++;
			}
		}
		return result.toArray();	
	}
}
