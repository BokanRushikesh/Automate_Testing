package Collection;

public class ReverseSentence4 {
	
	public static void main(String[] args) {
		
		String S1 = "mahesh playing game on mobile";
		
		String S2[] = S1.split(" ");
		
		for(int i=0;i<S2.length;i++) {
			
			String Str = S2[i]+" ";
			
			System.out.print(Str);
		}
		
		System.out.println(" ");
//		Reverse the sentence
		
		for(int a=S2.length-1;a>=0;a--) {
			
			String Str1 = S2[a]+" ";
			
			System.out.print(Str1);
		}
		
		
		
		
		
	}

}
