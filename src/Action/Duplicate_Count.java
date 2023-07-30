package Action;

public class Duplicate_Count {

	public static void main(String[] args) {
		
		String S = "Rushikesh";
		char[] A = S.toCharArray();
		
		for(int i=0;i<S.length();i++) {
			
			for(int j=i+1;j<S.length();j++) {
				
				if(A[i]==A[j])
				{
					System.out.println(A[i]);
					
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
//""