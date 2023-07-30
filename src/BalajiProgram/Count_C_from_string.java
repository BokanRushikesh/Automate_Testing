package BalajiProgram;

public class Count_C_from_string {

	public static void main(String[] args) {
		
		String s = "Rushieksh";
		
		int count = 0;
		
		for(int i=0;i<=s.length()-1;i++) {
			
			if(s.charAt(i)=='s') {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}
}
//"" ''