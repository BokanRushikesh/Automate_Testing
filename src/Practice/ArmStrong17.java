package Practice;

public class ArmStrong17 {

	public static void main(String[] args) {
		
		int num = 153;
		
		int temp = num;
		
		int sum = 0;
		
		while(temp>0) {
			
			int d = temp%10;
			
			sum = sum + (d*d*d);
			
			temp= temp/10;
			
		}
		
		if(sum==num) {
			
			System.out.println(num +" Armstrong" );
		}
				
		else {
			
			System.out.println(num +" Not Armstrong" );
		}
		
		
		}
	
	}
// ""