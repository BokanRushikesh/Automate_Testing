package Practice2;

public class Find_PrimeNUmber_From_Array {
	
	public static void main(String[]args){

		int ar[] = {12,32,13,43,34,7};

		  for(int j=0 ; j<=ar.length-1;j++){
		  
		    int A = 0;
			
			int num = ar[j];
		  
		  for(int i=2;i<=ar.length-1;i++){
		  
		       if(num%i==0){
			   
			        A= A+1;
			   
			      }
		  
		  
		  }
		  
		  if(A==0){
		  
		      System.out.println(num);
		  }
		  }







		}
}
//""