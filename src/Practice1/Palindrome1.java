package Practice1;

public class Palindrome1 {

	public static void main(String[] args) {
		
		int num = 676;
		
		int temp = num ;
		
		int rev = 0;
		
		while(temp>0) {
			
			int d = temp%10;
			
			rev = (rev *10) +d;
			
			temp = temp/10;
		}
		if(rev==num) {
			
			System.out.println(num+" Palindrome");
			
		}
		else{
			
			System.out.println(num+" Not Palindrome");
		}
		
		
	}
}
//""