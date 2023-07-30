package Practice2;

public class Duplicate_Number_from_array {

	public static void main(String[]args){


		  int ar[] = {12,32,12,23,43,89};


		  for(int i=0;i<=ar.length-1;i++){
		  
		      for(int j = i+1 ; j<=ar.length-1;j++){
			  
			        if(ar[i]==ar[j]){
					
					    System.out.println(ar[j]);
					
					  }
			   }
		  
		   }

		   }
}
