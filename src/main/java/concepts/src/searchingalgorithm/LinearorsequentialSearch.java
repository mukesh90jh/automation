package concepts.src.searchingalgorithm;

public class LinearorsequentialSearch 
{
   public void Linearsearch(int [] search,int key)
   {
	  //boolean result=false;
	  for(int i=0;i<search.length;i++)
	  {
		  if(search[i]==key)
		  {
			  //result=true;
			  System.out.println("Key is Searched:: at position:"+i+"and key is:"+key);
		  }
		  //result=false;
		  
	  }
	 //return key;
   }
	
	public static void main(String[] m) 
	{
		LinearorsequentialSearch li=new LinearorsequentialSearch();
		int [] a={1,2,3,4,5,6};
		li.Linearsearch(a,4 );

	}

}
