package concepts.src.stringmanipulation;

public class EvenOddReverseUpper {

	public static void main(String [] args){
		String str="This is a test string";
		String finalstr="";
		String arr[]=str.split(" ");
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				arr[i]=arr[i].toUpperCase();

			}
			else
			{
				StringBuffer sb=new StringBuffer(arr[i]);
				StringBuffer temp=sb.reverse();
				String s=new String(temp); //convert string buffer to string 
				arr[i]=s;

			}
		}
		for(int j=0;j<len;j++)
		{
			finalstr=finalstr+" "+arr[j];
		}
		System.out.println(finalstr);

	}
}
