package concepts.src.arraysexpert;

public class OneMissing {
	/*https://coderanch.com/t/601065/java/java/XOR-java
*/	public static void main(String[] args) {
	int [] array={1,2,4,5};
	 System.out.println("Missing Value:"+oneMissing(array));
	}
	
	public static int oneMissing(int []arr){
		int totalXor=0;
		int arrXor=0;
		for(int i=1;i<=arr.length+1;i++){
			totalXor ^=i;
		}
		for(int i:arr){
			arrXor^=i;
		}
		
		return totalXor^arrXor;
		
	}

}
