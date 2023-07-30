package Practice;

public class Reverse_Number_1 {

	public static void main(String[] args) {
		
		int num = 12345;
		
		int rev = 0;
		
		while(num>0) {
			
			int d = num%10;
			
			rev = rev*10+d;
			
			num = num/10;
			
			
		}
		
		System.out.println(rev);
		
		
		
		
		
		
	}
}
