package Practice3;

public class ArmstrongNumber {

	public static void main(String[]args){

		  int num = 372;
		  
		  int temp = num ;
		  
		  int sum = 0;
		  
		  while(temp>0){
		  
		       int d = temp%10;
			   
			       sum = sum +(d*d*d);
				   
				   temp = temp/10;
		  
		    }

		    if(sum==num){
			
			        System.out.println("Armstrong "+ num);
			   }
		     else{
			 
			       System.out.println("Not Armstrong "+num);
			     }

		    }
		//""
}
