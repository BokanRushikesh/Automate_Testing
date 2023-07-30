package FromMaven;

public class NumberPalindrome3 {

	public static void main(String[] args) {
		
		int num = 123321;
		
		int temp = num;
		
		int rev =0;
		
		while(temp>0) {
			
			int d = temp%10;
			
			rev = rev*10+d;
			
			temp= temp/10;
			
			
		}
		
		if(rev==num) {
			
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not paindrome");
		}
	}
}
