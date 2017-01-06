package concepts.src.miscellaneous;

public class ConvertIntArrayToIntegerArrays {

	//Convert int[] to Integer[]

	public static Integer[] toConvertInteger(int[] ids) {

		Integer[] newArray = new Integer[ids.length];
		for (int i = 0; i < ids.length; i++) {
			newArray[i] = Integer.valueOf(ids[i]);
		}
		return newArray;
	}
	//Convert Integer[] to int[]

	public static int[] toint(Integer[] WrapperArray) {

		int[] newArray = new int[WrapperArray.length];
		for (int i = 0; i < WrapperArray.length; i++) {
			newArray[i] = WrapperArray[i].intValue();
		}
		return newArray;
	}

public static void main(String[] args) {

}
}
