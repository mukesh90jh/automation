package concepts.src.miscellaneous;

public class DecimalToBinary {

	 public void printBinaryFormat(int number){
	        int binary[] = new int[5];
	        //int index = 0;
	        while(number > 0){
	        	for(int i=0;i<binary.length;i++)
	        	{
	            binary[i] = number%2;
	            number = number/2;
	        }
	        }
	        for(int i =binary.length-1;i >= 0;i--){
	            System.out.print(binary[i]);
	        }
	    }
	     
	    public static void main(String a[]){
	        DecimalToBinary dtb = new DecimalToBinary();
	        dtb.printBinaryFormat(20);

	}

}
