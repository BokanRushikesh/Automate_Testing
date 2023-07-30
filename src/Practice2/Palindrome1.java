package Practice2;

public class Palindrome1 {

	public static void main(String[] args) {
		
		int num = 122;
		
		int temp = num ;
		
		int rev = 0 ;
		
		while(temp>0) {
			
			int d = temp%10;
			
			rev = rev *10+d ;
			
			temp = temp/10;
		}
		if(rev==num) {
			
			System.out.println("palindrome " + rev);
			
		}
		
		else {
			System.out.println("not palindrome " + rev);
		}
		
		
		
		
		
		
		
		
	}
}
//""