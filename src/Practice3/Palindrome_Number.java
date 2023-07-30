package Practice3;

public class Palindrome_Number {

	public static void main(String[]args){

		int num = 131;

		int temp = num ;

		int rev  = 0;

		while(temp>0){
		   
		    int d = temp%10;
			
			   rev = rev *10 +d ;
			   
			   temp = temp/10;


		   }
//		  System.out.println(rev);

		    if(rev==num){
			
			    System.out.println("Palindrome "+rev);
			
			   }
		      else{
			  
			        System.out.println("Not Palindrome "+rev);
			  
			      }

		    }
		//""
	
	
	
	
	
	
}
