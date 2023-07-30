package Exception;

public class Program9 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,7,8,9};
		
		try {
			
			System.out.println(arr[7]);
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
		finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("End Program");

	}

}
//""