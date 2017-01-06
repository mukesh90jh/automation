package concepts.src.arraysexpert;

public class Findingkeyindex {
	public static void main(String[] args) {
		int [] values={1,2,2,2,2,2,3,4,5,6,7,8,9,10};
		int key=2;

		for (int i = 0; i < values.length; i++) {
			if(values[i]==key){
				System.out.println(i);
			}
		}
	}
}
