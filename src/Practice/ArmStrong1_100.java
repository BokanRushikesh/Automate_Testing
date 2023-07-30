package Practice;

public class ArmStrong1_100 {
	
	public static void main(String[] args) {
		
		for(int num=1;num<=100;num++) {
			
			int temp = num ;
			
			int sum = 0;
			
			while(temp>0) {
				
				int d = temp%10;
				
				sum = sum + (d);
				
				temp = temp/10;
				
			}
			if(sum==num) {
				
				System.out.println(num);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
