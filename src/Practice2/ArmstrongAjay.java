package Practice2;

public class ArmstrongAjay {

	public static void main(String[] args) {
		
		int num  = 153;
		
		int temp = num ; 
		
		int sum = 0;
		
		while(temp>0) {
			
			int d = temp%10;
			
			sum = sum + (d*d*d);
			
			temp = temp /10;
			
		}
		
		if(sum==num) {
			
			System.out.println("Number is Armstrong : " + num);
			
			
		}
		else {
			
			System.out.println("Number is Not  Armstrong : " + num);
			
		}
		
		
	}
}
//""