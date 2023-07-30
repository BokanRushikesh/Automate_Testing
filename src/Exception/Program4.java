package Exception;

public class Program4 {

	public static void main(String[] args) {
		
		int a =20;
		
		int b =0;
		
		
		
		try {
			int c = a/b;
			System.out.println("Test messages");
			
			System.out.println(c);
		
	}
		
		catch(ArithmeticException e) {
			
			System.out.println("Arithmetic exception handled");
		}
		
		System.out.println("End of program");
}
}

//""