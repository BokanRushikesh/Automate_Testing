package Practice1;

public class Smallest_Number_from_array {

	public static void main(String[]args){

		 int ar[] = {12,21,34,43,33,44,22,11};

		 int smallest = ar[0];


		  for(int num:ar){
		  
		    if(smallest>num){
			
			
			    smallest = num ;
			
			   }
		  
		  
		    }
		   System.out.println(smallest);


		}
}
