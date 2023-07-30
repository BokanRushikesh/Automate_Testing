package Practice3;

public class String1 {

	public static void main(String[] args) {
		
		String s = "This is java progrma";
		
		int count = 0 ; 
		
		for(int i=0 ; i<=s.length()-1;i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='s') {
				
				count++;
				
			}
			 
		}
		
		System.out.println(count);
	}
}
//"" ''