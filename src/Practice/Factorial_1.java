package Practice;

import java.util.Scanner;

public class Factorial_1 {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int no = S.nextInt();
		int fact = 1;
		
		for(int i=1;i<=no;i++) {
			
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
	
	
	
	
	
	
	

}
