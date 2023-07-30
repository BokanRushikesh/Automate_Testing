package Practice;

public class Prime_Number_List_2 {
	
	public static void main(String[] args) {
		
		int A=0;
		
		for(int i=1;i<=100;i++) {
			
			for(int j=2;j<=i-1;j++) {
				
				if(i%j==0) {
					
					A=A+1;
				}
				
			}
			
			if(A==0) {
				
				System.out.println(i);
			}
			else {
				 A=0;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
