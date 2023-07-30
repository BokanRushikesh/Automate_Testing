package Exception;

public class Prog5 {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			
			
			System.out.println(s.length());
			
		}
		
		catch(NullPointerException e){
			
			System.out.println("Execute program");
			   
		}
		
		
		System.out.println("End Program");
		
		
		
	}
}
//""