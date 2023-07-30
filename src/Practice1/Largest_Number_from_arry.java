package Practice1;

public class Largest_Number_from_arry {

	public static void main(String[]args){

		int ar[] = {12,32,24,43,33,44};

		int largest = ar[0];

		for(int num:ar){

		   if(largest<num){
		   
		   
		       largest = num ;
		   
		      }
		}
		 System.out.println(largest);

		}
}
