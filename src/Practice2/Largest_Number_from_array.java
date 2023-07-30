package Practice2;

public class Largest_Number_from_array {

	public static void main(String[]args){

		  int ar[] = {12,32,122,34,43};

		   int largest = ar[0];


		   for(int num:ar){
		   
		       if(largest<num){
			   
			     largest = num;
			   
			   
			      }
		    }
		      System.out.println(largest);

		  }
}
