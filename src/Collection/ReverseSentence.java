package Collection;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String S2= "india is my country";
	
	    String S3 [] = S2.split(" ");
	
		for(int i=S3.length-1;i>=0;i--) {
	      
			
			String Str = S3[i]+" ";
			
			System.out.print(Str);
			
	}
	
	
	}
}
