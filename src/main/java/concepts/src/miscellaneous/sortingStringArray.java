package concepts.src.miscellaneous;

public class sortingStringArray
{
	public static void main(String args[])
	{
	String number[]={"mukesh","anil","ram","sina"};
	int n=number.length;
	System.out.println("given list");
	for(int i=0;i<n;i++)
	{
	System.out.println(""+number[i]);
	}
	for(int i=0;i<n;i++)
	{
	for(int j=i+1;j<n;j++)
	{
	if(number[i].compareTo(number[j])>0)
	{
	String temp=number[j];
	number[j]=number[i];
	number[i]=temp;
	}
	}
	}
	System.out.println("sorted list");
	for(int i=0;i<n;i++)
	{
	System.out.println(""+number[i]);
	}
	System.out.println("");
	}
	}

