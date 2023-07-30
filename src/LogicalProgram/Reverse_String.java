package LogicalProgram;

public class Reverse_String {
	public static void main(String[] args) {
		
		String S = "Ankit is good boy";
		
		String S1[] = S.split(" ");
		
		for(int i=S1.length-1;i>=0;i--) {
			
			String str = S1[i] + " ";
			
			System.out.print(str);
		}
		
	}
	}
// ""