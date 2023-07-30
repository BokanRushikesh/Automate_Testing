package Practice3;

public class ReverseNumber {

	public static void main(String[]args){

		int num = 4321;

		int rev = 0;

		while(num>0){

		    int d = num%10;
			
			 rev = rev *10 +d ;
			 
			 num = num /10;

		  }

		  System.out.println(rev);

		  }
	
	
	
}
