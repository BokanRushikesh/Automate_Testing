package Practice3;

public class StringPalindrome {

	public static void main(String []args){

		   String s = "rotor";
		 
		    String rev = "";


		  for(int i=s.length()-1;i>=0;i--){
		  
		      rev = rev + (s.charAt(i));
		  
		  
		      }
		   if(s.equals(rev)){
		   
		          System.out.println("Given String is Palindrome: " + rev);
		   
		      }
		      else{
			  
			        System.out.println("Given String is not Palindrome: " + rev);
			     }

		  }
			//""
}
