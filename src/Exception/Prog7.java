package Exception;

public class Prog7 {

	public static void main(String[] args) {
		
		int a = 12;
		
		int b = 0;
		
		try {
			
			int c = a/b;
			
		}
		catch(ArithmeticException e){
			
			e.printStackTrace();
			System.out.println("Arithmetic exception handled ");
		}
		
         catch(NullPointerException e){
			
        	 e.printStackTrace();
			System.out.println("Null pointer exception handled");
		}
		
           catch(ArrayIndexOutOfBoundsException e)
		{
			
        	   e.printStackTrace();
			System.out.println("Array index exception handled ");
		}
		
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Generic exception handled ");
		}
		
		System.out.println("End Program");
	}
}
//""