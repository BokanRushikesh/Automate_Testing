package Practice3;

public class Largest_number_from_Array {

	public static void main(String[]args){


		  int ar[] = {12,32,13,43,90,0};

		   int smallest = ar[0];

		  for(int num :ar){
		  
		  
		     if(smallest>num){
			 
			 
		        smallest=num;
			 
			 
			 
			   }
		  
		   }

		     System.out.println(smallest);

		   }
}
