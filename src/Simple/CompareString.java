package Simple;

public class CompareString {
	public static void main(String[] args) {
		
		String S1 = "Rushi";
		
		String S2 = "Rushi";
		
		System.out.println(S1==S2);  // it compare only object
		System.out.println(S1.equals(S2));
		
		
		String S3 = new String ("Rushi");
		
		String S4 = new String ("Rushi");
		
		System.out.println(S3==S4);
		System.out.println(S3.equals(S4)); // it is use to content comparision
	}
	
	
	
	
	
	

}
