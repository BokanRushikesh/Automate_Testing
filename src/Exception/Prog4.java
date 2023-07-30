package Exception;

public class Prog4 {

	public static void main(String[] args) {
		
		int a = 23;
		
		int b = 0;
		
		
		
		try {
		
			int c = a/b ;   //  Risky Code
			
			System.out.println(c);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Test Compleate");
		}
		
		System.out.println("End of program");
	}
}
//""