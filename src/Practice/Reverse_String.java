package Practice;

public class Reverse_String {
	public static void main(String[]args){

		String S = "I am reading Book";

		String S1[] = S.split(" ");

		for(int i=S1.length-1;i>=0;i--)

		{
		 String Str = S1[i] + " ";


		 System.out.print(Str);
		}


		}
}
