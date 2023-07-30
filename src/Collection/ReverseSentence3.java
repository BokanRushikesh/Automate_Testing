package Collection;

public class ReverseSentence3 {
	
	public static void main(String[] args) {
//		Below program use to forword sentence
		
		String A = "i wants to play cricket";
		
		String B[] = A.split(" ");
		
		for(int i=0;i<B.length;i++) {
			
			String Str = B[i]+" ";
			
			System.out.print(Str);
		}
		
	System.out.println(" "); //	take this for move sentence to next line
	
		
		
//		Below program use to reverse sentence
		for(int j=B.length-1;j>=0;j--) {
			
			String Str1 = B[j]+" ";
			
			
			System.out.print(Str1);
		}
		
		
		
		
		
	}
	
	

}
