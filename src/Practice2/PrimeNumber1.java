package Practice2;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			
			int A=0;
			
			for(int j=2;j<=i-j;j++) {
				
				if(i%j==0) {
					
					A=A+1;
					
					
				}
				
			}
			if(A==0) {
				
				System.out.println(i+" Prime");
				
			}
			else {
				
				System.out.println(i+" Not Prime");
				
			}
		}
		
		
		
		
	}
}
//""