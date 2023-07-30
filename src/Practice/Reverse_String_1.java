package Practice;

public class Reverse_String_1 {
	 public static void main(String[]args){


		    String S = "i live in pune";

		    String S1[] = S.split(" ");

		     for(int i=S1.length-1;i>=0;i--){

		       String Str = S1[i] + " ";

		   System.out.print(Str);
		}







		}
}
