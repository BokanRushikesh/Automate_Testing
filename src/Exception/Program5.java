package Exception;

public class Program5 {

	public static void main(String[] args) {
		
		String S = null;
		
		try {
			
			System.out.println(S.length());
			
			System.out.println("risky code");
		}
		
		catch(NullPointerException e) {
			
			System.out.println("Nullpointerexception execute code");
		}
		
		System.out.println("End the program");
	}
}
//""