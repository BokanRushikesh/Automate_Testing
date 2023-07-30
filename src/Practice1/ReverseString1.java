package Practice1;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String S = "Ajay is Good Boy";
		
		String S1[] = S.split(" ");
		
		for(int i=S1.length-1;i>=0;i--) {
			
			String str = S1[i] + " ";
			
			System.out.print(str);
			
		}
		
		
		
	}
	
	
	
	
	
}
//""