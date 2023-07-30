package Collection;

public class ReverseSentence2 {
	public static void main(String[] args) {
		
		String A = "I Love India";
		
		String B[] = A.split(" ");
		
		for(int i=B.length-1;i>=0;i--) {
			
			String Str = B[i]+" ";
			
			System.out.print(Str);
		}
		
	}
	
 }
