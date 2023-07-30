package Practice2;

public class Smallest_Number_from_arry {

	public static void main(String[]args){

		  int ar[] = {21,12,34,43,23,0};

		  int smallest = ar[0];
		   

		  for(int num : ar){
		  
		      if(smallest>num){
			  
			     smallest=num;
			  
			  
			     }
		  
		  
		  
		      }
		       System.out.println(smallest);




		}
}
