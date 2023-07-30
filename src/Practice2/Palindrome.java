package Practice2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int num = 136;
		
		int temp = num ; 
		
		int rev = 0 ;
		
		
		while(temp>0) {
			
			int d = temp%10;
			
			rev = rev *10 +d;
			
			temp = temp/10;
		}
		
		if(rev==num) {
			
			System.out.println(rev +" palindrome");
			
		}
		else {
			
			System.out.println(rev +" not palindrome");
		}
		
		
		
	}
}
//""