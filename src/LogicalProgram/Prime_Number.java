package LogicalProgram;

public class Prime_Number {
	
	public static void main(String[] args) {
		
		int num = 8;
		int A = 0;
		
		for (int i=2;i<=num-1;i++)
	{
			if (num%i==0)
			{
				A = A+1;
				
			}
	}		
			if(A==0)
			{
				System.out.println(num + " This is prime number");
			}
			else 
			{
				System.out.println(num + " This is not prime number");
			}
	
		
		
}
	
}
// ""