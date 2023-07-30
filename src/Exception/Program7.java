package Exception;

public class Program7 {

	public static void main(String[] args) {
		
		int a = 12;
		
		int b =0;
		
		int c ;
		
		try {
			
			c = a/b;
			
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
//""