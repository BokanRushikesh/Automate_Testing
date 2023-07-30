package Practice3;

public class PrimeNumber1to30 {

	public static void main(String[]args){


		for(int i=1;i<=30;i++){

		  int A = 0;
		  
		  for(int j=2;j<=i-j;j++){
		  
		       if(i%j==0){
			   
			           A = A+1;
			       }
		       }

		      if(A==0){
		   
			          System.out.println("Prime " + i);
			      }
		         else{
				       System.out.println("Not Prime " + i);
				 
				     }



		}
		
	}
}
