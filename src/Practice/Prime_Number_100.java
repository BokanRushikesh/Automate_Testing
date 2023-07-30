package Practice;

public class Prime_Number_100 {
	
	public static void main(String[] args) {
		
		int num = 499;
		
		int A=0;
		
		for(int i=2;i<=num-1;i++ )
		{
			if(num%i==0) {
				
				A = A+1;
			}
			
		}
		if(A==0) {
			
			System.out.println(num + " Prime");
		}
		else {
			System.out.println(num + " Not Prime");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
//""