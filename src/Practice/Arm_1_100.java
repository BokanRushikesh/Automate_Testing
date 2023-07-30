package Practice;

public class Arm_1_100 {

	public static void main(String[] args) {
		
		for(int i=1;i<=500;i++) {
			
			int temp = i;
			
			int sum = 0;
			
			while(temp>0) {
				
				int d = temp%10;
				
				sum = sum+(d*d*d);
				
				temp = temp/10;
			}
			
			if(sum==i) {
				
				System.out.println(i);
			}
			
		}
		
		
	}
}
