package concepts.src.miscellaneous;

public class primenowithinrange {

	
	
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=10;i<30;i++) //here you can give your own range
		{
		         k=0;
		         for(j=2;j<i;j++)
		         {
		              if(i%j==0)
		                 k++;
		         }
		         if(k==0)
		         System.out.print(i+"   ");
		}
       
	}

}


/*for (i=1; i < num; i++ ){
    int j;
    for (j=2; j<i; j++){
        int n = i%j;
        if (n==0){
            break;
        }
    }
    if(i == j){
        System.out.print("  "+i);
    */