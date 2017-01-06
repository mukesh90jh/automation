package concepts.src.arraysexpert;

import java.util.Arrays;

public class Combine2ArrayOfDifferentLength 
{
	
	public  int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
	}
    public static void main(String[] args) 
	{
	 Combine2ArrayOfDifferentLength cm=new Combine2ArrayOfDifferentLength();
	 int a[]={1,2,3,4,5};
	 int b[]={1,3,4};
	 cm.combine(a, b);
	 System.out.println(Arrays.toString(cm.combine(a, b)));

	}

  }

