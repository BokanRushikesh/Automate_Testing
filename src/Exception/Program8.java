package Exception;

public class Program8 {

	public static void main(String[] args) {
		

		      String S = null;
		try {
			
			System.out.println(S.length());
			
			System.out.println("Riskey code");
			
		}
		
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("handled arithmetic exception");
		}
		
		catch(NullPointerException e) {
			
			e.printStackTrace();
			
			System.out.println("handled null pointer exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
			System.out.println("handled out of bond exception");
		}
		
		catch(Exception e){
			
			System.out.println("handled  exception");
		}
		
		System.out.println("End Program");
	}
}
