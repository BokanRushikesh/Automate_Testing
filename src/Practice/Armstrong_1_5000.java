package Practice;

public class Armstrong_1_5000 {

	public static void main(String[] args) {
		
		for(int num=1;num<=5000;num++) {
			
			int temp = num;
			
			int sum=0;
			
			
			while(temp>0) {
				
				int d = temp%10;
				
				sum= sum + (d*d*d);
				
				temp = temp/10;
			}
			
			if(sum==num) {
				
				System.out.println(num);
			}
			
		}

	}

}
