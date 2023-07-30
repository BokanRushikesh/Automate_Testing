package LogicalProgram;

public class Odd_Even_Number_2 {
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<=100;i++) {
			
			if(i%2==0) {
				
				System.out.println("Even Number "+i);
				Thread.sleep(1000);
			}
			else {
				
				System.out.println("Odd Number "+i);
			}
		}
		
		}
	}
// ""