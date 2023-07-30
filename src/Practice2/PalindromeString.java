package Practice2;

public class PalindromeString {

	public static void main(String[] args) {
		
		String name  = "Sachin";
		
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev = rev + name.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		if(name.equals(rev)) {
			
			System.out.println("Given String is palindrome : "+ rev );
			
		}
		
		else {
			
			System.out.println("Given String is Not palindrome : "+ rev );
		}
		
	}
}
//""